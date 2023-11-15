package com.team4.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.dao.SizeDAOImpl;
import com.team4.domain.ColorVO;
import com.team4.domain.SizeVO;

@Service("sizeService")
public class SizeServiceImpl implements SizeService {
	
	@Autowired
	private SizeDAOImpl sizeDAO;

	@Override
	public Integer insertSize(SizeVO vo) {
		System.out.println("SizeServiceImpl >> insertSize");
		Integer result = sizeDAO.insertSize(vo);
		System.out.println("SizeServiceImpl >> insertSize / result : "+result);
		return result;
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
		
		return sizeDAO.getSize(vo);
	}

	@Override
	public List<SizeVO> getSizeList(HashMap SMap) {
		List<SizeVO> result = sizeDAO.getSizeList(SMap);
		System.out.println("ColorServiceImpl >> getColorList : " + result);
		return result;
	}


}
