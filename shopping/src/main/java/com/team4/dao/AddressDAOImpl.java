package com.team4.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.domain.AddressVO;

@Repository("addressDAO")
public class AddressDAOImpl implements AddressDAO{

	@Autowired
	private SqlSessionTemplate mybatis;

	@Override
	public Integer insertAddress(AddressVO vo) {
		System.out.println("AddressDAOImpl >> insertAddress");
		Integer result = mybatis.insert("AddressDAO.insertAddress",vo);
		System.out.println("AddressDAOImpl >> insertAddress / result : "+result);
		return result;
	}

	@Override
	public Integer updateAddress(AddressVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteAddress(AddressVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AddressVO getAddress(AddressVO vo) {
//		System.out.println("AddressDAOImpl >> getAddress");
		AddressVO result = mybatis.selectOne("AddressDAO.getAddress", vo);
//		System.out.println("AddressDAOImpl >> getAddress / result : "+result);
		return result;
	}

	@Override
	public List<AddressVO> getAddressList(HashMap map) {
		System.out.println("AddressDAOImpl >> getAddressList");
		List<AddressVO> result = mybatis.selectList("AddressDAO.getAddressList",map);
		System.out.println("AddressDAOImpl >> getAddressList / result : "+result.toString());
		return result;
	}

}
