package com.internousdev.amoti.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.amoti.util.DBConnector;

public class AdminProductDeleteDAO {
	public int ItemDelete(String id) throws SQLException{
		int result = 0;
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql = "DELETE FROM product_info WHERE id = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			result = ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return result;
	}
}
