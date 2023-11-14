package com.team4.service;

import java.util.HashMap;
import java.util.List;

import com.team4.domain.SizeVO;

public interface SizeService {
	// CRUD 기능의 메소드 구현
	// 글 등록
	Integer insertSize(SizeVO vo);

	// 글 수정
	Integer updateSize(SizeVO vo);

	// 글 삭제
	Integer deleteSize(SizeVO vo);

	// 글 상세 조회
	SizeVO getSize(SizeVO vo);

	// 글 목록 조회
	List<SizeVO> getSizeList(HashMap SMap);
}
