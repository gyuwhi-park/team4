package com.team4.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.team4.service.ProductService;
import com.team4.service.PurchaseService;
import com.team4.service.SecessionService;
import com.team4.service.UserService;
import com.team4.domain.ProductVO;
import com.team4.domain.PurchaseVO;
import com.team4.domain.SecessionVO;
import com.team4.domain.UserVO;

@Controller
@RequestMapping("admin/user")
public class AdminUserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private PurchaseService purchaseService;
	
	@Autowired
	private SecessionService secessionService;
	
	@RequestMapping("/{step}")
	public String viewPage(@PathVariable String step) {
		System.out.println("load page : "+step);
		return "admin/user/"+step;
	}
	
	@RequestMapping("/inquire")
	public void userInquire(Model m) {
		List<UserVO> result = userService.getUserList(null);
		m.addAttribute("userList", result);
	}
	
	@RequestMapping("/userManage")
	public void userManage(UserVO vo, Model m) {
		UserVO uResult = userService.getUser(vo);
		if(uResult == null) {
			m.addAttribute("secession", "비회원");
			return;
		}
		m.addAttribute("user", uResult);
		
		SecessionVO svo = new SecessionVO();
		svo.setUser_idx(vo.getUser_idx());
		SecessionVO sResult = secessionService.getSecession(svo);
		
		if(sResult == null) {
			m.addAttribute("secession", "회원");
		} else {
			m.addAttribute("secession", "탈퇴");
		}
		
		HashMap map = new HashMap();
		map.put("user_idx", vo.getUser_idx());
		List<PurchaseVO> pResult = purchaseService.getPurchaseList(map);
		m.addAttribute("productList", pResult);
	}
}
