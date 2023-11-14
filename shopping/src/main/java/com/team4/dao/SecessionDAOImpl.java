package com.team4.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.domain.SecessionVO;

@Repository("secessionDAO")
public class SecessionDAOImpl implements SecessionDAO{
	
	@Autowired
	private SqlSessionTemplate mybatis;

	@Override
	public Integer insertSecession(SecessionVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateSecession(SecessionVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteSecession(SecessionVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SecessionVO getSecession(SecessionVO vo) {
		System.out.println("SecessionDAOImpl >> getSecession");
		SecessionVO result = mybatis.selectOne("secessionDAO.getUser", vo);
		System.out.println("SecessionDAOImpl >> getSecession / result : "+result);
		return result;
	}

	@Override
	public List<SecessionVO> getSecessionList(HashMap map) {
		// TODO Auto-generated method stub
		return null;
	}

}
