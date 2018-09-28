package com.internousdev.amoti.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.amoti.util.DBConnector;

public class AdminProductEditCompleteDAO {
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();

	private String sql = "UPDATE product_info SET product_id = ?, product_name = ?, product_name_kana = ?, product_description = ?,"
			+ "category_id = ?, price = ?, release_company = ?, release_date = ?, status = ?, image_file_path = ?, image_file_name = ?, regist_date = ?, update_date = ?";

	public void updateUser(String id, String productId, String productName, String productNameKana, String productDescription,String categoryId,
			String price, String imageFilePath, String imageFileName, String releaseDate, String releaseCompany, String status, String registDate, String updateDate)
			throws SQLException{
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, productId);
			ps.setString(3, productName);
			ps.setString(4, productNameKana);
			ps.setString(5, productDescription);
			ps.setString(6, categoryId);
			ps.setString(7, price);
			ps.setString(8, imageFilePath);
			ps.setString(9, imageFileName);
			ps.setString(10, releaseDate);
			ps.setString(11, releaseCompany);
			ps.setString(12,  status);
			ps.setString(13, registDate);
			ps.setString(14, updateDate);
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
	}
}
