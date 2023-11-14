package com.team4.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.domain.AccessVO;
import com.team4.domain.Div2VO;

@Repository("Div2DAO")
public class Div2DAOImpl implements Div2DAO{
	
	@Autowired
	private SqlSessionTemplate mybatis;

	@Override
	public Integer insertDiv2(Div2VO vo) {
		System.out.println("Div2DAOImpl >> insertDiv2");
		Integer result = mybatis.insert("Div2DAO.insertDiv2", vo);
		System.out.println("Div2DAOImpl >> insertDiv2 / result : "+result);
		return result;
	}

	@Override
	public Integer updateDiv2(Div2VO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteDiv2(Div2VO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccessVO getDiv2(Div2VO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Div2VO> getDiv2List(HashMap map) {
		if(map != null) {
			System.out.println("Div2DAOImpl >> getDiv2List / map : "+map.toString());
		} else {
			System.out.println("Div2DAOImpl >> getDiv2List / map : null");			
		}
		List<Div2VO> result = mybatis.selectList("Div2DAO.getDiv2List", map);
		System.out.println("Div2DAOImpl >> getDiv2List / result : "+result);
		return result;
	}

}
