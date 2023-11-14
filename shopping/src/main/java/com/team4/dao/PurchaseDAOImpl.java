package com.team4.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.domain.PurchaseVO;
import com.team4.domain.VisitorVO;

@Repository("purchaseDAO")
public class PurchaseDAOImpl implements PurchaseDAO{
	
	@Autowired
	private SqlSessionTemplate mybatis;

	@Override
	public Integer insertPurchase(PurchaseVO vo) {
		System.out.println("PurchaseDAOImpl >> insertPurchase");
		Integer result = mybatis.insert("purchaseDAO.insertPurchase", vo);
		System.out.println("PurchaseDAOImpl >> insertPurchase / result : "+result);
		return result;
	}

	@Override
	public Integer updatePurchase(PurchaseVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deletePurchase(PurchaseVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PurchaseVO getPurchase(PurchaseVO vo) {
		
		PurchaseVO result = mybatis.selectOne("purchaseDAO.getPurchase", vo);
		System.out.println(result.toString());
		return result;
	}

	@Override
	public List<PurchaseVO> getPurchaseList(HashMap map) {
//		System.out.println("PurchaseDAOImpl >> getPurchaseList");
		List<PurchaseVO> result = mybatis.selectList("purchaseDAO.selectPurchaseList", map);
//		System.out.println("PurchaseDAOImpl >> getPurchaseList / result : "+result);
		return result;
	}
	
	public PurchaseVO getOrder(PurchaseVO vo) {
		System.out.println("PurchaseDAOImpl >> getOrder");
		return mybatis.selectOne("purchaseDAO.getOrder", vo);
	}
	
	public List<PurchaseVO> getOrderList(HashMap map) {
		System.out.println("PurchaseDAOImpl >> getOrderList");
		return mybatis.selectList("purchaseDAO.getOrderList",map);
	}
	
	public PurchaseVO getOrderCount(PurchaseVO vo) {
		System.out.println("PurchaseDAOImpl >> getOrderCount");
		return mybatis.selectOne("purchaseDAO.getOrderCount",vo);
	}

	public List<PurchaseVO> getPurchaseCount(HashMap map) {
//		System.out.println("PurchaseDAOImpl >> getPurchaseList");
		List<PurchaseVO> result = mybatis.selectList("purchaseDAO.selectPurchaseCount", map);
//		System.out.println("PurchaseDAOImpl >> getPurchaseList / result : "+result);
		return result;
	}
	public PurchaseVO getPurchaseDetail(PurchaseVO vo) {
		PurchaseVO result = mybatis.selectOne("purchaseDAO.selectPurchaseDetail", vo);
		return result;
	}
	
	@Override
	public List<PurchaseVO> getDateList(HashMap map) {
		System.out.println("PurchaseDAOImpl >> getDateList : " + map.toString());
		List<PurchaseVO> result = mybatis.selectList("purchaseDAO.getDateList", map);
		System.out.println("PurchaseDAOImpl >> getDateList / result : "+result);
		return result;
	}

	//order 페이징

	public List<PurchaseVO> pagingList(Map<String, Integer> pagingParams) {
		 
		return mybatis.selectList("purchaseDAO.pagingList", pagingParams);
	}
	
	//order 페이징
	
	public int purchaseCount() {
		
		return mybatis.selectOne("purchaseDAO.purchasePageCount");
		
	}

	@Override
	public List<PurchaseVO> getUserPurchaseList(HashMap map) {
//		System.out.println("PurchaseDAOImpl >> getPurchaseList");
		List<PurchaseVO> result = mybatis.selectList("purchaseDAO.getUserPurchaseList", map);
//		System.out.println("PurchaseDAOImpl >> getPurchaseList / result : "+result);
		return result;
	}
}
