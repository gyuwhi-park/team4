package com.team4.service;

import java.util.List;
import com.team4.domain.ProductVO;
import java.util.HashMap;

public interface ProductService {
	// CRUD 기능의 메소드 구현
	// 글 등록
	Integer insertProduct(ProductVO vo);

	// 글 수정
	Integer updateProduct(ProductVO vo);

	// 글 삭제
	Integer deleteProduct(ProductVO vo);

	// 글 상세 조회
	ProductVO getProduct(ProductVO vo);

	// 글 목록 조회
	List<ProductVO> getProductList(HashMap map);
	
	ProductVO getMainProduct(ProductVO vo);

	ProductVO getMyProduct(ProductVO vo);
}
