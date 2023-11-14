package com.team4.dao;

import java.util.HashMap;
import java.util.List;

import com.team4.domain.VisitorVO;

public interface VisitorDAO {
	public Integer insertVisitor(VisitorVO vo);

	public Integer updateVisitor(VisitorVO vo) ;

	public Integer deleteVisitor(VisitorVO vo);

	public VisitorVO getVisitor(VisitorVO vo) ;

	public List<VisitorVO> getVisitorList(HashMap map) ;
}
