package com.team4.dao;

import java.util.HashMap;
import java.util.List;

import com.team4.domain.BoardVO; 

public interface BoardDAO {
	public Integer insertBoard(BoardVO vo);

	public Integer updateBoard(BoardVO vo) ;

	public Integer deleteBoard(BoardVO vo);

	public BoardVO getBoard(BoardVO vo) ;

	public List<BoardVO> getBoardList(HashMap map) ;
	
	public List<BoardVO> getMyBoardList(HashMap map);
}
