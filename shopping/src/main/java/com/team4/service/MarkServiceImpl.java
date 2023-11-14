package com.team4.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.dao.MarkDAO;
import com.team4.domain.MarkVO;
import com.team4.domain.PageVO;
import com.team4.domain.PurchaseVO;

@Service
public class MarkServiceImpl implements MarkService{

	@Autowired
	private MarkDAO markDAO;

	@Override
	public Integer insertMark(MarkVO vo) {
		
		return markDAO.insertMark(vo);
	
	}

	@Override
	public Integer updateMark(MarkVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteMark(MarkVO vo) {
		System.out.println("MarkServiceImpl : deleteMark");
		return markDAO.deleteMark(vo);
	}

	@Override
	public MarkVO getMark(MarkVO vo) {

		return markDAO.getMark(vo); 
	}

	@Override
	public List<MarkVO> getMarkList(HashMap map) {

		return markDAO.getMarkList(map);
	}

	int pageLimit = 3; // 한 페이지당 보여줄 글 갯수
	int blockLimit = 3; // 하단에 보여줄 페이지 번호 갯수

	@Override
	public List<MarkVO> pagingList(int page) {
 
		/* 
		 * 1page => 0
		 * 2page => 3
		 * 3page => 6
		 */
		int pageStart = (page-1)*pageLimit;
		Map<String, Integer> pagingParams = new HashMap(); 
		Integer pagingStart;
		pagingParams.put("start", pageStart);
		pagingParams.put("limit", pageLimit);
		List<MarkVO> pagingList = markDAO.pagingList(pagingParams);

		return pagingList;

	}

	@Override
	public PageVO pagingParam(int page) {
		// 전체 글 갯수 조회
		int purchaseCount = markDAO.markCount();
		// 전체 페이지 갯수 계산 (10/3=3.3333 =>4)
		int maxPage = (int)(Math.ceil((double) purchaseCount / pageLimit));
		// 시작 페이지 값 계산(1,4,7,10,~~~~) 그래서 -1
		int startPage = (((int)(Math.ceil((double)page/ blockLimit )))-1)* blockLimit + 1;
		// 끝 페이지 값 계산(3,6,9,12 ~~~~~)
		int endPage = startPage + blockLimit -1;
		if (endPage > maxPage) {
			endPage = maxPage;
		}
		PageVO vo = new PageVO();
		vo.setPage(page);
		vo.setMaxPage(maxPage);
		vo.setStartPage(startPage);
		vo.setEndPage(endPage);

		return vo;
	}

	@Override
	public Integer insertMainMark(MarkVO vo) {
		System.out.println("MarkServiceImpl : insertMainMark");
		return markDAO.insertMainMark(vo);
	}
}
