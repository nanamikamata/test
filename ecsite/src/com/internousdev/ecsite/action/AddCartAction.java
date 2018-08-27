package com.internousdev.ecsite.action;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.CartInfoDAO;
import com.internousdev.ecsite.dto.CartInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AddCartAction extends ActionSupport implements SessionAware{
	private int itemId;
	private String itemName;
	private int itemPrice;
	private String itemCount;
	private Map<String, Object> session;

	public String execute() {
		String result=ERROR;
		String userId = null;
		if(session.containsKey("loginId")) {
			userId = String.valueOf(session.get("loginId"));
		}
		if (!(session.containsKey("loginId"))) {
			userId = String.valueOf(session.get("userId"));

		}
		itemCount = String.valueOf((itemCount.split(" ,",0))[0]);

		CartInfoDAO cartInfoDao = new CartInfoDAO();
		int count = cartInfoDao.regist(userId,itemId,itemCount,itemPrice);
		if(count > 0) {
			result=SUCCESS;
		}
		List<CartInfoDTO> cartInfoDtoList = new ArrayList<CartInfoDTO>();
		cartInfoDtoList = cartInfoDao.getCartInfoDtoList(userId);
		Iterator<CartInfoDTO> iterator = cartInfoDtoList.iterator();
		if(!(iterator.hasNext())) {
			cartInfoDtoList = null;
		}
		session.put("cartInfoDtoList", cartInfoDtoList);
		int totalPrice = Integer.parseInt(String.valueOf(cartInfoDao.getTotalPrice(userId)));
		session.put("totalPrice", totalPrice);
		return result;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemCount() {
		return itemCount;
	}
	public void setItemCount(String itemCount) {
		this.itemCount = itemCount;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
