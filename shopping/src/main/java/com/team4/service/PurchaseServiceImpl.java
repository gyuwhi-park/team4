package com.team4.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.dao.PurchaseDAOImpl;
import com.team4.domain.PageVO;
import com.team4.domain.PurchaseVO;

@Service("purchaseService")
public class PurchaseServiceImpl implements PurchaseService{
   
   @Autowired
   private PurchaseDAOImpl purchaseDAO;

	@Override
	public Integer insertPurchase(PurchaseVO vo) {
		System.out.println("PurchaseServiceImpl >> insertPurchase");
		Integer result = purchaseDAO.insertPurchase(vo);
		System.out.println("PurchaseServiceImpl >> insertPurchase / result : "+result);
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
   public PurchaseVO getPurchase(PurchaseVO vo) {;
         
      return purchaseDAO.getPurchase(vo);
   }    
   
   @Override
   public List<PurchaseVO> getPurchaseList(HashMap map) {
//      System.out.println("PurchaseServiceImpl >> getPurchaseList");
      List<PurchaseVO> result = purchaseDAO.getPurchaseList(map);
//      System.out.println("PurchaseServiceImpl >> getPurchaseList / result : "+result);
      return result;
   }
   public PurchaseVO getOrderCount(PurchaseVO vo) {

      return purchaseDAO.getOrderCount(vo);
   }

   public List<PurchaseVO> getOrderList(HashMap map) {
//      System.out.println("PurchaseServiceImpl >> getPurchaseList");
      List<PurchaseVO> result = purchaseDAO.getOrderList(map);
//      System.out.println("PurchaseServiceImpl >> getPurchaseList / result : "+result);
      return result;
   }
   
   public List<PurchaseVO> getPurchaseCount(HashMap map) {
      List<PurchaseVO> result = purchaseDAO.getPurchaseCount(map);
      return result;
   }


   public PurchaseVO getPurchaseDetail(PurchaseVO vo) {
      PurchaseVO result = purchaseDAO.getPurchaseDetail(vo);
      return result;
   }
   
   @Override
   public List<PurchaseVO> getDateList(HashMap map) {
      
   
      List<PurchaseVO> result =  purchaseDAO.getDateList(map);
      System.out.println("PurchaseServiceImpl >> getDateList / result : "+result);
      return result;
   }

   int pageLimit = 3; // 한 페이지당 보여줄 글 갯수
   int blockLimit = 3; // 하단에 보여줄 페이지 번호 갯수
   
   // orderlist 페이징
   @Override
   public List<PurchaseVO> pagingList(int page) {
      
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
      List<PurchaseVO> pagingList = purchaseDAO.pagingList(pagingParams);
      
      return pagingList;
   }
   
   // 페이징
   
   public PageVO pagingParam(int page) {
      // 전체 글 갯수 조회
      int purchaseCount = purchaseDAO.purchaseCount();
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

	public List<PurchaseVO> getUserPurchaseList(HashMap map) {
//		System.out.println("PurchaseServiceImpl >> getPurchaseList");
		List<PurchaseVO> result = purchaseDAO.getUserPurchaseList(map);
//		System.out.println("PurchaseServiceImpl >> getPurchaseList / result : "+result);
		return result;
	}

}