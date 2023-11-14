package com.team4.service;

import java.util.List;
import com.team4.domain.Div3VO;

import java.util.HashMap;

public interface Div3Service {
	// CRUD 기능의 메소드 구현
	// 글 등록
	Integer insertDiv3(Div3VO vo);

	// 글 수정
	Integer updateDiv3(Div3VO vo);

	// 글 삭제
	Integer deleteDiv3(Div3VO vo);

	// 글 상세 조회
	Div3VO getDiv3(Div3VO vo);

	// 글 목록 조회
	List<Div3VO> getDiv3List(HashMap map);
}
