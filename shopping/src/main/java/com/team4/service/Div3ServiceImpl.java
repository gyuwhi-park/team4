package com.team4.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.dao.Div3DAOImpl;
import com.team4.domain.Div3VO;

@Service("div3Service")
public class Div3ServiceImpl implements Div3Service{
	
	@Autowired
	private Div3DAOImpl div3DAO;

	@Override
	public Integer insertDiv3(Div3VO vo) {
		System.out.println("Div3ServiceImpl >> insertDiv3");
		Integer result = div3DAO.insertDiv3(vo);
		System.out.println("Div3ServiceImpl >> insertDiv3 / result : "+result);
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
		Div3VO result = div3DAO.getDiv3(vo);
		System.out.println("Div3DAOImpl result : " + result);
		return result;
	}

	@Override
	public List<Div3VO> getDiv3List(HashMap map) {
//		System.out.println("Div3ServiceImpl >> getDiv3List");
		List<Div3VO> result = div3DAO.getDiv3List(map);
//		System.out.println("Div3ServiceImpl >> getDiv3List / result : "+result);
		return result;
	}

}
