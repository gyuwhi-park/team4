package com.team4.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.dao.AddressDAO;
import com.team4.domain.AddressVO;

@Service("addressService")
public class AddressServiceImpl implements AddressService {
	
	@Autowired
	private AddressDAO addressDAO;

	@Override
	public Integer insertAddress(AddressVO vo) {
		System.out.println("AddressServiceImpl >> insertAddress");
		Integer result = addressDAO.insertAddress(vo);
		System.out.println("AddressServiceImpl >> insertAddress / result : "+result);
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
//		System.out.println("AddressServiceImpl >> getAddress");
		AddressVO result = addressDAO.getAddress(vo);
//		System.out.println("AddressServiceImpl >> getAddress / result : "+result);
		return result;
	}

	@Override
	public List<AddressVO> getAddressList(HashMap map) {
		
		return addressDAO.getAddressList(map);
	}
	
	
}
