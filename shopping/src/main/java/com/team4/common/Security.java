package com.team4.common;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;

//@RequestMapping("/")
public class Security {
	
	private static boolean adminLoginState = false;
	private static boolean userLoginState = false;
	
	public static String userStateCheck(HttpSession session, String url) {
		if(session.getAttribute("user_id") != null) {
			userLoginState=true;
		}		
		if(userLoginState) {
			//성공시 이동할 주소
			return url;
		} else {
			return "login";
		}
	}
	
	public static String adminStateCheck(HttpSession session, String url) {
		if(session.getAttribute("user_id") != null) {
			adminLoginState=true;
		}	
		if(adminLoginState) {
			return url;
		} else {
			return "admin/login"; 
		}
	}
}
