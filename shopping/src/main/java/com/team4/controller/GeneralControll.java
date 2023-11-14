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
import org.springframework.web.bind.annotation.ResponseBody;

import com.team4.common.Security;
import com.team4.domain.AccessVO;
import com.team4.domain.AddressVO;
import com.team4.domain.BrandVO;
import com.team4.domain.CartVO;
import com.team4.domain.Div1VO;
import com.team4.domain.Div2VO;
import com.team4.domain.Div3VO;
import com.team4.domain.ProductVO;
import com.team4.domain.PurchaseVO;
import com.team4.domain.SearchVO;
import com.team4.domain.UserVO;
import com.team4.service.AccessService;
import com.team4.service.AddressService;
import com.team4.service.BrandService;
import com.team4.service.CartService;
import com.team4.service.Div1Service;
import com.team4.service.Div2Service;
import com.team4.service.Div3Service;
import com.team4.service.ProductService;
import com.team4.service.PurchaseService;
import com.team4.service.SearchService;
import com.team4.service.UserService;

@Controller
@RequestMapping("/")
public class GeneralControll {

   @Autowired
   private BrandService brandService;

   @Autowired
   private Div1Service div1Service;

   @Autowired
   private Div2Service div2Service;

   @Autowired
   private Div3Service div3Service;

   @Autowired
   private ProductService productService;

   @Autowired
   private UserService userService;

   @Autowired
   private AccessService accessService;

   @Autowired
   private SearchService searchService;

   @Autowired
   private CartService cartService;
   
   @Autowired
   private AddressService addressService;
   
   @Autowired
   private PurchaseService purchaseService;

   @RequestMapping("/{step}")
   public String viewPage(@PathVariable String step) {
      System.out.println("load page : " + step);
      return "" + step;
   }

   @RequestMapping("/login")
   public String loginPage(HttpSession session) {
      if (session.getAttribute("user_id") != null) {
         return "redirect:mypage/mypage";
      } else {
         return "login";
      }
   }

   @RequestMapping("/logout")
   public String logoutPage(HttpSession session) {
      session.removeAttribute("user_id");
      session.removeAttribute("user_idx");
      return "main/mainpage";
   }

   @RequestMapping("/loginCheck")
   public String loginCheckPage(String user_id, String user_pass, Model m, HttpSession session) {
      UserVO vo = new UserVO();
      vo.setUser_id(user_id);
      vo.setUser_pass(user_pass);
      System.out.println("GeneralControll >> loginPage / UserVO : " + vo);
      UserVO result = userService.getUser(vo);
      System.out.println("GeneralControll >> loginPage / result : " + result);
      if (result == null) {
         return "login";
      } else {
         m.addAttribute(result);
         session.setAttribute("user_id", user_id);
         session.setAttribute("user_idx", result.getUser_idx());
         session.setMaxInactiveInterval(-1);

         AccessVO avo = new AccessVO();
         avo.setUser_idx(result.getUser_idx());
         accessService.insertAccess(avo);

         System.out.println("user_id : " + (String) session.getAttribute("user_id"));
         System.out.println("user_idx : " + (Integer) session.getAttribute("user_idx"));

         return "main/mainpage";
      }
   }

   @RequestMapping("/search")
   public void searchPage(String keyword, Model m, HttpSession session) {
      if (keyword != null) {
         HashMap map = new HashMap();
         map.put("keyword", keyword);
         System.out.println("keyword : " + map.toString());
         System.out.println("SearchController >> searchPage");

         List<BrandVO> bResult = brandService.getBrandList(map);
         System.out.println("SearchController >> searchPage /bresult : " + bResult);

         List<Div1VO> result1 = div1Service.getDiv1List(map);
         System.out.println("SearchController >> searchPage /result1 : " + result1);

         List<Div2VO> result2 = div2Service.getDiv2List(map);
         System.out.println("SearchController >> searchPage /result2 : " + result2);

         List<Div3VO> result3 = div3Service.getDiv3List(map);
         System.out.println("SearchController >> searchPage /result3 : " + result3);

         List<ProductVO> pResult = productService.getProductList(map);
         System.out.println("SearchController >> searchPage /pResult : " + pResult);

         m.addAttribute("brandList", bResult);
         m.addAttribute("div1List", result1);
         m.addAttribute("div2List", result2);
         m.addAttribute("div3List", result3);
         m.addAttribute("productList", pResult);
         m.addAttribute("keyword", keyword);

         SearchVO svo = new SearchVO();
         svo.setSearch_content(keyword);
         Integer user_idx = null;
         if (session.getAttribute("user_idx") != null) {
            user_idx = (Integer) session.getAttribute("user_idx");
            svo.setUser_idx(user_idx);
         }
         //         System.out.println("SearchController >> searchPage / svo : "+svo.toString());
         Integer sResult = searchService.insertSearch(svo);
         //         System.out.println("SearchController >> searchPage /sResult : "+sResult);

         HashMap sMap = new HashMap();
         if (user_idx != null) {
            sMap.put("user_idx", user_idx);
            List<SearchVO> sMResult = searchService.getSearchList(sMap);
            m.addAttribute("searchHistory", sMResult);
         }
      }
   }

   @RequestMapping("/purchase")
   public void purchase(String cart, Model m, HttpSession session) {
      System.out.println("cart : "+cart);
      String[] cartList = cart.split("a");
      List<CartVO> prePurchaseList = new ArrayList();

      for(String purchase : cartList) {
         CartVO vo = new CartVO();
         vo.setCart_idx(Integer.parseInt(purchase));
//         System.out.println("GeneralControll >> purchase / vo : "+vo.toString());
         CartVO result = cartService.getCart(vo);
//         System.out.println("GeneralControll >> purchase / result : "+result);
         prePurchaseList.add(result);
      }
      
      UserVO uvo = new UserVO();
      uvo.setUser_idx((Integer)session.getAttribute("user_idx"));
      System.out.println("uvo : "+uvo.toString());
      UserVO uResult = userService.getUser(uvo);
      System.out.println("uResult : "+uResult);
      
      AddressVO avo = new AddressVO();
      avo.setUser_idx(uvo.getUser_idx());
      AddressVO aResult = addressService.getAddress(avo);
      System.out.println("aResult : "+aResult);
      
      m.addAttribute("prePurchaseList", prePurchaseList);
      m.addAttribute("userInfo", uResult);
      m.addAttribute("userAddress", aResult);
   }
      
   @RequestMapping("/getUserInfo")
   @ResponseBody
   public UserVO getUserInfo(UserVO vo) {
      System.out.println("-----------------getUserInfo-----------------");
      System.out.println("GeneralControll >> getUserInfo");
      UserVO result = userService.getUser(vo);
      System.out.println("GeneralControll >> getUserInfo / result : "+result);
      return result;
   }
   
   @RequestMapping("/insertPurchase")
   @ResponseBody
   public String insertPurchase(PurchaseVO vo) {
      System.out.println("-----------------insertPurchase-----------------");
      System.out.println("GeneralControll >> insertPurchase / vo : "+vo.toString());
      Integer result = purchaseService.insertPurchase(vo);
      System.out.println("GeneralControll >> insertPurchase / result : "+result);
      if (result == 1) {
         return "OK";
      } else {
         return "No";
      }
   }
   
   @RequestMapping("/deleteCart")
   @ResponseBody
   public String deleteCart(CartVO vo) {
      System.out.println("-----------------deleteCart-----------------");
      System.out.println("GeneralControll >> deleteCart / vo : "+vo.toString());
      Integer result = cartService.deleteCart(vo);
      System.out.println("GeneralControll >> deleteCart / result : "+result);
      if (result == 1) {
         return "OK";
      } else {
         return "No";
      }
   }
   
}