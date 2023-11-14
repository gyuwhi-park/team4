package com.team4.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.team4.domain.CartVO;

import java.util.HashMap;

@Service
public interface CartService {
	// CRUD 기능의 메소드 구현
	// 장바구니 추가
	Integer insertCart(CartVO vo);

	// 장바구니 수정
	Integer updateCart(CartVO vo);

	// 장바구니 삭제
	Integer deleteCart(CartVO vo);

	// 장바구니 상세 조회
	CartVO getCart(CartVO vo);

	// 장바구니 목록 조회
	List<CartVO> getCartList(HashMap map);
	
	Integer insertMainCart(CartVO vo);

	Integer insertMyCart(CartVO vo);
}
