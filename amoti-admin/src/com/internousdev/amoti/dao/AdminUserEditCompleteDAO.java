package com.internousdev.amoti.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.amoti.util.DBConnector;


public class AdminUserEditCompleteDAO {
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();

	private String sql = "UPDATE user_info SET user_id = ?, password = ?, family_name = ?, first_name = ?, family_name_kana = ?,"
				+ " first_name_kana = ?, sex = ?, email = ?, status = ?, logined = ?, regist_date = ?, update_date = ?";

	public void updateUser(String id, String userId, String password, String familyName, String firstName,String familyNameKana,
			String firstNameKana, String sex, String email, String status, String logined, String registDate, String updateDate)
			throws SQLException{
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, userId);
			ps.setString(3, password);
			ps.setString(4, familyName);
			ps.setString(5, firstName);
			ps.setString(6, familyNameKana);
			ps.setString(7, firstNameKana);
			ps.setString(8, sex);
			ps.setString(9, email);
			ps.setString(10, status);
			ps.setString(11, logined);
			ps.setString(12,  registDate);
			ps.setString(13, updateDate);
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
	}
}
