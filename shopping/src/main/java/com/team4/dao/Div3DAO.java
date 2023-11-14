package com.team4.dao;

import java.util.HashMap;
import java.util.List;

import com.team4.domain.AccessVO;
import com.team4.domain.Div3VO;

public interface Div3DAO {
	public Integer insertDiv3(Div3VO vo);

	public Integer updateDiv3(Div3VO vo) ;

	public Integer deleteDiv3(Div3VO vo);

	public Div3VO getDiv3(Div3VO vo) ;

	public List<Div3VO> getDiv3List(HashMap map) ;
}
