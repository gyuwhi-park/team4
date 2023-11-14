package com.team4.service;

import java.util.List;
import com.team4.domain.SecessionVO;
import java.util.HashMap;

public interface SecessionService {
	// CRUD 기능의 메소드 구현
	// 글 등록
	Integer insertSecession(SecessionVO vo);

	// 글 수정
	Integer updateSecession(SecessionVO vo);

	// 글 삭제
	Integer deleteSecession(SecessionVO vo);

	// 글 상세 조회
	SecessionVO getSecession(SecessionVO vo);

	// 글 목록 조회
	List<SecessionVO> getSecessionList(HashMap map);
}
