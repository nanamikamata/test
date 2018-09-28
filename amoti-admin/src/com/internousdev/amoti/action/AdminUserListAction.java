package com.internousdev.amoti.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.amoti.dao.AdminUserListDAO;
import com.internousdev.amoti.dto.AdminUserListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AdminUserListAction extends ActionSupport implements SessionAware{

	public Map<String, Object> session;
	private List<AdminUserListDTO> adminUserList = new ArrayList<AdminUserListDTO>();
	private AdminUserListDAO userListDAO = new AdminUserListDAO();

	public String execute() throws SQLException{
		adminUserList = userListDAO.getAdminUserListInfo();

		String result = SUCCESS;
		return result;
	}

	public Map<String, Object> getSession(){
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

	public List<AdminUserListDTO> getAdminUserList(){
		return adminUserList;
	}
	public void setUserInfo(List<AdminUserListDTO> adminUserList){
		this.adminUserList = adminUserList;
	}
}
