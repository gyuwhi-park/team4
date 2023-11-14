package com.team4.service;

import java.util.List;
import com.team4.domain.ColorVO;
import java.util.HashMap;

public interface ColorService {
	// CRUD 기능의 메소드 구현
	// 글 등록
	Integer insertColor(ColorVO vo);

	// 글 수정
	Integer updateColor(ColorVO vo);

	// 글 삭제
	Integer deleteColor(ColorVO vo);

	// 글 상세 조회
	ColorVO getColor(ColorVO vo);

	// 글 목록 조회
	List<ColorVO> getColorList(HashMap map);
}
