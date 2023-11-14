package com.team4.service;

import java.util.List;
import com.team4.domain.SearchVO;
import java.util.HashMap;

public interface SearchService {
	// CRUD 기능의 메소드 구현
	// 글 등록
	Integer insertSearch(SearchVO vo);

	// 글 수정
	Integer updateSearch(SearchVO vo);

	// 글 삭제
	Integer deleteSearch(SearchVO vo);

	// 글 상세 조회
	SearchVO getSearch(SearchVO vo);

	// 글 목록 조회
	List<SearchVO> getSearchList(HashMap map);
}
