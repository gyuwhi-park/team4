package com.team4.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.domain.PurchaseVO;
import com.team4.domain.ReviewVO;

@Repository("reviewDAO")
public class ReviewDAOImpl implements ReviewDAO{
	
	@Autowired
	private SqlSessionTemplate mybatis;

	@Override
	public Integer insertReview(ReviewVO vo) {
		System.out.println("ReviewDAOImpl >> insertProduct");
		int result = mybatis.insert("ReviewDAO.insertReview", vo);
		return result;
	}

	@Override
	public Integer updateReview(ReviewVO vo) {
		System.out.println("ReviewDAOImpl >> updateReview");
		int result = mybatis.update("ReviewDAO.updateReview", vo);
		return result;
	}

	@Override
	public Integer deleteReview(ReviewVO vo) {
		System.out.println("ReviewDAOImpl >> deleteReview");
		int result = mybatis.delete("ReviewDAO.deleteReview", vo);
		return result;
	}

	@Override
	public ReviewVO getReview(ReviewVO vo) {
		System.out.println("ReviewDAOImpl >> getReview");
		ReviewVO result = (ReviewVO)mybatis.selectOne("ReviewDAO.getReviewCount");
		System.out.println("ReviewDAOImpl >> getReview >> result : " + result);
		return result;
	}

	@Override
	public List<ReviewVO> getReviewList(HashMap rMap) {
		List<ReviewVO> result = mybatis.selectList("ReviewDAO.getReviewList", rMap);
		System.out.println("ReviewDAOImpl >> getReviewList / result : " + result);
		return result;
	}

	@Override
	public List<ReviewVO> getReviewCount(HashMap map) {
		List<ReviewVO> result = mybatis.selectList("ReviewDAO.selectReviewCount", map);
//		System.out.println("PurchaseDAOImpl >> getPurchaseList / result : "+result);
		return result;
	}

	@Override
	public List<ReviewVO> getMyReviewList(HashMap map) {
		List<ReviewVO> result = mybatis.selectList("ReviewDAO.getMyReviewList", map);
		return result;
	}
}
