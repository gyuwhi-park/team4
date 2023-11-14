package com.team4.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.dao.BoardDAO;
import com.team4.domain.BoardVO;

@Service("boardSerivce")
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardDAO boardDAO;

	@Override
	public Integer insertBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("BoardServiceImpl >> getBoardList");
		return boardDAO.getBoard(vo);
	}

	@Override
	public List<BoardVO> getBoardList(HashMap map) {
		System.out.println("BoardServiceImpl >> getBoardList");
		return boardDAO.getBoardList(map);
	}

	@Override
	public List<BoardVO> getMyBoardList(HashMap map) {
		System.out.println("BoardServiceImpl >> getMyBoardList");
		return boardDAO.getMyBoardList(map);
	}
	
}
