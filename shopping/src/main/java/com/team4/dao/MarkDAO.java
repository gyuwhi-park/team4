package com.team4.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.team4.domain.MarkVO;
import com.team4.domain.PurchaseVO;

public interface MarkDAO {
	public Integer insertMark(MarkVO vo);

	public Integer updateMark(MarkVO vo) ;

	public Integer deleteMark(MarkVO vo);

	public MarkVO getMark(MarkVO vo) ;

	public List<MarkVO> getMarkList(HashMap map) ;

	public List<MarkVO> pagingList(Map<String, Integer> pagingParams);
	
	public int markCount();
	
	public Integer insertMainMark(MarkVO vo);
}
