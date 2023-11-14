package com.team4.service;

import java.util.List;
import com.team4.domain.AccessVO;
import java.util.HashMap;

public interface AccessService {
	// CRUD 기능의 메소드 구현
	// 글 등록
	Integer insertAccess(AccessVO vo);

	// 글 수정
	Integer updateAccess(AccessVO vo);

	// 글 삭제
	Integer deleteAccess(AccessVO vo);

	// 글 상세 조회
	AccessVO getAccess(AccessVO vo);

	// 글 목록 조회
	List<AccessVO> getAccessList(HashMap map);
}
