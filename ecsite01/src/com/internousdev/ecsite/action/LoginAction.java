package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.LoginDAO;
import com.internousdev.ecsite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

//ログイン機能
public class LoginAction extends ActionSupport implements SessionAware{

	private String loginUserId;
	private String loginPassword;
	public Map<String,Object> session;
	private LoginDAO loginDAO=new LoginDAO();
	private LoginDTO loginDTO=new LoginDTO();

	private ArrayList<LoginDTO> buyItemListDTO=new ArrayList<LoginDTO>();
	private String message;


	public String execute() throws SQLException{
		String result=ERROR;
		loginDTO=loginDAO.getLoginUserInfo(loginUserId,loginPassword);
		session.put("loginUser", loginDTO);

		if(((LoginDTO) session.get("loginUser")).getLoginFlg()){
			result=SUCCESS;

			buyItemListDTO=loginDAO.getBuyItemList();
			session.put("login_user_id", loginDTO.getLoginId());
			return result;
		}
		return result;
	}
	public String getLoginUserId(){
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId){
		this.loginUserId=loginUserId;
	}
	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword=loginPassword;
	}
	public Map<String,Object> getSession(){
		return session;
	}
	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}


	//ログインおわり

	//商品一覧ページBuyItemListAction

	public ArrayList<LoginDTO> getBuyItemListDTO(){
		return this.buyItemListDTO;
	}

	public void setBuyItemListDTO(ArrayList<LoginDTO> buyItemListDTO){
		this.buyItemListDTO=buyItemListDTO;
	}

	public String getMessage(){
		return this.message;
	}

	public void setMessage(String message){
		this.message=message;
	}


}


