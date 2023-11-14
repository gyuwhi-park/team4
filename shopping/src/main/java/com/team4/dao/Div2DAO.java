package com.team4.dao;

import java.util.HashMap;
import java.util.List;

import com.team4.domain.AccessVO;
import com.team4.domain.Div2VO;

public interface Div2DAO {
	public Integer insertDiv2(Div2VO vo);

	public Integer updateDiv2(Div2VO vo) ;

	public Integer deleteDiv2(Div2VO vo);

	public AccessVO getDiv2(Div2VO vo) ;

	public List<Div2VO> getDiv2List(HashMap map) ;
}
