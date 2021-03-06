package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemListDAO;
import com.internousdev.ecsite.dto.ItemListDTO;
import com.opensymphony.xwork2.ActionSupport;


public class ItemListAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private ItemListDAO itemListDAO=new ItemListDAO();
	private ArrayList<ItemListDTO> itemListInfoDTO=new ArrayList<ItemListDTO>();
	private String deleteFlg;
	private String message;

	public String execute() throws SQLException{
		//商品履歴を削除しない場合
		if(deleteFlg == null){

			itemListInfoDTO=itemListDAO.getItemListInfo();

		//商品履歴を削除する場合
		}else if(deleteFlg.equals("1")){
			delete();
		}
		String result=SUCCESS;
		return result;
	}

	public void delete() throws SQLException{


		int res=itemListDAO.itemHistoryDelete();

		if(res>0){
			itemListInfoDTO=null;
			setMessage("商品情報を正しく削除しました。");
		}else if(res==0){
			setMessage("商品情報の削除に失敗しました。");
		}
	}

	public String getDeleteFlg(){
		return deleteFlg;
	}

	public void setDeleteFlg(String deleteFlg){
		this.deleteFlg=deleteFlg;
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

