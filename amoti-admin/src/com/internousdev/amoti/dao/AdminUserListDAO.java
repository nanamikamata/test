package com.internousdev.amoti.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.amoti.dto.AdminUserListDTO;
import com.internousdev.amoti.util.DBConnector;


public class AdminUserListDAO {
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();

	public ArrayList<AdminUserListDTO> getAdminUserListInfo()throws SQLException{

		ArrayList<AdminUserListDTO> adminUserListDTO = new ArrayList<AdminUserListDTO>();

		String sql = "SELECT * FROM user_info";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				AdminUserListDTO DTO = new AdminUserListDTO();
				DTO.setId(rs.getInt("id"));
				DTO.setUserId(rs.getString("user_id"));
				DTO.setPassword(rs.getString("password"));
				DTO.setFamilyName(rs.getString("family_name"));
				DTO.setFirstName(rs.getString("first_name"));
				DTO.setFamilyNameKana(rs.getString("family_name_kana"));
				DTO.setFirstNameKana(rs.getString("first_name_kana"));
				DTO.setSex(rs.getInt("sex"));
				DTO.setEmail(rs.getString("email"));
				DTO.setStatus(rs.getString("status"));
				DTO.setLogined(rs.getInt("logined"));
				DTO.setRegistDate(rs.getDate("regist_date"));
				DTO.setUpdateDate(rs.getDate("update_date"));
				adminUserListDTO.add(DTO);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return adminUserListDTO;

		}

	public AdminUserListDTO getAdminUserListInfo(int intId) throws SQLException{
		AdminUserListDTO dto = new AdminUserListDTO();
		String sql = "SELECT * FROM user_info where id=?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, intId);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				dto.setId(rs.getInt("id"));
				dto.setUserId(rs.getString("user_id"));
				dto.setPassword(rs.getString("password"));
				dto.setFamilyName(rs.getString("family_name"));
				dto.setFirstName(rs.getString("first_name"));
				dto.setFamilyNameKana(rs.getString("family_name_kana"));
				dto.setFirstNameKana(rs.getString("first_name_kana"));
				dto.setSex(rs.getInt("sex"));
				dto.setEmail(rs.getString("email"));
				dto.setStatus(rs.getString("status"));
				dto.setLogined(rs.getInt("logined"));
				dto.setRegistDate(rs.getDate("regist_date"));
				dto.setUpdateDate(rs.getDate("update_date"));
			}

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return dto;
	}



	public int adminUserListHistoryDelete(int intId) throws SQLException {
		String sql = "DELETE FROM user_info where id=?";
		PreparedStatement ps;
		int result=0;

		try{
			ps=con.prepareStatement(sql);
			ps.setInt(1, intId);
			result=ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return result;

	}

}
