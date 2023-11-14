package com.team4.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.domain.SearchVO;

@Repository("SearchDAO")
public class SearchDAOImpl implements SearchDAO{

	@Autowired
	private SqlSessionTemplate mybatis;
	
	@Override
	public Integer insertSearch(SearchVO vo) {
		System.out.println("SearchDAOImpl >> insertSearch");
		Integer result = mybatis.insert("SearchDAO.insertSearch", vo);
		System.out.println("SearchDAOImpl >> insertSearch / result : "+result);
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
		System.out.println("SearchDAOImpl >> getSearchList");
		List<SearchVO> result = mybatis.selectList("SearchDAO.getSearchList", map);
		System.out.println("SearchDAOImpl >> getSearchList / result : "+result);
		return result;
	}

}
