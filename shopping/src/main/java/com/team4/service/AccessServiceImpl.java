package com.team4.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.dao.AccessDAO;
import com.team4.domain.AccessVO;

@Service("AccessService")
public class AccessServiceImpl implements AccessService{
	
	@Autowired
	private AccessDAO accessDAO;

	@Override
	public Integer insertAccess(AccessVO vo) {
		System.out.println("AccessServiceImpl >> insertAccess");
		Integer result = accessDAO.insertAccess(vo);
		System.out.println("AccessServiceImpl >> insertAccess / result : "+result);
		return result;
	}

	@Override
	public Integer updateAccess(AccessVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteAccess(AccessVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccessVO getAccess(AccessVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AccessVO> getAccessList(HashMap map) {
		System.out.println("AccessServiceImpl >> getAccessList");
		List<AccessVO> result = accessDAO.getAccessList(map);
		System.out.println("AccessServiceImpl >> getAccessList");
		return result;
	}

}
