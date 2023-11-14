package com.team4.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.dao.ImageDAO;
import com.team4.domain.ImageVO;

@Service("imageService")
public class ImageServiceImpl implements ImageService{

	@Autowired
	private ImageDAO imageDAO;
	
	@Override
	public Integer insertImage(ImageVO vo) {
		System.out.println("ImageServiceImpl >> insertImage");
		System.out.println(vo.toString());
		return imageDAO.insertImage(vo);
	}

	@Override
	public Integer updateImage(ImageVO vo) {
		System.out.println("ImageServiceImpl >> updateImage");
		System.out.println(vo.toString());
		return imageDAO.updateImage(vo);
	}

	@Override
	public Integer deleteImage(ImageVO vo) {
		System.out.println("ImageServiceImpl >> deleteImage");
		System.out.println(vo.toString());
		return imageDAO.deleteImage(vo);
	}

	@Override
	public ImageVO getImage(ImageVO vo) {
		System.out.println("ImageServiceImpl >> getImage");
		System.out.println(vo.toString());
		return imageDAO.getImage(vo);
	}

	@Override
	public List<ImageVO> getImageList(HashMap map) {
		System.out.println("ImageServiceImpl >> getImageList");
		System.out.println(map.toString());
		return imageDAO.getImageList(map);
	}

}
