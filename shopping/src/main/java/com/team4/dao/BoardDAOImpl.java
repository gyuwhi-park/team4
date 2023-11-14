package com.team4.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.domain.BoardVO;
import com.team4.domain.BrandVO;
import com.team4.domain.UserVO;

@Repository("boardDAO")
public class BoardDAOImpl implements BoardDAO{

	@Autowired
	private SqlSessionTemplate mybatis;

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
		BoardVO result = mybatis.selectOne("BoardDAO.getBoard", vo);
		return result;
	}

	@Override
	public List<BoardVO> getBoardList(HashMap map) {
		System.out.println("BoardDAOImpl >> getBoardList");
		List<BoardVO> result = mybatis.selectList("BoardDAO.getBoardList");
		System.out.println("BoardDAOImpl >> getBoardList / result : "+result.toString());
		return result;
	}

	@Override
	public List<BoardVO> getMyBoardList(HashMap map) {
		System.out.println("BoardDAOImpl >> getMyBoardList");
		List<BoardVO> result = mybatis.selectList("BoardDAO.getMyBoardList");
		System.out.println("BoardDAOImpl >> getMyBoardList / result : "+result.toString());
		return result;
	}
	
}
