package com.team4.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.domain.SizeVO;

@Repository("sizeDAO")
public class SizeDAOImpl implements SizeDAO{

	@Autowired
	private SqlSessionTemplate mybatis;

	@Override
	public Integer insertSize(SizeVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateSize(SizeVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteSize(SizeVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SizeVO getSize(SizeVO vo) {
		return mybatis.selectOne("SizeDAO.getSize", vo);
	}

	@Override
	public List<SizeVO> getSizeList(HashMap SMap) {
		// TODO Auto-generated method stub
		return mybatis.selectList("SizeDAO.getSizeList", SMap);
	}



}
