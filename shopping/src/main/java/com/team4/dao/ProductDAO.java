package com.team4.dao;

import java.util.HashMap;
import java.util.List;

import com.team4.domain.ProductVO;

public interface ProductDAO {
	public Integer insertProduct(ProductVO vo);

	public Integer updateProduct(ProductVO vo) ;

	public Integer deleteProduct(ProductVO vo);

	public ProductVO getProduct(ProductVO vo) ;

	public List<ProductVO> getProductList(HashMap map) ;
	
	public ProductVO getMainProduct(ProductVO vo);

	public ProductVO getMyProduct(ProductVO vo);
}
