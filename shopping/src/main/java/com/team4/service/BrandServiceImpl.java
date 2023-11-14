package com.team4.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.dao.BrandDAO;
import com.team4.domain.BrandVO;

@Service("brandService")
public class BrandServiceImpl implements BrandService{
	
	@Autowired
	BrandDAO brandDAO;

	@Override
	public Integer insertBrand(BrandVO vo) {
		System.out.println("BrandServiceImpl >> insertBrand");
		Integer result = brandDAO.insertBrand(vo);
		System.out.println("BrandServiceImpl >> insertBrand / result "+result);
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
//		System.out.println("BrandServiceImpl >> getBrandList");
		List<BrandVO> result = brandDAO.getBrandList(map);
//		System.out.println("BrandServiceImpl >> getBrandList / result : "+result);
		return result;
	}

}
