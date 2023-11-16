package com.team4.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.team4.domain.PurchaseVO;
import com.team4.service.PurchaseService;

@Controller
@RequestMapping("admin/purchase")
public class AdminPurchaseController {
	
	@Autowired
	private PurchaseService purchaseService;
	
	@RequestMapping("/{step}")
	public String viewPage(@PathVariable String step) {
		System.out.println("load page : "+step);
		return "admin/purchase/"+step;
	}
	
	@RequestMapping("/inquire")
	public void adminPurchaseInquire(String fromDate, String toDate, Model m) {
		HashMap map = new HashMap();
		map.put("fromDate", fromDate);
		map.put("toDate", toDate);
		List<PurchaseVO> result = purchaseService.getPurchaseList(map);
		m.addAttribute("purchaseList", result);
	}
}
