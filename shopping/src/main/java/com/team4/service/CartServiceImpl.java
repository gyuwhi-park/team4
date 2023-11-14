package com.team4.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.dao.CartDAOImpl;
import com.team4.domain.CartVO;

@Service("cartService")
public class CartServiceImpl implements CartService{
	
	@Autowired
	private CartDAOImpl cartDAO;

	@Override
	public Integer insertCart(CartVO vo) {
		System.out.println("CartServiceImpl >> insertCart");
		Integer result = cartDAO.insertCart(vo);
		System.out.println("CartServiceImpl >> insertCart / result : "+result);
		return result;
	}

	@Override
	public Integer updateCart(CartVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

   @Override
   public Integer deleteCart(CartVO vo) {
      System.out.println("CartServiceImpl >> deleteCart");
      Integer result = cartDAO.deleteCart(vo);
      System.out.println("CartServiceImpl >> deleteCart / result : "+result);
      return result;
   }

	@Override
	public CartVO getCart(CartVO vo) {
		CartVO result = cartDAO.getCart(vo);
		return result;
	}

	@Override
	public List<CartVO> getCartList(HashMap map) {
		List<CartVO> result = cartDAO.getCartList(map);
		return result;
	}

	@Override
	public Integer insertMainCart(CartVO vo) { 
		
		System.out.println("CartServiceImpl >> insertMainCart");
		Integer result = cartDAO.insertMainCart(vo);
		System.out.println("CartServiceImpl >> insertMainCart / result : "+result);
		return result;
	}

	@Override
	public Integer insertMyCart(CartVO vo) {
		
		System.out.println("CartServiceImpl >> insertMyCart");
		Integer result = cartDAO.insertMyCart(vo);
		System.out.println("CartServiceImpl >> insertMyCart / result : "+result);
		return result;
	}

}
