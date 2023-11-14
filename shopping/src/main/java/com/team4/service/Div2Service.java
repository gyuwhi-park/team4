package com.team4.service;

import java.util.List;
import com.team4.domain.Div2VO;

import java.util.HashMap;

public interface Div2Service {
	// CRUD 기능의 메소드 구현
	// 글 등록
	Integer insertDiv2(Div2VO vo);

	// 글 수정
	Integer updateDiv2(Div2VO vo);

	// 글 삭제
	Integer deleteDiv2(Div2VO vo);

	// 글 상세 조회
	Div2VO getDiv2(Div2VO vo);

	// 글 목록 조회
	List<Div2VO> getDiv2List(HashMap map);
}
