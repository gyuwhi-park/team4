package com.team4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.team4.domain.UserVO;
import com.team4.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/{step}")
	public String viewPage(@PathVariable String step) {
		System.out.println("load page : "+step);
		return "user/"+step;
	}
	
	@RequestMapping("/register")
	public String saveUser(UserVO vo) {
		System.out.println("UserController >> saveUser");
		System.out.println(vo.toString());
		userService.insertUser(vo);
		return "redirect:../main/mainpage";
	}
	
	@RequestMapping("/userIdCheck")
	@ResponseBody
	public String userIdCheck(UserVO vo) {
		System.out.println("UserController >> userIdCheck vo / "+vo.getUser_id());
		UserVO result = userService.getUser(vo);
		if(result == null) {
			System.out.println("UserController >> userIdCheck result / null");
			return "Available";
		} else {
			System.out.println("UserController >> userIdCheck result / "+result.getUser_id());
			return "Not_Available";
		}
	}
}
