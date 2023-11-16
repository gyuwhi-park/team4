package com.team4.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.team4.domain.AccessVO;
import com.team4.domain.PurchaseVO;
import com.team4.domain.VisitorVO;
import com.team4.service.AccessService;
import com.team4.service.PurchaseService;
import com.team4.service.VisitorService;

@Controller
@RequestMapping("admin/statistics")
public class AdminStatisticsController {

	@Autowired
	private VisitorService visitorService;
	
	@Autowired
	private AccessService accessService;

	@Autowired
	private PurchaseService purchaseService;

	@RequestMapping("/{step}")
	public String viewPage(@PathVariable String step) {
		System.out.println("load page : "+step);
		return "admin/statistics/"+step;
	}

	@RequestMapping("accessAnalysis")
	public List<AccessVO> adminStaticsAccess(Model m) {
		//		System.out.println("AdminStatcsController >> adminStaticsAccess");
		List<AccessVO> result = accessService.getAccessList(null);
		//		System.out.println("AdminStatcsController >> adminStaticsAccess / result : "+result);
		m.addAttribute("accessList", result);
		return result;
	}

	@RequestMapping("getVisitorStatic")
	@ResponseBody
	public List<VisitorVO> getVisitorStatic(String pre, String post){
		//		System.out.println("AdminStatcsController >> getVisitorStatic");
		//		System.out.println("pre : "+pre +"/ post : "+post);
		HashMap map = new HashMap();
		map.put("pre", pre);
		map.put("post", post);
		List<VisitorVO> result = visitorService.getVisitorList(map);
		//		System.out.println("AdminStatcsController >> getVisitorStatic / result : "+result);
		return result;
	}

	@RequestMapping("salesAnalysis")
//	@ResponseBody
	public void salesAnalysis(String fromDate, String toDate, String sort, Model m){
		HashMap map = new HashMap();
		map.put("fromDate",fromDate);
		map.put("toDate", toDate);
		map.put("sort", sort);
		System.out.println("AdminStatcsController >> salesAnalysis");
		System.out.println(map.toString());
		List<PurchaseVO> result = purchaseService.getPurchaseList(map);
		System.out.println("AdminStatcsController >> salesAnalysis / result : "+result);
		m.addAttribute("purchaseStatics", result);
		//		return result;
	}
	
	@RequestMapping("productAnalysis")
	public void productAnalysis(Model m){
		System.out.println("AdminStatcsController >> productAnalysis");
		List<VisitorVO> result = visitorService.getVisitorList(null);
		System.out.println("AdminStatcsController >> productAnalysis / result : "+result);
		m.addAttribute("accessList", result);
		//		return result;
	}
}
