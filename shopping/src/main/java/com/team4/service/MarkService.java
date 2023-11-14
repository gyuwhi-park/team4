package com.team4.service;

import java.util.List;
import com.team4.domain.MarkVO;
import com.team4.domain.PageVO;
import com.team4.domain.PurchaseVO;

import java.util.HashMap;

public interface MarkService {
	// CRUD 기능의 메소드 구현
	// 글 등록
	Integer insertMark(MarkVO vo);

	// 글 수정
	Integer updateMark(MarkVO vo);

	// 글 삭제
	Integer deleteMark(MarkVO vo);

	// 글 상세 조회
	MarkVO getMark(MarkVO vo);

	// 글 목록 조회
	List<MarkVO> getMarkList(HashMap map);

	// wishlist 페이징
	List<MarkVO> pagingList(int page);
	
	// paging 
	PageVO pagingParam(int page);
	
	Integer insertMainMark(MarkVO vo);
}
