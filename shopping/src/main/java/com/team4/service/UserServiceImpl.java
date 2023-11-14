package com.team4.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.dao.UserDAOImpl;
import com.team4.domain.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDAOImpl userDAO;

	@Override
	public Integer insertUser(UserVO vo) {
		System.out.println("UserServiceImpl >> insertUser");
		System.out.println(vo.toString());
		return userDAO.insertUser(vo);
	}

	@Override
	public Integer updateUser(UserVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Integer deleteUser(UserVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UserVO getUser(UserVO vo) {
		System.out.println("UserServiceImpl >> getUser");
		UserVO result = userDAO.getUser(vo);
		System.out.println("UserServiceImpl >> getUser / result : "+result);
		return result;
	}

	@Override
	public List<UserVO> getUserList(HashMap map) {
//		System.out.println("UserServiceImpl >> getUserList");
		List<UserVO> result = userDAO.getUserList(map);
//		System.out.println("UserServiceImpl >> getUserList / result : "+result);
		return result;
	}

}
