package com.team4.dao;

import java.util.HashMap;
import java.util.List;

import com.team4.domain.SearchVO;

public interface SearchDAO {
	public Integer insertSearch(SearchVO vo);

	public Integer updateSearch(SearchVO vo) ;

	public Integer deleteSearch(SearchVO vo);

	public SearchVO getSearch(SearchVO vo) ;

	public List<SearchVO> getSearchList(HashMap map) ;
}
