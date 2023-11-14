package com.team4.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.domain.ImageVO;

@Repository("imageDAO")
public class ImageDAOImpl implements ImageDAO{
	
	@Autowired
	private SqlSessionTemplate mybatis;

	@Override
	public Integer insertImage(ImageVO vo) {
		System.out.println("ImageDAOImpl >> insertImage");
		int result = mybatis.insert("ImageDAO.insertImage", vo);
		System.out.println("ImageDAOImpl >> insertImage / result : " + result);
		return result;
	}

	@Override
	public Integer updateImage(ImageVO vo) {
		System.out.println("ImageDAOImpl >> updateImage");
		int result = mybatis.update("ImageDAO.updateImage", vo);
		System.out.println("ImageDAOImpl >> updateImage / result : " + result);
		return result;
	}

	@Override
	public Integer deleteImage(ImageVO vo) {
		System.out.println("ImageDAOImpl >> deleteImage");
		int result = mybatis.delete("ImageDAO.deleteImage", vo);
		System.out.println("ImageDAOImpl >> deleteImage / result : " + result);
		return result;
	}

	@Override
	public ImageVO getImage(ImageVO vo) {
		System.out.println("ImageDAOImpl >> getImage");
		ImageVO result = mybatis.selectOne("ImageDAO.getImage", vo);
		System.out.println("ImageDAOImpl >> getImage / result : " + result);
		return result;
	}

	@Override
	public List<ImageVO> getImageList(HashMap map) {
		List<ImageVO> result = mybatis.selectList("ImageDAO.getImageList", map);
		System.out.println("ImageDAOImpl >> getImageList / result : " + result);
		return result;
	}

}
