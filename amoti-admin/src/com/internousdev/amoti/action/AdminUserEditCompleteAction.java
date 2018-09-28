package com.internousdev.amoti.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.amoti.dao.AdminUserEditCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;


public class AdminUserEditCompleteAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private AdminUserEditCompleteDAO dao = new AdminUserEditCompleteDAO();

	public String execute() throws SQLException{
		dao.updateUser(session.get("id").toString(),
			session.get("user_id").toString(),
			session.get("password").toString(),
			session.get("family_name").toString(),
			session.get("first_name").toString(),
			session.get("family_name_kana").toString(),
			session.get("first_name_kana").toString(),
			session.get("sex").toString(),
			session.get("email").toString(),
			session.get("status").toString(),
			session.get("logined").toString(),
			session.get("regist_date").toString(),
			session.get("update_date").toString());
		String result = SUCCESS;
		return result;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
