package com.team4.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.dao.ReviewDAO;
import com.team4.domain.PurchaseVO;
import com.team4.domain.ReviewVO;
import com.team4.domain.UserVO;

@Service("reviewService")
public class ReviewServiceImpl implements ReviewService{
			
	@Autowired
	private ReviewDAO reviewDAO;
	
	@Override
	public Integer insertReview(ReviewVO vo) {
		int result = reviewDAO.insertReview(vo);
		System.out.println("ReviewServiceImpl >> insertReview >> result : "+result);
		return result;
	}

	@Override
	public Integer updateReview(ReviewVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteReview(ReviewVO vo) {
		int result = reviewDAO.deleteReview(vo);
		System.out.println("ReviewServiceImpl >> deleteReview >> result : "+result);
		return result;
	}

	@Override
	public ReviewVO getReview(ReviewVO vo) {
		System.out.println("ReivewServiceImpl >> getReview");
		ReviewVO result = reviewDAO.getReview(vo);
		System.out.println("ReviewServiceImpl >> getReview >> result : "+result);
		return result;
	}

	@Override
	public List<ReviewVO> getReviewList(HashMap rMap) {
		List<ReviewVO> result = reviewDAO.getReviewList(rMap);
		System.out.println("ReviewServiceImpl >> getReviewList >> result : "+result);
		return result;
	}

	@Override
	public List<ReviewVO> getReviewCount(HashMap map) {
		List<ReviewVO> result = reviewDAO.getReviewCount(map);
		return result;
	}
	
	@Override
	public List<ReviewVO> getMyReviewList(HashMap map) {
		List<ReviewVO> result = reviewDAO.getMyReviewList(map);
		return result;
	}
}
