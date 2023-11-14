package com.team4.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.domain.CartVO;

@Repository("cartDAO")
public class CartDAOImpl implements CartDAO{
   
   @Autowired
   private SqlSessionTemplate mybatis;

   @Override
   public Integer insertCart(CartVO vo) {
      System.out.println("CartDAOImpl >> insertCart");
      Integer result = mybatis.insert("CartDAO.insertCart", vo);
      System.out.println("CartDAOImpl >> insertCart / result : "+result);
      return result;
   }

   @Override
   public Integer updateCart(CartVO vo) {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public Integer deleteCart(CartVO vo) {
      System.out.println("CartDAOImpl >> deleteCart");
      Integer result = mybatis.delete("CartDAO.deleteCart", vo);
      System.out.println("CartDAOImpl >> deleteCart / result : "+result);
      return result;
   }

   @Override
   public CartVO getCart(CartVO vo) {
      CartVO result = (CartVO)mybatis.selectOne("CartDAO.selectCart", vo);
      /* return mybatis.selectOne("CartCAO.getCart", vo); */
      return result;
   }

   @Override
   public List<CartVO> getCartList(HashMap map) {
      System.out.println();
      List<CartVO> result = mybatis.selectList("CartDAO.getCartList", map);
      return result;
   }

public Integer insertMainCart(CartVO vo) {
      
      System.out.println("CartDAOImpl >> insertMainCart");
      Integer result = mybatis.insert("CartDAO.insertMainCart", vo);
      System.out.println("CartDAOImpl >> insertMainCart / result : "+result);
      return result;
}

public Integer insertMyCart(CartVO vo) {
      
      System.out.println("CartDAOImpl >> insertMyCart");
      Integer result = mybatis.insert("CartDAO.insertMyCart", vo);
      System.out.println("CartDAOImpl >> insertMyCart / result : "+result);
      return result;
}

}