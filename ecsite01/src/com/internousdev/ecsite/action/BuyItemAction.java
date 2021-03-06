package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.LoginDAO;
import com.internousdev.ecsite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware{
	private String id;
	private LoginDAO loginDAO=new LoginDAO();
	private ArrayList<LoginDTO> buyItemListDTO=new ArrayList<LoginDTO>();
	private Map<String, Object> session;
	private String message;

	public String execute(){
		String result = ERROR;
		LoginDTO loginDTO=new LoginDTO();

		try {
		loginDTO=loginDAO.getBuyItemList(id);
		session.put("id", loginDTO.getId());
		session.put("itemName", loginDTO.getItemName());
		session.put("itemPrice", loginDTO.getItemPrice());
		session.put("itemStock", loginDTO.getItemStock());
		session.put("insert_date", loginDTO.getInsert_date());
		List<Integer> itemCountList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		session.put("itemCountList", itemCountList);
		Iterator<LoginDTO> iterator =buyItemListDTO.iterator();
		if(!(iterator.hasNext())) {
			itemCountList = null;
		}
		if(!buyItemListDTO.isEmpty() || itemCountList==null) {
			session.put("buyItemListDTO", buyItemListDTO);
			result = SUCCESS;
			return result;
		}


		}catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return result;
		}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<LoginDTO> getBuyItemListDTO() {
		return buyItemListDTO;
	}
	public void setProductInfoDtoList(ArrayList<LoginDTO> buyItemListDTO) {
		this.buyItemListDTO = buyItemListDTO;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public String getMessage(){
		return this.message;
	}

	public void setMessage(String message){
		this.message=message;
	}


}
