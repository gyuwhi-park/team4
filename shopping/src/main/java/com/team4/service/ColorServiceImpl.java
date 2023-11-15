package com.team4.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.dao.ColorDAOImpl;
import com.team4.domain.ColorVO;

@Service("colorService")
public class ColorServiceImpl implements ColorService{
	
	@Autowired
	private ColorDAOImpl colorDAO;

	@Override
	public Integer insertColor(ColorVO vo) {
		System.out.println("ColorServiceImpl >> insertColor");
		Integer result = colorDAO.insertColor(vo);
		System.out.println("ColorServiceImpl >> insertColor / result : "+result);
		return result;
	}

	@Override
	public Integer updateColor(ColorVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteColor(ColorVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ColorVO getColor(ColorVO vo) {
		return colorDAO.getColor(vo);
	}
/*
	@Override
	public List<ColorVO> getColorList(String colorIdx) {
		List<ColorVO> result = colorDAO.getColorList(colorIdx);
		System.out.println("ColorServiceImpl >> getColorList : " + result);
		return result;
	}
*/
	@Override
	public List<ColorVO> getColorList(HashMap CMap) {
		List<ColorVO> result = colorDAO.getColorList(CMap);
		System.out.println("ColorServiceImpl >> getColorList : " + result);
		return result;
	}


}
