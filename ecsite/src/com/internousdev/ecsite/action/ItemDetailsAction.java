package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemListDAO;
import com.internousdev.ecsite.dto.ItemListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemDetailsAction extends ActionSupport implements SessionAware{
	private String id;
	private ArrayList<ItemListDTO> itemListInfoDTO=new ArrayList<ItemListDTO>();
	private Map<String, Object> session;

	public String execute(){
		String result = ERROR;
		ItemListDTO itemListDTO=new ItemListDTO();
		ItemListDAO itemListDAO=new ItemListDAO();
		try {
			itemListDTO=itemListDAO.getItemListInfo(id);
			session.put("id", itemListDTO.getId());
			session.put("itemName", itemListDTO.getItemName());
			session.put("itemPrice", itemListDTO.getItemPrice());
			session.put("itemStock", itemListDTO.getItemStock());
			session.put("insert_date", itemListDTO.getInsert_date());
			List<Integer> itemCountList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
			session.put("itemCountList", itemCountList);
			Iterator<ItemListDTO> iterator =itemListInfoDTO.iterator();
			if(!(iterator.hasNext())) {
				itemCountList = null;
			}
			if(!itemListInfoDTO.isEmpty() || itemCountList==null) {
				session.put("itemListInfoDTO", itemListInfoDTO);
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
	public List<ItemListDTO> getItemListInfoDTO() {
		return itemListInfoDTO;
	}
	public void setProductInfoDtoList(ArrayList<ItemListDTO> itemListInfoDTO) {
		this.itemListInfoDTO = itemListInfoDTO;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}