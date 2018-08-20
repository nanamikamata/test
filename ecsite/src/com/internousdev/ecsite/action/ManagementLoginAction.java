package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ManagementLoginDAO;
import com.internousdev.ecsite.dto.ManagementLoginDTO;
import com.opensymphony.xwork2.ActionSupport;


public class ManagementLoginAction extends ActionSupport implements SessionAware{
	private String loginUserId;
	private String loginPassword;
	public Map<String,Object> session;
	private ManagementLoginDAO managementloginDAO=new ManagementLoginDAO();
	private ManagementLoginDTO managementloginDTO=new ManagementLoginDTO();

	public String execute(){
		String result=ERROR;
		managementloginDTO=managementloginDAO.getLoginManagementInfo(loginUserId,loginPassword);
		session.put("loginUser", managementloginDTO);

		if(((ManagementLoginDTO) session.get("loginUser")).getLoginFlg()){
			result=SUCCESS;

			session.put("login_user_id", managementloginDTO.getLoginId());

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

}
