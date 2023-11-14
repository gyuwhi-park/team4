package com.team4.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.domain.BrandVO;

@Repository("brandDAO")
public class BrandDAOImpl implements BrandDAO{
	
	@Autowired
	private SqlSessionTemplate mybatis;

	@Override
	public Integer insertBrand(BrandVO vo) {
		System.out.println("BrandDAOImpl >> insertBrand");
		Integer result = mybatis.insert("BrandDAO.insertBrand", vo);
		System.out.println("BrandDAOImpl >> insertBrand / result : "+result);
		return result;
	}

	@Override
	public Integer updateBrand(BrandVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteBrand(BrandVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BrandVO getBrand(BrandVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BrandVO> getBrandList(HashMap map) {
//		System.out.println("BrandDAOImpl >> getBrandList");
		List<BrandVO> result = mybatis.selectList("BrandDAO.getBrandList", map);
//		System.out.println("BrandDAOImpl >> getBrandList / result : "+result.toString());
		return result;
	}

}
