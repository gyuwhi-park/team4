package com.team4.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.dao.Div1DAO;
import com.team4.domain.Div1VO;

@Service("div1Service")
public class Div1ServiceImpl implements Div1Service{
	
	@Autowired
	private Div1DAO div1DAO;

	@Override
	public Integer insertDiv1(Div1VO vo) {
//		System.out.println("Div1ServiceImpl >> insertDiv1");
		Integer result = div1DAO.insertDiv1(vo);
//		System.out.println("Div1ServiceImpl >> insertDiv1 / result : "+result);
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
	public Div1VO getDiv1(Div1VO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Div1VO> getDiv1List(HashMap map) {
//		System.out.println("Div1ServiceImpl >> getDiv1List");
		List<Div1VO> result = div1DAO.getDiv1List(map);
//		System.out.println("Div1ServiceImpl >> getDiv1List / result : "+result);
		return result;
	}

}
