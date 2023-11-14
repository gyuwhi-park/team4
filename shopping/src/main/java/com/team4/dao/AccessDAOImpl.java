package com.team4.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.domain.AccessVO;

@Repository("AccessDAO")
public class AccessDAOImpl implements AccessDAO{
	
	@Autowired
	private SqlSessionTemplate mybatis;

	@Override
	public Integer insertAccess(AccessVO vo) {
		System.out.println("AccessDAO >> insertAccess");
		Integer result = mybatis.insert("AccessDAO.insertAccess", vo);
		System.out.println("AccessDAO >> insertAccess / result : "+result);
		return result;
	}

	@Override
	public Integer updateAccess(AccessVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteAccess(AccessVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccessVO getAccess(AccessVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AccessVO> getAccessList(HashMap map) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
