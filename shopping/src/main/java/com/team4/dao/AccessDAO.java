package com.team4.dao;

import java.util.HashMap;
import java.util.List;

import com.team4.domain.AccessVO;

public interface AccessDAO {
	public Integer insertAccess(AccessVO vo);

	public Integer updateAccess(AccessVO vo) ;

	public Integer deleteAccess(AccessVO vo);

	public AccessVO getAccess(AccessVO vo) ;

	public List<AccessVO> getAccessList(HashMap map) ;
}
