package com.internousdev.amoti.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.amoti.dao.AdminUserListDAO;
import com.internousdev.amoti.dto.AdminUserListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AdminUserDetailsAction extends ActionSupport implements SessionAware{
	private String id;
	private AdminUserListDAO adminUserListDAO=new AdminUserListDAO();
	private Map<String, Object> session;
	private String deleteFlg;
	private String message;

	public String execute(){
		String result = ERROR;
		AdminUserListDTO adminUserListDTO = new AdminUserListDTO();
		try{
			if(deleteFlg == null){

			int intId = Integer.parseInt(id);
			adminUserListDTO = adminUserListDAO.getAdminUserListInfo(intId);
			session.put("id", adminUserListDTO.getId());
			session.put("userId", adminUserListDTO.getUserId());
			session.put("password",adminUserListDTO.getPassword());
			session.put("familyName", adminUserListDTO.getFamilyName());
			session.put("firstName", adminUserListDTO.getFirstName());
			session.put("familyNameKana", adminUserListDTO.getFamilyNameKana());
			session.put("firstNameKana", adminUserListDTO.getFirstNameKana());
			session.put("sex", adminUserListDTO.getSex());
			session.put("email", adminUserListDTO.getEmail());
			session.put("status", adminUserListDTO.getStatus());
			session.put("logined", adminUserListDTO.getLogined());
			session.put("registDate", adminUserListDTO.getRegistDate());
			session.put("updateDate", adminUserListDTO.getUpdateDate());

			result = SUCCESS;
			return result;

			}else if(deleteFlg.equals("1")){
				delete();
			}
		}catch (SQLException e){
			e.printStackTrace();
		}
		return result;
	}

	public void delete() throws SQLException{
		AdminUserListDAO dao = new AdminUserListDAO();
		int res=dao.adminUserListHistoryDelete(Integer.parseInt(String.valueOf(session.get("id"))));

		if(res>0){
			setMessage("ユーザー情報を正しく削除しました。");
		}else if(res==0){
			setMessage("ユーザー情報の削除に失敗しました。");
		}
	}

		public String getDeleteFlg(){
			return deleteFlg;
		}

		public void setDeleteFlg(String deleteFlg){
			this.deleteFlg=deleteFlg;
		}

		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}

		public Map<String, Object> getSession() {
			return session;
		}
		public void setSession(Map<String, Object> session) {
			this.session = session;
		}
		public String getMessage(){
			return this.message;
		}

		public void setMessage(String message){
			this.message=message;
		}
}
