package com.team4.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.domain.VisitorVO;

@Repository("visitorDAO")
public class VisitorDAOImpl implements VisitorDAO{
	
	@Autowired
	private SqlSessionTemplate mybatis;

	@Override
	public Integer insertVisitor(VisitorVO vo) {
		System.out.println("VisitorDAOImpl >> insertVisitor");
		Integer result = mybatis.insert("visitorDAO.insertVisitorCount");
		System.out.println("VisitorDAOImpl >> insertVisitor / result : "+result);
		return result;
	}

	@Override
	public Integer updateVisitor(VisitorVO vo) {
//		System.out.println("VisitorDAOImpl >> updateVisitor");
		Integer result = mybatis.update("visitorDAO.updateVisitorCount");;
//		System.out.println("VisitorDAOImpl >> updateVisitor / result : "+result);
		return result;
	}

	@Override
	public Integer deleteVisitor(VisitorVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VisitorVO getVisitor(VisitorVO vo) {
		System.out.println("VisitorDAOImpl >> getVisitor");
		VisitorVO result = mybatis.selectOne("visitorDAO.selectVisitorCount");
		System.out.println("VisitorDAOImpl >> getVisitor / result : "+result);
		return result;
	}

	@Override
	public List<VisitorVO> getVisitorList(HashMap map) {
		System.out.println("VisitorDAOImpl >> getVisitorList");
		List<VisitorVO> result = mybatis.selectList("visitorDAO.selectVisitorList", map);
		System.out.println("VisitorDAOImpl >> getVisitorList / result : "+result);
		return result;
	}

}
