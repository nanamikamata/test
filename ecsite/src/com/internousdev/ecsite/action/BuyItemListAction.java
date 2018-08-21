package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemListDAO;
import com.internousdev.ecsite.dto.ItemListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemListAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private ItemListDAO itemListDAO=new ItemListDAO();
	private ArrayList<ItemListDTO> itemListInfoDTO=new ArrayList<ItemListDTO>();
	private String message;

	public String execute() throws SQLException{

		itemListInfoDTO=itemListDAO.getItemListInfo();

		String result=SUCCESS;
		return result;
	}

	public Map<String,Object> getSession(){
		return session;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}

	public ArrayList<ItemListDTO> getItemListInfoDTO(){
		return this.itemListInfoDTO;
	}

	public void setItemListInfoDTO(ArrayList<ItemListDTO> itemList){
		this.itemListInfoDTO=itemList;
	}

	public String getMessage(){
		return this.message;
	}

	public void setMessage(String message){
		this.message=message;
	}



}
