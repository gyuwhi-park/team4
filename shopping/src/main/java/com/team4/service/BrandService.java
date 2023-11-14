package com.team4.service;

import java.util.List;
import com.team4.domain.BrandVO;
import java.util.HashMap;

public interface BrandService {
	// CRUD 기능의 메소드 구현
	// 글 등록
	Integer insertBrand(BrandVO vo);

	// 글 수정
	Integer updateBrand(BrandVO vo);

	// 글 삭제
	Integer deleteBrand(BrandVO vo);

	// 글 상세 조회
	BrandVO getBrand(BrandVO vo);

	// 글 목록 조회
	List<BrandVO> getBrandList(HashMap map);
}
