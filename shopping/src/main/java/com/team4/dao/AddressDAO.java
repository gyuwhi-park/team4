package com.team4.dao;

import java.util.HashMap;
import java.util.List;

import com.team4.domain.AddressVO;

public interface AddressDAO {
	public Integer insertAddress(AddressVO vo);

	public Integer updateAddress(AddressVO vo) ;

	public Integer deleteAddress(AddressVO vo);

	public AddressVO getAddress(AddressVO vo) ;

	public List<AddressVO> getAddressList(HashMap map) ;
}
