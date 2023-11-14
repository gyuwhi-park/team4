package com.team4.dao;

import java.util.HashMap;
import java.util.List;

import com.team4.domain.UserVO;

public interface UserDAO {
	public Integer insertUser(UserVO vo);

	public Integer updateUser(UserVO vo) ;

	public Integer deleteUser(UserVO vo);

	public UserVO getUser(UserVO vo) ;

	public List<UserVO> getUserList(HashMap map) ;
}
