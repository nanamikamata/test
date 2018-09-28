package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.LoginDAO;
import com.internousdev.ecsite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private ArrayList<LoginDTO> buyItemListDTO=new ArrayList<LoginDTO>();
	private LoginDAO loginDAO=new LoginDAO();
	private LoginDTO loginDTO=new LoginDTO();

	public String execute() throws SQLException{
		String result="login";
		if(session.containsKey("id")){

		buyItemListDTO=loginDAO.getBuyItemList();
		session.put("id", loginDTO.getId());
		session.put("buyItem_name", loginDTO.getItemName());
		session.put("buyItem_price", loginDTO.getItemPrice());

			result=SUCCESS;
		}
		return result;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}

	public Map<String,Object> getSession(){
		return this.session;
	}

	public ArrayList<LoginDTO> getBuyItemListDTO(){
		return this.buyItemListDTO;
	}

	public void setBuyItemListDTO(ArrayList<LoginDTO> itemList){
		this.buyItemListDTO=itemList;
	}

}


