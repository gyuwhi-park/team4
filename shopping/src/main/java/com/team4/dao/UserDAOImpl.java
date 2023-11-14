package com.team4.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.domain.UserVO;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO{

	@Autowired
	private SqlSessionTemplate mybatis;
	
	public Integer insertUser(UserVO vo) {
		System.out.println("UserDAOImpl >> insertUser");
		int result = mybatis.insert("UserDAO.insertUser", vo);
		System.out.println("UserDAOImpl >> insertUser / result : " + result);
		return result;
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
		System.out.println("UserDAOImpl >> getUser");
		UserVO result = (UserVO)mybatis.selectOne("UserDAO.selectUser", vo);
		System.out.println("UserDAOImpl >> getUser / result : "+result);
		return result;
	}

	@Override
	public List<UserVO> getUserList(HashMap map) {
//		System.out.println("UserDAOImpl >> getUserList");
		List<UserVO> result = mybatis.selectList("UserDAO.selectUserList", map);
//		System.out.println("UserDAOImpl >> getUserList / result : "+result);
		return result;
	}
}
