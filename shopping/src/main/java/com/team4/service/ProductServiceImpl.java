package com.team4.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.dao.Div1DAO;
import com.team4.dao.ProductDAO;
import com.team4.domain.ProductVO;

@Service("productService")
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDAO productDAO;

	@Override
	public Integer insertProduct(ProductVO vo) {
		System.out.println("ProductServiceImpl >> insertProduct");
		Integer result = productDAO.insertProduct(vo);
		System.out.println("ProductServiceImpl >> insertProduct / result : "+result);
		return result;
	}

	@Override
	public Integer updateProduct(ProductVO vo) {
//		System.out.println("ProductServiceImpl >> updateProduct");
		Integer result = productDAO.updateProduct(vo);
//		System.out.println("ProductServiceImpl >> updateProduct / result : "+result);
		return result;
	}

	@Override
	public Integer deleteProduct(ProductVO vo) {
		// TODO Auto-generated method stub
		return productDAO.deleteProduct(vo);
	}

	@Override
	public ProductVO getProduct(ProductVO vo) {
		// TODO Auto-generated method stub
		return productDAO.getProduct(vo);
	}

	@Override
	public List<ProductVO> getProductList(HashMap map) {
		System.out.println("ProductServiceImpl >> getProductList");
		List<ProductVO> result = productDAO.getProductList(map);
		System.out.println("ProductServiceImpl >> getProductList / result : "+result);
		return result;
	}

	@Override
	public ProductVO getMainProduct(ProductVO vo) {
	
		System.out.println("ProductServiceImpl >> getMainProduct");
		ProductVO result = productDAO.getMainProduct(vo);
		System.out.println("ProductServiceImpl >> getMainProduct / result : "+result);
		return result;
	}

	@Override
	public ProductVO getMyProduct(ProductVO vo) {
		
		System.out.println("ProductServiceImpl >> getMyProduct");
		ProductVO result = productDAO.getMyProduct(vo);
		System.out.println("ProductServiceImpl >> getMyProduct / result : "+result);
		return result;
	} 

}
