package com.team4.service;

import java.util.List;
import com.team4.domain.ReviewVO;
import java.util.HashMap;

public interface ReviewService {
	// CRUD 기능의 메소드 구현
	// 글 등록
	Integer insertReview(ReviewVO vo);

	// 글 수정
	Integer updateReview(ReviewVO vo);

	// 글 삭제
	Integer deleteReview(ReviewVO vo);

	// 글 상세 조회
	ReviewVO getReview(ReviewVO vo);

	// 글 목록 조회
	List<ReviewVO> getReviewList(HashMap map);
	
	List<ReviewVO> getReviewCount(HashMap map);

	List<ReviewVO> getMyReviewList(HashMap map);
}
