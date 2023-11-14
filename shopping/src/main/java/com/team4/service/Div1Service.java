package com.team4.service;

import java.util.List;
import com.team4.domain.Div1VO;

import java.util.HashMap;

public interface Div1Service {
	// CRUD 기능의 메소드 구현
	// 글 등록
	Integer insertDiv1(Div1VO vo);

	// 글 수정
	Integer updateDiv1(Div1VO vo);

	// 글 삭제
	Integer deleteDiv1(Div1VO vo);

	// 글 상세 조회
	Div1VO getDiv1(Div1VO vo);

	// 글 목록 조회
	List<Div1VO> getDiv1List(HashMap map);
}
