package com.team4.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.dao.SearchDAO;
import com.team4.domain.SearchVO;

@Service("SearchService")
public class SearchServiceImpl implements SearchService{
	
	@Autowired
	private SearchDAO searchDAO;

	@Override
	public Integer insertSearch(SearchVO vo) {
		System.out.println("SearchServiceImpl >> insertSearch");
		Integer result = searchDAO.insertSearch(vo);
		System.out.println("SearchServiceImpl >> insertSearch / result : "+result);
		return result;
	}

	@Override
	public Integer updateSearch(SearchVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteSearch(SearchVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SearchVO getSearch(SearchVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SearchVO> getSearchList(HashMap map) {
		System.out.println("SearchServiceImpl >> getSearchList");
		List<SearchVO> result = searchDAO.getSearchList(map);
		System.out.println("SearchServiceImpl >> getSearchList / result : "+result);
		return result;
	}

}
