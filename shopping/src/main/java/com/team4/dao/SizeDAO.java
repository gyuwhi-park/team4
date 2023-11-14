package com.team4.dao;

import java.util.HashMap;
import java.util.List;

import com.team4.domain.SizeVO;

public interface SizeDAO {
	public Integer insertSize(SizeVO vo);

	public Integer updateSize(SizeVO vo) ;

	public Integer deleteSize(SizeVO vo);

	public SizeVO getSize(SizeVO vo) ;

	public List<SizeVO> getSizeList(HashMap map) ;
}
