package com.team4.dao;

import java.util.HashMap;
import java.util.List;

import com.team4.domain.CartVO;

public interface CartDAO {
	public Integer insertCart(CartVO vo);

	public Integer updateCart(CartVO vo) ;

	public Integer deleteCart(CartVO vo);

	public CartVO getCart(CartVO vo) ;

	public List<CartVO> getCartList(HashMap map) ;
	
	public Integer insertMainCart(CartVO vo);

	public Integer insertMyCart(CartVO vo);
}
