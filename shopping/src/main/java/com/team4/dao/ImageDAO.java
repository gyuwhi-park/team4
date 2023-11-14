package com.team4.dao;

import java.util.HashMap;
import java.util.List;

import com.team4.domain.ImageVO;

public interface ImageDAO {
	Integer insertImage(ImageVO vo);

	Integer updateImage(ImageVO vo);

	Integer deleteImage(ImageVO vo);

	ImageVO getImage(ImageVO vo);

	List<ImageVO> getImageList(HashMap map);
}
