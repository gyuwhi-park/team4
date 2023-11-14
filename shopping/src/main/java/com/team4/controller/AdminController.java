package com.team4.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.team4.common.Security;
import com.team4.domain.BrandVO;
import com.team4.domain.Div1VO;
import com.team4.domain.Div2VO;
import com.team4.domain.Div3VO;
import com.team4.domain.UserVO;
import com.team4.domain.VisitorVO;
import com.team4.service.BrandService;
import com.team4.service.Div1Service;
import com.team4.service.Div2Service;
import com.team4.service.Div3Service;
import com.team4.service.UserService;
import com.team4.service.VisitorService;

@Controller
@RequestMapping("admin")
public class AdminController {

	@Autowired
	private UserService userService;	
	@Autowired
	private VisitorService visitorService;
	
	@RequestMapping("/{step}")
	public String viewPage(@PathVariable String step, HttpSession session) {
		System.out.println("load page : "+step);
		System.out.println("session : "+session.getAttribute("admin"));
//		return Security.adminStateCheck(session, "admin/"+step);
		return "admin/"+step;
	}
	
	@RequestMapping("/login")
	public String adminLogin(HttpSession session) {
		System.out.println("session : "+session.getAttribute("admin"));
//		return Security.adminStateCheck(session, "admin/"+step);
		if (session.getAttribute("admin") == "관리자") {
			return "redirect:adminMain";
		} else {
			return "admin/login";
		}
	}
	
	@RequestMapping("/logout")
	public String adminLogout(HttpSession session) {
		session.removeAttribute("admin");
		return "redirect:/admin/login";
	}

	@RequestMapping("/adminMain")
	public String adminIdCheck(UserVO vo, HttpSession session) {
//		System.out.println("AdminController >> adminIdCheck "+vo.toString());
		UserVO result = userService.getUser(vo);
//		System.out.println("AdminController >> adminIdCheck >> result : "+result);
		if(result == null) {
			return "redirect:/admin/login";
		} else {
			//방문자 수 증가
//			System.out.println("AdminController >> adminIdCheck");
			Integer uResult = visitorService.updateVisitor(null);
//			System.out.println("AdminController >> adminIdCheck >> result : "+uResult);

			//오늘 날자 방문자 수 레코드 생성
			if(uResult == 0) {
				System.out.println("AdminController >> adminIdCheck");
				Integer iResult = visitorService.insertVisitor(null);
				System.out.println("AdminController >> adminIdCheck >> result : "+iResult);
			}
			session.setAttribute("admin", "관리자");
			session.setMaxInactiveInterval(-1);
			return "admin/adminMain";
		}
	}
}
