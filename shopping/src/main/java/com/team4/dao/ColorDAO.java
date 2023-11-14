package com.team4.dao;

import java.util.HashMap;
import java.util.List;

import com.team4.domain.ColorVO;

public interface ColorDAO {
	public Integer insertColor(ColorVO vo);

	public Integer updateColor(ColorVO vo) ;

	public Integer deleteColor(ColorVO vo);

	public ColorVO getColor(ColorVO vo) ;

	public List<ColorVO> getColorList(HashMap map) ;
}
