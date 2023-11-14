package com.team4.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.dao.VisitorDAO;
import com.team4.domain.VisitorVO;

@Service("visitorService")
public class VisitorServiceImpl implements VisitorService{
	
	@Autowired
	private VisitorDAO visitorDAO;

	@Override
	public Integer insertVisitor(VisitorVO vo) {
		System.out.println("VisitorServiceImpl >> updateVisitor");
		Integer result = visitorDAO.insertVisitor(vo);
		System.out.println("VisitorServiceImpl >> updateVisitor / result : "+result);
		return result;
	}

	@Override
	public Integer updateVisitor(VisitorVO vo) {
//		System.out.println("VisitorServiceImpl >> updateVisitor");
		Integer result = visitorDAO.updateVisitor(vo);
//		System.out.println("VisitorServiceImpl >> updateVisitor / result : "+result);
		return result;
	}

	@Override
	public Integer deleteVisitor(VisitorVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VisitorVO getVisitor(VisitorVO vo) {
		System.out.println("VisitorServiceImpl >> updateVisitor");
		VisitorVO result = visitorDAO.getVisitor(vo);
		System.out.println("VisitorServiceImpl >> updateVisitor / result : "+result);
		return result;
	}

	@Override
	public List<VisitorVO> getVisitorList(HashMap map) {
		System.out.println("VisitorServiceImpl >> getVisitorList");
		List<VisitorVO> result = visitorDAO.getVisitorList(map);
		System.out.println("VisitorServiceImpl >> getVisitorList / result : "+result);
		return result;
	}
	

}
