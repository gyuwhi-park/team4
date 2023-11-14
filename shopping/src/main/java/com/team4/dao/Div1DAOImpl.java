package com.team4.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.domain.AccessVO;
import com.team4.domain.Div1VO;

@Repository
public class Div1DAOImpl implements Div1DAO{
	
	@Autowired
	private SqlSessionTemplate mybatis;

	@Override
	public Integer insertDiv1(Div1VO vo) {
//		System.out.println("Div1DAOImpl >> insertDiv1");
		Integer result = mybatis.insert("Div1DAO.insertDiv1", vo);
//		System.out.println("Div1DAOImpl >> insertDiv1 / result : "+result);
		return result;
	}

	@Override
	public Integer updateDiv1(Div1VO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteDiv1(Div1VO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccessVO getDiv1(Div1VO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Div1VO> getDiv1List(HashMap map) {
//		System.out.println("Div1DAOImpl >> getDiv1List");
		List<Div1VO> result = mybatis.selectList("Div1DAO.getDiv1List", map);
//		System.out.println("Div1DAOImpl >> getDiv1List / result : "+result);
		return result;
	}

}
