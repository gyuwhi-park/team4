package com.team4.dao;

import java.util.HashMap;
import java.util.List;

import com.team4.domain.SecessionVO;

public interface SecessionDAO {
	public Integer insertSecession(SecessionVO vo);

	public Integer updateSecession(SecessionVO vo) ;

	public Integer deleteSecession(SecessionVO vo);

	public SecessionVO getSecession(SecessionVO vo) ;

	public List<SecessionVO> getSecessionList(HashMap map) ;
}
