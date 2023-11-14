package com.team4.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.domain.MarkVO;
import com.team4.domain.PurchaseVO;

@Repository("markDAO")
public class MarkDAOImpl implements MarkDAO{
	
	@Autowired
	private SqlSessionTemplate mybatis;

	@Override
	public Integer insertMark(MarkVO vo) {
		System.out.println("===> Mybatis insertMark() 호출");
		
		return mybatis.insert("MarkDAO.insertMark", vo);
	}

	@Override
	public Integer updateMark(MarkVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteMark(MarkVO vo) {
		System.out.println("MarkDAOImpl : deleteMark");
		return mybatis.insert("MarkDAO.deleteMark", vo);		
	}

	@Override
	public MarkVO getMark(MarkVO vo) {
		System.out.println("MarkDAOImpl : getMark");
		return mybatis.selectOne("MarkDAO.getMark", vo);
	}

	@Override
	public List<MarkVO> getMarkList(HashMap map) {
	
		return mybatis.selectList("MarkDAO.getMarkList",map);
	}

	@Override
	public List<MarkVO> pagingList(Map<String, Integer> pagingParams) {
		return mybatis.selectList("MarkDAO.pagingList", pagingParams);
	}

	@Override
	public int markCount() {
		return mybatis.selectOne("MarkDAO.markPageCount");
	}

	@Override
	public Integer insertMainMark(MarkVO vo) {
		System.out.println("MarkDAOImpl : insertMainMark");
		return mybatis.insert("MarkDAO.insertMainMark", vo);
	}
}
