package com.team4.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;

import com.team4.domain.PurchaseVO;

public interface PurchaseDAO {
	public Integer insertPurchase(PurchaseVO vo);

	public Integer updatePurchase(PurchaseVO vo) ;

	public Integer deletePurchase(PurchaseVO vo);

	public PurchaseVO getPurchase(PurchaseVO vo) ;

	public List<PurchaseVO> getPurchaseList(HashMap map) ;

	public PurchaseVO getOrderCount(PurchaseVO vo);

	public List<PurchaseVO> getOrderList(HashMap map);
	
	public List<PurchaseVO> getPurchaseCount(HashMap map) ;
	
	public PurchaseVO getPurchaseDetail(PurchaseVO vo);
	
	public List<PurchaseVO> getDateList(HashMap map);
	 
	//orderlist 페이징 
	public List<PurchaseVO> pagingList(Map<String, Integer> pagingParams);

	public int purchaseCount();

	List<PurchaseVO> getUserPurchaseList(HashMap map);


}
