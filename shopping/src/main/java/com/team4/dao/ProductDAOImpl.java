package com.team4.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.domain.ProductVO;

@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO{
	
	@Autowired
	private SqlSessionTemplate mybatis;

	@Override
	public Integer insertProduct(ProductVO vo) {
		System.out.println("ProductDAOImpl >> insertProduct");
		Integer result = mybatis.insert("productDAO.insertProduct", vo);
		System.out.println("ProductDAOImpl >> insertProduct / result : "+result);
		return result;
	}

	@Override
	public Integer updateProduct(ProductVO vo) {
//		System.out.println("ProductDAOImpl >> updateProduct");
		Integer result = mybatis.update("productDAO.updateStock", vo);
//		System.out.println("ProductDAOImpl >> updateProduct / result : "+result);
		return result;
	}

	@Override
	public Integer deleteProduct(ProductVO vo) {
		// TODO Auto-generated method stub
		return mybatis.delete("ProductDAO.deleteProduct", vo);
	}

	@Override
	public ProductVO getProduct(ProductVO vo) {
		System.out.println("ProductDAOImpl >> getProduct");
		ProductVO result = (ProductVO)mybatis.selectOne("productDAO.getProduct", vo);
		System.out.println("ProductDAOImpl >> getProduct / result : "+result);
		return result;
	}

	@Override
	public List<ProductVO> getProductList(HashMap map) {
		System.out.println("ProductDAOImpl >> getProductList");
		List<ProductVO> result = mybatis.selectList("productDAO.getProductList", map);
		System.out.println("ProductDAOImpl >> getProductList / result : "+result);
		return result;
	}

	@Override
	public ProductVO getMainProduct(ProductVO vo) {
		
		System.out.println("ProductDAOImpl >> getMainProduct");
		ProductVO result = (ProductVO)mybatis.selectOne("productDAO.getMainProduct", vo);
		System.out.println("ProductDAOImpl >> getMainProduct / result : "+result);
		return result;
	}

@Override
	public ProductVO getMyProduct(ProductVO vo) {
		
		System.out.println("ProductDAOImpl >> getMyProduct");
		ProductVO result = (ProductVO)mybatis.selectOne("productDAO.getMyProduct", vo);
		System.out.println("ProductDAOImpl >> getMyProduct / result : "+result);
		return result;
	}
	
}
