package com.team4.dao;

import java.util.HashMap;
import java.util.List;

import com.team4.domain.BrandVO;

public interface BrandDAO {
	public Integer insertBrand(BrandVO vo);

	public Integer updateBrand(BrandVO vo);

	public Integer deleteBrand(BrandVO vo);

	public BrandVO getBrand(BrandVO vo);

	public List<BrandVO> getBrandList(HashMap map);
}
