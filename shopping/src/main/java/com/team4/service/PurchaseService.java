package com.team4.service;

import java.util.List;

import com.team4.domain.PageVO;
import com.team4.domain.PurchaseVO;
import java.util.HashMap;

public interface PurchaseService {
	// CRUD 기능의 메소드 구현
	// 글 등록
	Integer insertPurchase(PurchaseVO vo);

	// 글 수정
	Integer updatePurchase(PurchaseVO vo);

	// 글 삭제
	Integer deletePurchase(PurchaseVO vo);

	// 글 상세 조회
	PurchaseVO getPurchase(PurchaseVO vo);

	// 글 목록 조회
	List<PurchaseVO> getPurchaseList(HashMap map);

	PurchaseVO getOrderCount(PurchaseVO pvo);

	List<PurchaseVO> getDateList(HashMap map);

	List<PurchaseVO> pagingList(int page);

	PageVO pagingParam(int page);

	List<PurchaseVO> getPurchaseCount(HashMap map);
}
