package com.internousdev.amoti.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.amoti.dao.AdminProductEditCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class AdminProductEditCompleteAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private AdminProductEditCompleteDAO dao = new AdminProductEditCompleteDAO();

	public String execute() throws SQLException{
		dao.updateUser(session.get("id").toString(),
			session.get("product_id").toString(),
			session.get("product_name").toString(),
			session.get("product_name_kana").toString(),
			session.get("product_description").toString(),
			session.get("category_id").toString(),
			session.get("price").toString(),
			session.get("image_file_path").toString(),
			session.get("image_file_name").toString(),
			session.get("release_date").toString(),
			session.get("release_company").toString(),
			session.get("status").toString(),
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
