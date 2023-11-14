package com.team4.service;

import java.util.HashMap;
import java.util.List;

import com.team4.domain.ImageVO;

public interface ImageService {
	// CRUD 기능의 메소드 구현
	// 글 등록
	Integer insertImage(ImageVO vo);

	// 글 수정
	Integer updateImage(ImageVO vo);

	// 글 삭제
	Integer deleteImage(ImageVO vo);

	// 글 상세 조회
	ImageVO getImage(ImageVO vo);

	// 글 목록 조회
	List<ImageVO> getImageList(HashMap map);
}
