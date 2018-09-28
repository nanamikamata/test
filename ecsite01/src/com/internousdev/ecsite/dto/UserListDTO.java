package com.internousdev.ecsite.dto;

public class UserListDTO {
	public String user_id;
	public String login_id;
	public String login_pass;
	public String user_name;
	public String insert_date;
	public String update_date;

	public String getId(){
		return user_id;
	}
	public void setId(String id){
		this.user_id=id;
	}
	public String getLoginId(){
		return this.login_id;
	}
	public void setLoginId(String login_id){
		this.login_id=login_id;
	}
	public String getLoginPass(){
		return this.login_pass;
	}
	public void setLoginPass(String login_pass){
		this.login_pass=login_pass;
	}
	public String getUserName(){
		return this.user_name;
	}
	public void setUserName(String user_name){
		this.user_name=user_name;
	}
	public String getInsert_date(){
		return insert_date;
	}
	public void setInsert_date(String insert_date){
		this.insert_date=insert_date;
	}
	public String getUpdate_date(){
		return update_date;
	}
	public void setUpdate_date(String update_date){
		this.update_date=update_date;
	}

}
