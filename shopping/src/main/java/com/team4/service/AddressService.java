package com.team4.service;

import java.util.List;
import com.team4.domain.AddressVO;
import java.util.HashMap;

public interface AddressService {
	// CRUD 기능의 메소드 구현
	// 글 등록
	Integer insertAddress(AddressVO vo);

	// 글 수정
	Integer updateAddress(AddressVO vo);

	// 글 삭제
	Integer deleteAddress(AddressVO vo);

	// 글 상세 조회
	AddressVO getAddress(AddressVO vo);

	// 글 목록 조회
	List<AddressVO> getAddressList(HashMap map);
}
