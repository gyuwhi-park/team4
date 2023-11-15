package com.team4.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.domain.ColorVO;

@Repository("colorDAO")
public class ColorDAOImpl implements ColorDAO{
	
	@Autowired
	private SqlSessionTemplate mybatis;

	@Override
	public Integer insertColor(ColorVO vo) {
		System.out.println("ColorDAOImpl >> insertColor");
		Integer result = mybatis.insert("ColorDAO.insertColor", vo);
		System.out.println("ColorDAOImpl >> insertColor / result : "+result);
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
		return mybatis.selectOne("ColorDAO.getColor", vo);
	}
/*	
	@Override
	public List<ColorVO> getColorList(String colorIdx) {
		// TODO Auto-generated method stub
		return mybatis.selectList("ColorDAO.getColorList", colorIdx);
	}
*/	
	@Override
	public List<ColorVO> getColorList(HashMap CMap) {
		// TODO Auto-generated method stub
		return mybatis.selectList("ColorDAO.getColorList", CMap);
	}

}
