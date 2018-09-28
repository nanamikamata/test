package com.internousdev.amoti.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;


public class AdminUserEditConfirmAction extends ActionSupport implements SessionAware{
	private String id;
	private String userId;
	private String password;
	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private String sex;
	private String email;
	public Map<String,Object> session;

	public String execute(){
		String result = SUCCESS;

		if(!(id.equals(""))
		&& !(userId.equals(""))
		&& !(password.equals(""))
		&& !(familyName.equals(""))
		&& !(firstName.equals(""))
		&& !(familyNameKana.equals(""))
		&& !(firstNameKana.equals(""))
		&& !(sex.equals(""))
		&& !(email.equals(""))){
			session.put("id",id);
			session.put("userId",userId);
			session.put("password",password);
			session.put("familyName",familyName);
			session.put("firstName",firstName);
			session.put("familyNameKana",familyNameKana);
			session.put("firstNameKana",firstNameKana);
			session.put("sex",sex);
			session.put("email",email);
		}
		return result;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setLoginPass(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFamilyNameKana() {
		return familyNameKana;
	}
	public void set(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}
	public String getFirstNameKana() {
		return firstNameKana;
	}
	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana = firstNameKana;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}



}