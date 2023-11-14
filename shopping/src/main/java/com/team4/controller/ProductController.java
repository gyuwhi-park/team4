package com.team4.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.team4.domain.AddressVO;
import com.team4.domain.CartVO;
import com.team4.domain.ColorVO;
import com.team4.domain.Div3VO;
import com.team4.domain.ImageVO;
import com.team4.domain.MarkVO;
import com.team4.domain.ProductVO;
import com.team4.domain.PurchaseVO;
import com.team4.domain.ReviewVO;
import com.team4.domain.SizeVO;
import com.team4.domain.UserVO;
import com.team4.domain.VisitorVO;
import com.team4.service.AddressServiceImpl;
import com.team4.service.CartServiceImpl;
import com.team4.service.ColorServiceImpl;
import com.team4.service.Div3ServiceImpl;
import com.team4.service.ImageServiceImpl;
import com.team4.service.MarkServiceImpl;
import com.team4.service.ProductServiceImpl;
import com.team4.service.PurchaseServiceImpl;
import com.team4.service.ReviewServiceImpl;
import com.team4.service.SizeServiceImpl;
import com.team4.service.UserServiceImpl;
import com.team4.service.VisitorServiceImpl;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private UserServiceImpl userService;

	@Autowired
	private ProductServiceImpl productService;
	
	@Autowired
	private ImageServiceImpl imageService;
	
	@Autowired
	private MarkServiceImpl markService;
	
	@Autowired
	private CartServiceImpl cartService;
	
	@Autowired
	private PurchaseServiceImpl purchaseService;
	
	@Autowired
	private AddressServiceImpl addressService;
	
	@Autowired
	private ReviewServiceImpl reviewService;
	
	@Autowired
	private Div3ServiceImpl div3Service;
	
	@Autowired
	private VisitorServiceImpl visitorService;
	
	@Autowired
	private ColorServiceImpl colorService;
	
	@Autowired
	private SizeServiceImpl sizeService;

	
	@RequestMapping("/{step}.do")
	public String viewPage(@PathVariable String step) {
		System.out.println("load page : " + step);
		return "product/" + step;
	}
	

	// 상세페이지 이동
	@RequestMapping("/product-detail")
	public void getImageList(Model m, ProductVO pvo, HttpSession session, ReviewVO rvo) {
		
		// ###### product 정보 가져오기 ######
		ProductVO product = productService.getProduct(pvo);
		System.out.println("ProductController >> getProduct : " + product);
		m.addAttribute("productList", product);

		// ###### product 이미지 가져오기 ######
		String product_idx = product.getProduct_idx();
		System.out.println("load page : product-detail");
		System.out.println(product_idx);
		
		HashMap map = new HashMap(); 
		map.put("product_idx", product_idx);
		List<ImageVO> imgResult = imageService.getImageList(map);
		System.out.println("ProductController >> getImageList : " + imgResult);
		m.addAttribute("imageList", imgResult);

		
		//####### product 분류 #######
		String div3_idx = product.getDiv3_idx();
		System.out.println("ProductController >> div3_idx : " + div3_idx);
		Div3VO divVO = new Div3VO();
		divVO.setDiv3_idx(div3_idx);
		System.out.println("divVO : " + divVO);
		Div3VO divResult = div3Service.getDiv3(divVO);
		System.out.println("ProductController >> getDiv3 : " + divResult);
		m.addAttribute("divResult", divResult);
		

		// ###### product 컬러, 사이즈 가져오기 #######//
		
		HashMap CMap = new HashMap();
		CMap.put("product_idx", product_idx);
		List<ColorVO> CResult = colorService.getColorList(CMap);
		System.out.println("ProductController >> CResult : " + CResult);
		m.addAttribute("colorList", CResult);
		
		HashMap SMap = new HashMap();
		SMap.put("product_idx", product_idx);
		List<SizeVO> SResult = sizeService.getSizeList(SMap);
		System.out.println("ProductController >> SResult : " + SResult);
		m.addAttribute("sizeList", SResult);
		
		// ###### product 컬러, 사이즈 가져오기 #######//
        /*
		List<ProductVO> result = productService.getProductList(map);
        System.out.println("map : " + map);
        System.out.println("ProductController >> getProductList : " + result);
        
        List<String> colorList = new ArrayList<String>();
        List<String> sizeList = new ArrayList<String>();
        
        for(ProductVO vo : result){
        	System.out.println("vo : " + vo);
            String idx = vo.getProduct_idx();
            colorList.add(idx.substring(8,11));
            sizeList.add(idx.substring(11,13));
            
            Set<String> uniqueColors = new HashSet<String>(colorList);
            Set<String> uniqueSizes = new HashSet<String>(sizeList);
            
            colorList.clear();
            sizeList.clear();
            
            colorList.addAll(uniqueColors);
            sizeList.addAll(uniqueSizes);
            System.out.println("colorList : "+colorList);
            System.out.println("sizeList : "+sizeList);
        }
        
        HashMap<String, String> colorNameMap = new HashMap<String, String>();

        for (String colorIdx : colorList) {
            if (!colorNameMap.containsKey(colorIdx)) {
                List<ColorVO> CResult = colorService.getColorList(colorIdx);
                System.out.println("CResult : " + CResult);
                if (!CResult.isEmpty()) {
                    // CResult에서 color_name을 가져와서 colorNameMap에 저장
                    colorNameMap.put(colorIdx, CResult.get(0).getColor_name());
                }
            }
        }
        System.out.println("colorNameMap : " + colorNameMap);
        
        m.addAttribute("colorNameMap", colorNameMap);
        m.addAttribute("sizeList", sizeList);
		*/
		
		
		// ####### mark 정보 가져오기 ########
		Object obj = session.getAttribute("user_idx");
		
		if(obj != null) {
			Integer userIdx = (Integer)obj;
			
			MarkVO markVO = new MarkVO();
			markVO.setProduct_idx(product_idx);
			markVO.setUser_idx(userIdx);
			System.out.println("ProductController >> markVO : " + markVO );
			MarkVO markResult = markService.getMark(markVO);
			System.out.println("ProductController >> markResult : " + markResult);
			
			// 굳이 true/false 작업을 안해도 된다.
			m.addAttribute("markResult", markResult);
			
		} else {
			m.addAttribute("notlogin", true);
		}
		
		
		//####### 리뷰정보 가져오기 ######
		Integer userIdx = (Integer)obj;
		HashMap rMap = new HashMap();
		rMap.put("product_idx", product_idx);
		rMap.put("user_idx", userIdx);
		System.out.println("ProductController >> rMap : " + rMap);
		List<ReviewVO> reviewResult = reviewService.getReviewList(rMap);
		System.out.println("ProductController >> getReviewList : " + reviewResult);
		if(reviewResult.isEmpty()) {
			m.addAttribute("notList", true);
		} else {
			m.addAttribute("reviewList", reviewResult);
		}
		
		//####### 방문자 수 #######
		VisitorVO visitorVO = new VisitorVO();
		visitorVO.setProduct_idx(product_idx);
		System.out.println("ProductController >> visitorVO : " + visitorVO);
		Integer vResult = visitorService.updateVisitor(visitorVO);
		System.out.println("ProductController >> vResult : " + vResult);
		if(vResult == 0) {
			Integer visitorResult = visitorService.insertVisitor(visitorVO);
			System.out.println("ProductController >> visitorResult : " + visitorResult);			
		}
		
	}
	
	//빈 하트 클릭 시
	@ResponseBody
	@RequestMapping("/insertMark")
	public String insertMark(@RequestParam("product_idx") String productIdx, @RequestParam("user_idx") int userIdx) {
		
		// markVO에 적용
		MarkVO markVO = new MarkVO();
		markVO.setUser_idx(userIdx);
		markVO.setProduct_idx(productIdx);
		
		Integer mResult = markService.insertMark(markVO);
		
		if(mResult == 1) {
			return "Success";
		} else {
			return "Fail";
		}
		
	}
	
	//채워진 하트 클릭 시
	@ResponseBody
	@RequestMapping("/deleteMark")
	public String deleteMark(@RequestParam("product_idx") String productIdx, @RequestParam("user_idx") int userIdx) {
		
		// markVO에 적용
		MarkVO markVO = new MarkVO();
		markVO.setUser_idx(userIdx);
		markVO.setProduct_idx(productIdx);
		
		Integer mResult = markService.deleteMark(markVO);
		
		if(mResult == 1) {
			return "Success";
		} else {
			return "Fail";
		}
	}
	
	//장바구니 버튼 눌렀을 때
	@ResponseBody
	@RequestMapping("/insertCart")
	public String insertCart(@RequestParam("product_idx") String productIdx, @RequestParam("user_idx") int userIdx, @RequestParam("cart_count") int cartCount, @RequestParam("color_name") String colorName, @RequestParam("size_val") String sizeVal) {
		
		// color_idx 가져오기
		ColorVO color = new ColorVO();
		color.setColor_name(colorName);
		color.setProduct_idx(productIdx);
		System.out.println("color : " + color);
		
		ColorVO color_idx = colorService.getColor(color);
		int colorIdx = color_idx.getColor_idx();
		System.out.println("colorIdx : " + colorIdx);
		
		// size_idx 가져오기
		SizeVO size = new SizeVO();
		size.setSize_val(sizeVal);
		size.setProduct_idx(productIdx);
		
		SizeVO size_idx = sizeService.getSize(size);
		int sizeIdx = size_idx.getSize_idx();		
		
		// cartVO에 적용
		CartVO cartVO = new CartVO();
		cartVO.setUser_idx(userIdx);
		cartVO.setProduct_idx(productIdx);
		cartVO.setCart_count(cartCount);
		cartVO.setColor_idx(colorIdx);
		cartVO.setSize_idx(sizeIdx);
		System.out.println("cartVO : " + cartVO);

		Integer cResult = cartService.insertCart(cartVO);
		System.out.println("insertCart >> cResult: " + cResult);
	      
		if(cResult == 1) {
			return "Success";
		} else {
			return "Fail";
		}
	      
	}
	
	//바로구매 버튼 눌렀을 때
	@RequestMapping("/insertPurchase")
	public void insertPurchase(@RequestParam("product_idx") String productIdx, @RequestParam("product_name") String productName, @RequestParam("user_idx") int userIdx, @RequestParam("purchase_count") int purchaseCount, @RequestParam("purchase_price") String purchasePrice, @RequestParam("color_name") String colorName, @RequestParam("size_val") String sizeVal, HttpSession session) {
			
		// 쉼표 제거 및 정수로 변환
		String cleanedParam = purchasePrice.replace(",", "");
		int purchase_price = Integer.parseInt(cleanedParam);	
		
		UserVO uvo = new UserVO();
		uvo.setUser_idx((Integer)session.getAttribute("user_idx"));
		System.out.println("uvo : "+uvo.toString());
		UserVO uResult = userService.getUser(uvo);
		System.out.println("uResult : "+uResult);
		
		
		AddressVO avo = new AddressVO();
		avo.setUser_idx(uvo.getUser_idx());
		AddressVO aResult = addressService.getAddress(avo);
		System.out.println("aResult : "+aResult);
			
		// PurchaseVO에 적용
		PurchaseVO purchaseVO = new PurchaseVO();
		purchaseVO.setUser_idx(userIdx);
		purchaseVO.setProduct_idx(productIdx);
		purchaseVO.setProduct_name(productName);
		purchaseVO.setPurchase_count(purchaseCount);
		purchaseVO.setPurchase_price(purchase_price);
		purchaseVO.setColor_name(colorName);
		purchaseVO.setSize_val(sizeVal);
		
		Integer cResult = purchaseService.insertPurchase(purchaseVO);
		
	}
	
	// 리뷰 등록버튼 눌렀을 때
	@ResponseBody
	@RequestMapping("/insertReview")
	public String insertReview(@RequestParam("product_idx") String productIdx, @RequestParam("user_idx") int userIdx, @RequestParam("review_score") int reviewScore, @RequestParam("review_content") String reviewContent) {
	      
		// cartVO에 적용
		ReviewVO reviewVO = new ReviewVO();
		reviewVO.setUser_idx(userIdx);
		reviewVO.setProduct_idx(productIdx);
		reviewVO.setReview_score(reviewScore);
		reviewVO.setReview_content(reviewContent);
		System.out.println("ProductController >> reviewVO : " + reviewVO );

		Integer cResult = reviewService.insertReview(reviewVO);
		System.out.println("ProductController >> insertReview : " + cResult );
	      
		if(cResult == 1) {
			return "Success";
		} else {
			return "Fail";
		}
	      
	}
	
	// 리뷰 삭제버튼 눌렀을 때
	@ResponseBody
	@RequestMapping("/deleteReview")
	public String deleteReview(@RequestParam("product_idx") String productIdx, @RequestParam("user_idx") int userIdx, @RequestParam("review_idx") int reviewIdx) {
	      
		// cartVO에 적용
		ReviewVO reviewVO = new ReviewVO();
		reviewVO.setUser_idx(userIdx);
		reviewVO.setProduct_idx(productIdx);
		reviewVO.setReview_idx(reviewIdx);
		System.out.println("ProductController >> reviewVO : " + reviewVO );

		Integer cResult = reviewService.deleteReview(reviewVO);
		System.out.println("ProductController >> deleteReview : " + cResult );
	      
		if(cResult == 1) {
			return "Success";
		} else {
			return "Fail";
		}
	      
	}
	
	
	// 결제 완료 페이지
	@RequestMapping("/product_purchase")
	public void getPurchaseList(Model m, HttpSession session) {
		Integer userIdx = (Integer) session.getAttribute("user_idx");
		
		HashMap map = new HashMap();
		map.put("user_idx", userIdx);
		
		List<PurchaseVO> purchaseList = purchaseService.getUserPurchaseList(map);
		m.addAttribute("purchaseList", purchaseList);
		
	}
	

	
}
