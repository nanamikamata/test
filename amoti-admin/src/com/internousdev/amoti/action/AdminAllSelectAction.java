package com.internousdev.amoti.action;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.amoti.dao.CartInfoDAO;
import com.internousdev.amoti.dao.DestinationInfoDAO;
import com.internousdev.amoti.dao.MCategoryDAO;
import com.internousdev.amoti.dao.ProductInfoDAO;
import com.internousdev.amoti.dao.PurchaseHistoryInfoDAO;
import com.internousdev.amoti.dao.UserInfoDAO;
import com.internousdev.amoti.dto.CartInfoDTO;
import com.internousdev.amoti.dto.DestinationInfoDTO;
import com.internousdev.amoti.dto.MCategoryDTO;
import com.internousdev.amoti.dto.ProductInfoDTO;
import com.internousdev.amoti.dto.PurchaseHistoryInfoDTO;
import com.internousdev.amoti.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AdminAllSelectAction extends ActionSupport implements SessionAware{
	private Map <String ,Object >session;

	private List<MCategoryDTO> mCategoryAllDtoList = new ArrayList<MCategoryDTO>();
	private List<UserInfoDTO> userInfoAllDtoList = new ArrayList<UserInfoDTO>();
	private List<DestinationInfoDTO> DestinationInfoAllDtoList = new ArrayList<DestinationInfoDTO>();
	private List<CartInfoDTO> CartInfoAllDtoList = new ArrayList<CartInfoDTO>();
	private List<ProductInfoDTO> ProductInfoAllDtoList = new ArrayList<ProductInfoDTO>();
	private List<PurchaseHistoryInfoDTO> PurchaseHistoryInfoAllDtoList = new ArrayList<PurchaseHistoryInfoDTO>();
	public String execute(){
		// ステータスが１の時だけAdmin.jspを表示させる。
		String result;

		result = ERROR;

		try{
			MCategoryDAO mCategoryDao = new MCategoryDAO();
			mCategoryAllDtoList = mCategoryDao.getMCategoryList();
			session.put("mCategoryAllDtoList", userInfoAllDtoList);

			UserInfoDAO UserInfoDao = new UserInfoDAO();
			userInfoAllDtoList = UserInfoDao.getUserInfoAllList();
			session.put("UserInfoAllDtoList", userInfoAllDtoList);

			DestinationInfoDAO DestinationInfoDao = new DestinationInfoDAO();
			DestinationInfoAllDtoList = DestinationInfoDao.getDestinationInfoAllList();
			session.put("DestinationInfoAllDtoList", DestinationInfoAllDtoList);

			CartInfoDAO CartInfoDao = new CartInfoDAO();
			CartInfoAllDtoList = CartInfoDao.getCartInfoAllDtoList();
			session.put("CartInfoAllDtoList", CartInfoAllDtoList);

			ProductInfoDAO ProductInfoDao = new ProductInfoDAO();
			ProductInfoAllDtoList = ProductInfoDao.getProductInfoAllList();
			session.put("ProductInfoAllDtoList",ProductInfoAllDtoList);

			PurchaseHistoryInfoDAO PurchaseHistoryInfoDao = new PurchaseHistoryInfoDAO();
			PurchaseHistoryInfoAllDtoList = PurchaseHistoryInfoDao.getPurchaseHistoryAllList();
			session.put("PurchaseHistoryInfoAllDtoList",PurchaseHistoryInfoAllDtoList);


			result = SUCCESS;
		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}
	public List<MCategoryDTO> getmCategoryAllDtoList() {
		return mCategoryAllDtoList;
	}
	public void setmCategoryAllDtoList(List<MCategoryDTO> mCategoryAllDtoList) {
		this.mCategoryAllDtoList = mCategoryAllDtoList;
	}
	public List<ProductInfoDTO> getProductInfoAllDtoList() {
		return ProductInfoAllDtoList;
	}
	public void setProductInfoAllDtoList(List<ProductInfoDTO> productInfoAllDtoList) {
		ProductInfoAllDtoList = productInfoAllDtoList;
	}
	public List<PurchaseHistoryInfoDTO> getPurchaseHistoryInfoAllDtoList() {
		return PurchaseHistoryInfoAllDtoList;
	}
	public void setPurchaseHistoryInfoAllDtoList(List<PurchaseHistoryInfoDTO> purchaseHistoryInfoAllDtoList) {
		PurchaseHistoryInfoAllDtoList = purchaseHistoryInfoAllDtoList;
	}
	public Map<String,Object> getSession(){
		return session;
	}
	public void setSession(Map<String,Object>session){
		this.session = session;
	}
	public List<MCategoryDTO>getMCategoryAllDtoList(){
		return mCategoryAllDtoList;
	}
	public void setMCategoryAllDtoList(List<MCategoryDTO> mCategoryAllDtoList){
		this.mCategoryAllDtoList = mCategoryAllDtoList;
	}
	public List<UserInfoDTO> getUserInfoAllDtoList() {
		return userInfoAllDtoList;
	}

	public void setUserInfoAllDtoList(List<UserInfoDTO> userInfoAllDtoList) {
		this.userInfoAllDtoList = userInfoAllDtoList;
	}

	public List<DestinationInfoDTO> getDestinationInfoAllDtoList() {
		return DestinationInfoAllDtoList;
	}

	public void setDestinationInfoAllDtoList(List<DestinationInfoDTO> destinationInfoAllDtoList) {
		DestinationInfoAllDtoList = destinationInfoAllDtoList;
	}

	public List<CartInfoDTO> getCartInfoAllDtoList() {
		return CartInfoAllDtoList;
	}

	public void setCartInfoAllDtoList(List<CartInfoDTO> cartInfoAllDtoList) {
		CartInfoAllDtoList = cartInfoAllDtoList;
	}
}
