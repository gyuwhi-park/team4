package com.team4.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.dao.SecessionDAO;
import com.team4.domain.SecessionVO;

@Service("SecessionService")
public class SecessionServiceImpl implements SecessionService{
	
	@Autowired
	private SecessionDAO SecessionDAO;

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
		System.out.println("SecessionServiceImpl >> getSecession");
		SecessionVO result = SecessionDAO.getSecession(vo);
		System.out.println("SecessionServiceImpl >> getSecession / result "+result);
		return result;
	}

	@Override
	public List<SecessionVO> getSecessionList(HashMap map) {
		// TODO Auto-generated method stub
		return null;
	}

}
