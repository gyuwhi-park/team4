package com.team4.dao;

import java.util.HashMap;
import java.util.List;

import com.team4.domain.PurchaseVO;
import com.team4.domain.ReviewVO;

public interface ReviewDAO {
	public Integer insertReview(ReviewVO vo);

	public Integer updateReview(ReviewVO vo) ;

	public Integer deleteReview(ReviewVO vo);

	public ReviewVO getReview(ReviewVO vo) ;

	public List<ReviewVO> getReviewList(HashMap map) ;
	
	public List<ReviewVO> getReviewCount(HashMap map) ;

	List<ReviewVO> getMyReviewList(HashMap map);
	
}
