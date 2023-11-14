package com.team4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.team4.domain.CartVO;
import com.team4.service.CartService;

@Controller
@RequestMapping("cart")
public class CartController {

	@Autowired
	private CartService cartService;
		
	@RequestMapping("/{step}")
	public String viewPage(@PathVariable String step) {
		System.out.println("load page : "+step);
		return step;
	}
	
	
	@RequestMapping("/cartPage")
	public String insertCart(CartVO vo) {
		System.out.println("load page");
		return "cart/cartPage";
	}
	
	
	@RequestMapping("/cartPageNext")
	public void cartPage(CartVO vo) {
		System.out.println("CartController >> cartPage");
		System.out.println(vo.toString());
		cartService.insertCart(vo);
	}
}
