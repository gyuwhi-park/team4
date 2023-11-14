package com.team4.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.domain.AccessVO;
import com.team4.domain.Div3VO;

@Repository("Div3DAO")
public class Div3DAOImpl implements Div3DAO{
	
	@Autowired
	private SqlSessionTemplate mybatis;

	@Override
	public Integer insertDiv3(Div3VO vo) {
		System.out.println("Div3DAOImpl >> insertDiv3");
		Integer result = mybatis.insert("Div3DAO.insertDiv3", vo);
		System.out.println("Div3DAOImpl >> insertDiv3 / result : "+result);
		return result;
	}

	@Override
	public Integer updateDiv3(Div3VO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteDiv3(Div3VO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Div3VO getDiv3(Div3VO vo) {
		// TODO Auto-generated method stub
		return mybatis.selectOne("Div3DAO.getDiv3", vo);
	}

	@Override
	public List<Div3VO> getDiv3List(HashMap map) {
//		System.out.println("Div3DAOImpl >> getDiv3List");
		List<Div3VO> result = mybatis.selectList("Div3DAO.getDiv3List", map);
//		System.out.println("Div3DAOImpl >> getDiv3List / result : "+result);
		return result;
	}

}
