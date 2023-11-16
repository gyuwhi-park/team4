package com.team4.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.team4.common.Security;
import com.team4.domain.BoardVO;
import com.team4.domain.ReviewVO;
import com.team4.domain.UserVO;
import com.team4.service.BoardService;
import com.team4.service.ReviewService;
import com.team4.service.UserService;

@Controller
@RequestMapping("admin/board")
public class AdminBoardController {
	
	@Autowired
	private BoardService boardService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ReviewService reviewService;
	
	@RequestMapping("/{step}")
	public String viewPage(@PathVariable String step, HttpSession session) {
		System.out.println("load page : "+step);
		return "admin/board/"+step;
	}
	
	@RequestMapping("/boardContent")
	public void boardContent(BoardVO vo, Model m, HttpSession session) {
		System.out.println("AdminBoardController >> boardContent");
		System.out.println(vo.toString());
		BoardVO result = boardService.getBoard(vo);
		System.out.println("AdminBoardController >> boardContent / result : "+result);
		m.addAttribute("board", result);
		
		UserVO uvo = new UserVO();
		uvo.setUser_idx(result.getUser_idx());
		UserVO uResult = userService.getUser(uvo);
		m.addAttribute("user", uResult);
		
//		return Security.adminStateCheck(session, "admin/board/boardContent");
	}
	
	@RequestMapping("/postManage")
	public void postManage(Model m, HttpSession session) {
		List<BoardVO> result = boardService.getBoardList(null);
		m.addAttribute("boardList", result);
		
		List<ReviewVO> rResult = reviewService.getReviewList(null);
		m.addAttribute("reviewList", rResult);
	}
}
