package com.team4.service;

import java.util.List;
import com.team4.domain.UserVO;
import java.util.HashMap;

public interface UserService {
	// CRUD 기능의 메소드 구현
	// 글 등록
	Integer insertUser(UserVO vo);

	// 글 수정
	Integer updateUser(UserVO vo);

	// 글 삭제
	Integer deleteUser(UserVO vo);

	// 글 상세 조회
	UserVO getUser(UserVO vo);

	// 글 목록 조회
	List<UserVO> getUserList(HashMap map);
}
