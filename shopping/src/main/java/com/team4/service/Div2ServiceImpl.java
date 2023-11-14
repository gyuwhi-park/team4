package com.team4.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.dao.Div2DAO;
import com.team4.domain.Div2VO;

@Service("div2Service")
public class Div2ServiceImpl implements Div2Service{
	
	@Autowired
	private Div2DAO div2DAO;

	@Override
	public Integer insertDiv2(Div2VO vo) {
		System.out.println("Div2ServiceImpl >> insertDiv2");
		Integer result = div2DAO.insertDiv2(vo);
		System.out.println("Div2ServiceImpl >> insertDiv2 / result : "+result);
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
	public Div2VO getDiv2(Div2VO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Div2VO> getDiv2List(HashMap map) {
//		System.out.println("Div2ServiceImpl >> getDiv2List");
		List<Div2VO> result = div2DAO.getDiv2List(map);
//		System.out.println("Div2ServiceImpl >> getDiv2List / result : "+result);
		return result;
	}

}
