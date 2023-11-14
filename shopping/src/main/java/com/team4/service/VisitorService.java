package com.team4.service;

import java.util.List;
import com.team4.domain.VisitorVO;
import java.util.HashMap;

public interface VisitorService {
	// CRUD 기능의 메소드 구현
	// 글 등록
	Integer insertVisitor(VisitorVO vo);

	// 글 수정
	Integer updateVisitor(VisitorVO vo);

	// 글 삭제
	Integer deleteVisitor(VisitorVO vo);

	// 글 상세 조회
	VisitorVO getVisitor(VisitorVO vo);

	// 글 목록 조회
	List<VisitorVO> getVisitorList(HashMap map);
}
