package com.team4.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.team4.domain.CartVO;
import com.team4.domain.MarkVO;
import com.team4.domain.ProductVO;
import com.team4.domain.UserVO;
import com.team4.service.BrandService;
import com.team4.service.CartService;
import com.team4.service.MarkService;
import com.team4.service.ProductService;
import com.team4.service.UserService;
import com.team4.service.VisitorService;

@Controller
@RequestMapping("main")
public class MainController {

	@Autowired
	private UserService userService;

	@Autowired
	private ProductService productService;

	@Autowired
	private BrandService brandService;

	@Autowired
	private VisitorService visitorService;

	@Autowired
	private CartService cartService;
	
	@Autowired
	private MarkService markService;
	
	@RequestMapping("/{step}")
	public String viewPage(@PathVariable String step) {
		System.out.println("load page : " + step);
		return "main/" + step;
	}

	@RequestMapping("/mainpage")
	public void mainPage(Model m, ProductVO pvo, HttpSession session) {

		 
		 ProductVO product = productService.getMainProduct(pvo);
		 System.out.println("ProductController >> getMainProduct : " + product);
		 m.addAttribute("productList", product);

	}
	
	// 장바구니 클릭시 삽입 
	@ResponseBody
	@RequestMapping("/insertMainCart")
	public String insertMainCart(HttpSession session, CartVO vo) {
		
		System.out.println("insertMainCart >> vo : " + vo);
		Integer cResult = cartService.insertMainCart(vo);
		System.out.println("insertCart >> cResult: " + cResult);
	      
		if(cResult == 1) {
			return "Success";
		} else {
			return "Fail";
		}
		
		
	}
	
	// 하트 클릭시 삽입
	
	@ResponseBody
	@RequestMapping("/insertMainMark")
	public String insertMainMark(HttpSession session, MarkVO vo) {
		System.out.println("insertMainCart >> vo : " + vo);
		Integer result = markService.insertMainMark(vo);
		System.out.println("insertCart >> cResult: " + result);
	      
		if(result == 1) {
			return "Success";
		} else {
			return "Fail";
		}
		
	}
}