package com.team4.controller;


import java.util.ArrayList;
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
import com.team4.domain.BoardVO;
import com.team4.domain.BrandVO;
import com.team4.domain.CartVO;
import com.team4.domain.MarkVO;
import com.team4.domain.ProductVO;
import com.team4.domain.PurchaseVO;
import com.team4.domain.ReviewVO;
import com.team4.domain.UserVO;
import com.team4.service.AddressService;
import com.team4.service.BoardService;
import com.team4.service.CartService;
import com.team4.service.ColorService;
import com.team4.service.MarkService;
import com.team4.service.ProductService;
import com.team4.service.PurchaseService;
import com.team4.service.ReviewService;
import com.team4.service.SizeService;
import com.team4.service.UserService;

@Controller
@RequestMapping("mypage")
public class MypageController {

	@Autowired
	private UserService userService;

	@Autowired
	private ReviewService reviewService;

	@Autowired
	private PurchaseService purchaseService;

	@Autowired
	private BoardService boardService;

	@Autowired
	private AddressService addressService;

	@Autowired
	private MarkService markService;
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CartService cartService;
	
	@Autowired
	private ColorService colorService;
	
	@Autowired
	private SizeService sizeService;

	@RequestMapping("/{step}.do")
	public String viewPage(@PathVariable String step) {
		return "mypage/" + step;
	}

// 마이페이지(상품평 수, 상품 Q&A 제목 등록일별)
	@RequestMapping("/mypage")
	public void mypageBoard(ReviewVO vo, Model model, String review_content, String review_date, ProductVO pvo, UserVO uvo, BoardVO bvo,
			@RequestParam(value = "page", required = false, defaultValue = "1") int page) {
		
	
		
		// purchase 주문 수 
		List<PurchaseVO> pResult = purchaseService.getPurchaseCount(null);
		  if (pResult == null) 
		  { model.addAttribute("purchaseCount", 0); }
		  else if(pResult.size() !=0) 
		  { model.addAttribute("purchaseCount", pResult.get(pResult.size() - 1)); }
		 

		// review 상품평 수
		List<ReviewVO> rResult = reviewService.getReviewCount(null);
		if (rResult == null) {
			model.addAttribute("reviewCount", 0);
		}else if (rResult.size() != 0 ) {
			model.addAttribute("reviewCount", rResult.get(rResult.size() - 1));
		}

		// 상품Q&A 최신것만
		
		 List<BoardVO> result = boardService.getBoardList(null); if (result == null) {
		 model.addAttribute("qaResult",0); }else if (result.size() != 0) {
		 model.addAttribute("qaResult", result.get(result.size() - 1)); }
		 
		 model.addAttribute("user_idx", vo.getUser_idx()); 
			/*
			 * HashMap map = new HashMap(); map.put("review_content", review_content);
			 * map.put("review_date", review_date); List<ReviewVO> review =
			 * reviewService.getMyReviewList(map); model.addAttribute("reviewList", review);
			 */
		
	    List<BoardVO> bResult = boardService.getMyBoardList(null);
	    System.out.println("MypageController >> getMyBoardList :" + bResult);
	    model.addAttribute("getMyBoardList", bResult);
	    
	    int pagingSize = 3;
        int sectorSize = 3;
        List<Integer> numList = new ArrayList<Integer>();
        List<BoardVO> pagingList = new ArrayList<BoardVO>();
        int length = (page*pagingSize > result.size()) ? result.size() : page*pagingSize ;
        for(int i=(page-1)*pagingSize; i<length ;i++) {
           pagingList.add(result.get(i));
        }
        if(pagingList.size() != 0) {
           System.out.println("getMyBoardList.size = "+pagingList.size());           
        } else {
           System.out.println("getMyBoardList.size = 0 입니다");
        }
        
        int prevMax = ((page-1)/pagingSize)*pagingSize;
        int nextMin = ((page-1)/pagingSize+1)*pagingSize+1;
        int lastPage = result.size()%pagingSize > 0 ?  result.size()/pagingSize + 1 : result.size()/pagingSize;
        for(int i=prevMax+1;i<=prevMax+sectorSize;i++) {
           numList.add(i);
        }
        
        
        System.out.println("pagingList 값 확인하시오 "+pagingList); 
        model.addAttribute("boardList",pagingList);
        model.addAttribute("numList", numList);
        model.addAttribute("prevMax", prevMax < 1 ? 1 : prevMax);
        model.addAttribute("nextMin", nextMin > lastPage ? lastPage : nextMin);
        model.addAttribute("lastPage", lastPage);
		 
        
	} 

// 주문 조회페이지 이동
	@RequestMapping("/orderlist")
	public void myOrderList(  String fromDate, String toDate, Model model, ProductVO pvo, UserVO vo, AddressVO avo,
			@RequestParam(value = "page", required = false, defaultValue = "1") int page) {
		
		 // 기간별 주문목록 
        HashMap map = new HashMap(); 
        map.put("fromDate", fromDate);
        map.put("toDate",toDate); 
        map.put("pvo", pvo);
        map.put("vo", vo);
        map.put("avo", avo);
        System.out.println(map.toString());
        List<PurchaseVO> result = purchaseService.getDateList(map);
        System.out.println("MypageController >> myOrderList / result" + result);
        model.addAttribute("dateList", result);
        
        // 해당 페이지에서 보여줄 글 목록(페이징) System.out.println("page 값 확인하시오 " + page);
     //   List<PurchaseVO> pagingList = purchaseService.pagingList(page);
        int pagingSize = 3;
        int sectorSize = 3;
        List<Integer> numList = new ArrayList<Integer>();
        List<PurchaseVO> pagingList = new ArrayList<PurchaseVO>();
        int length = (page*pagingSize > result.size()) ? result.size() : page*pagingSize ;
        for(int i=(page-1)*pagingSize; i<length ;i++) {
           pagingList.add(result.get(i));
        }
        if(pagingList.size() != 0) {
           System.out.println("dateList.size = "+pagingList.size());           
        } else {
           System.out.println("dateList.size = 0 입니다");
        }
        
        int prevMax = ((page-1)/pagingSize)*pagingSize;
        int nextMin = ((page-1)/pagingSize+1)*pagingSize+1;
        int lastPage = result.size()%pagingSize > 0 ?  result.size()/pagingSize + 1 : result.size()/pagingSize;
        for(int i=prevMax+1;i<=prevMax+sectorSize;i++) {
           numList.add(i);
        }
        
        
        System.out.println("pagingList 값 확인하시오 "+pagingList); 
        model.addAttribute("purchaseList",pagingList);
        model.addAttribute("numList", numList);
        model.addAttribute("prevMax", prevMax < 1 ? 1 : prevMax);
        model.addAttribute("nextMin", nextMin > lastPage ? lastPage : nextMin);
        model.addAttribute("lastPage", lastPage);
   }
	
	@RequestMapping("getPurchaseDetail")
	@ResponseBody
	public PurchaseVO myOrderList(PurchaseVO vo) {
		System.out.println("ajax /-----------------------------------------------------");
		System.out.println(vo.toString());
		
		return purchaseService.getPurchase(vo);

	}

	@RequestMapping("/mypage_inquire")
	public void myInquire() {

	}

	// 탈퇴사유 페이지 이동
	@RequestMapping("/resign")
	public void myResign() {

	}

	// 회원 탈퇴페이지 이동
	@RequestMapping("/resigncheck")
	public void myResignCheck() {

	}
 
	@RequestMapping("/wishlist")
	public void myWishlist(MarkVO vo, Model model, UserVO uvo, ProductVO pvo, BrandVO bVo,
			@RequestParam(value = "page", required = false, defaultValue = "1") int page, HttpSession session) {
		
		Integer user_idx = (Integer)session.getAttribute("user_idx");
		
		// product 정보 가져오기
		ProductVO product = productService.getMainProduct(pvo);
		System.out.println("MypageController >> getMainProduct :" + product);
		model.addAttribute("productList", product);
		
		// 위시리스트 목록 보기
		  HashMap map = new HashMap(); 
		  map.put("vo",vo);
		  map.put("uvo", uvo);
		  map.put("pvo", pvo);
		  map.put("bVo", bVo);
		  List<MarkVO> result = markService.getMarkList(map);
		  System.out.println("MypageController >> wishlist / result"+result);
		  model.addAttribute("wishlist", result);
		  
		  
		  int pagingSize = 3;
	        int sectorSize = 3;
	        List<Integer> numList = new ArrayList<Integer>();
	        List<MarkVO> pagingList = new ArrayList<MarkVO>();
	        int length = (page*pagingSize > result.size()) ? result.size() : page*pagingSize ;
	        for(int i=(page-1)*pagingSize; i<length ;i++) {
	           pagingList.add(result.get(i));
	        }
	        if(pagingList.size() != 0) {
	           System.out.println("wishlist.size = "+pagingList.size());           
	        } else {
	           System.out.println("wishlist.size = 0 입니다");
	        }
	        
	        int prevMax = ((page-1)/pagingSize)*pagingSize;
	        int nextMin = ((page-1)/pagingSize+1)*pagingSize+1;
	        int lastPage = result.size()%pagingSize > 0 ?  result.size()/pagingSize + 1 : result.size()/pagingSize;
	        for(int i=prevMax+1;i<=prevMax+sectorSize;i++) {
	           numList.add(i);
	        }
	        
	        
	        System.out.println("pagingList 값 확인하시오 "+pagingList); 
	        model.addAttribute("wishList",pagingList);
	        model.addAttribute("numList", numList);
	        model.addAttribute("prevMax", prevMax < 1 ? 1 : prevMax);
	        model.addAttribute("nextMin", nextMin > lastPage ? lastPage : nextMin);
	        model.addAttribute("lastPage", lastPage);
		  
	        ProductVO myProduct = productService.getMyProduct(pvo);
			System.out.println("ProductController >> getProduct : " + myProduct);
		    model.addAttribute("wishProductList", myProduct);
	     
	        
	        
	}
	
	@RequestMapping("/exitUser.do")
	public String exitUser() {
		// 탈퇴했을때 메인페이지 이동
		return "redirect:main.do";
	}
	
	@RequestMapping("/mainpage.do")
	public void mainPage() { 
		
	}
	
	// add to cart 버튼 클릭시
	@ResponseBody 
	@RequestMapping("/insertMyCart")
	public String insertMyCart(HttpSession session, CartVO vo) {
		
		System.out.println("insertMyCart >> vo : " + vo);
		Integer cResult = cartService.insertMyCart(vo);
		System.out.println("insertMyCart >> cResult: " + cResult);
	      
		if(cResult == 1) {
			return "Success";
		} else {
			return "Fail";
		}
	} 
	
	@RequestMapping("/cart")
	public void myCart(HttpSession session, Model m) {
		HashMap map = new HashMap();
		map.put("user_idx", session.getAttribute("user_idx"));
		List<CartVO> result = cartService.getCartList(map);
		m.addAttribute("cartList", result);
	}
	
	@RequestMapping("/addressInput")
	public String addressInput(HttpSession session, AddressVO vo, Model m) {
		vo.setUser_idx((Integer)session.getAttribute("user_idx"));
		System.out.println("MypageController >> addressInput / vo : "+vo.toString());
		Integer result = addressService.insertAddress(vo);
		System.out.println("MypageController >> addressInput / result : "+result);
		return "redirect:addresses";
	}
	
	@RequestMapping("/addresses")
	public void addressInput(HttpSession session, Model m) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("user_idx", (Integer)session.getAttribute("user_idx"));
		System.out.println("MypageController >> addressInput / map : "+map.toString());
		List<AddressVO> result = addressService.getAddressList(map);
		System.out.println("MypageController >> addressInput / result : "+result);
		m.addAttribute("addressList", result);
	}
}
