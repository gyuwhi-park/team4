package com.team4.service;

import java.util.List;
import com.team4.domain.BoardVO;
import java.util.HashMap;

public interface BoardService {
	// CRUD 기능의 메소드 구현
	// 글 등록
	Integer insertBoard(BoardVO vo);

	// 글 수정
	Integer updateBoard(BoardVO vo);

	// 글 삭제
	Integer deleteBoard(BoardVO vo);

	// 글 상세 조회
	BoardVO getBoard(BoardVO vo);

	// 글 목록 조회
	List<BoardVO> getBoardList(HashMap map);
	
	List<BoardVO> getMyBoardList(HashMap map);
}
