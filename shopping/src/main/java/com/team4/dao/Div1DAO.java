package com.team4.dao;

import java.util.HashMap;
import java.util.List;

import com.team4.domain.AccessVO;
import com.team4.domain.Div1VO;

public interface Div1DAO {
	public Integer insertDiv1(Div1VO vo);

	public Integer updateDiv1(Div1VO vo) ;

	public Integer deleteDiv1(Div1VO vo);

	public AccessVO getDiv1(Div1VO vo) ;

	public List<Div1VO> getDiv1List(HashMap map) ;
}
