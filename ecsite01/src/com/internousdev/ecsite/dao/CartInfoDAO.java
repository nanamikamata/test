package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.CartInfoDTO;
import com.internousdev.ecsite.util.DBConnector;

public class CartInfoDAO {

public List<CartInfoDTO> getCartInfoDtoList(String login_Id) {
	DBConnector dbConnector = new DBConnector();
	Connection connection = dbConnector.getConnection();
	List<CartInfoDTO> cartInfoDtoList = new ArrayList<CartInfoDTO>();

	String sql="select"
	+ " ci.id as id,"
	+ " ci.user_id as user_id,"
	+ " ci.item_id as item_id,"
	+ " sum(ci.item_count) as item_count,"
	+ " pi.item_price as item_price,"
	+ " pi.insert_date as insert_date,"
	+ " pi.update_date as update_date,"
	+ " pi.item_name as item_name,"
	+ " (sum(ci.item_count) * pi.item_price) as subtotal"
	+ " FROM cart_info as ci"
	+ " LEFT JOIN item_info_transaction as pi"
	+ " ON ci.item_id = pi.id"
	+ " WHERE ci.user_id = ?"
	+ " group by item_id";
	try {
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		System.out.println("cartinfodao-getcartinfodtolist:"+login_Id);
		preparedStatement.setString(1, login_Id);
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			CartInfoDTO cartInfoDTO = new CartInfoDTO();
			cartInfoDTO.setId(resultSet.getInt("id"));
			cartInfoDTO.setUserId(resultSet.getString("user_id"));
			cartInfoDTO.setItemId(resultSet.getInt("item_id"));
			cartInfoDTO.setCount(resultSet.getInt("item_count"));
			cartInfoDTO.setItemPrice(resultSet.getInt("item_price"));
			cartInfoDTO.setInsertDate(resultSet.getDate("insert_date"));
			cartInfoDTO.setUpdateDate(resultSet.getDate("update_date"));
			cartInfoDTO.setItemName(resultSet.getString("item_name"));
			cartInfoDTO.setSubtotal(resultSet.getInt("subtotal"));
			cartInfoDtoList.add(cartInfoDTO);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	try {
		connection.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return cartInfoDtoList;
}

public int getTotalPrice(String userId) {
	int totalPrice = 0;
	DBConnector dbConnector = new DBConnector();
	Connection connection = dbConnector.getConnection();
	String sql = "select sum(item_count * item_price) as total_price from cart_info where user_id=? group by user_id";
	try {
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, userId);
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet.next()) {
			totalPrice = resultSet.getInt("total_price");
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	try {
		connection.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return totalPrice;
}

public int regist(String userId,  int itemId, String Count, int itemPrice) {
	DBConnector dbConnector = new DBConnector();
	Connection connection = dbConnector.getConnection();
	int count = 0;
	String sql = "insert into cart_info(user_id, item_id, item_count, item_price, insert_date)"
			+ " values (?, ?, ?, ?, now())";

	try {
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, userId);
		preparedStatement.setInt(2, itemId);
		preparedStatement.setString(3, Count);
		preparedStatement.setInt(4, itemPrice);

		count = preparedStatement.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	try {
		connection.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return count;
}

public int delete(String id) {
	DBConnector dbConnector = new DBConnector();
	Connection connection = dbConnector.getConnection();
	int count = 0;
	String sql = "delete from cart_info where id=?";

	try {
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, id);

		count = preparedStatement.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	try {
		connection.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return count;
}

public int deleteAll(String userId) {
	DBConnector dbConnector = new DBConnector();
	Connection connection = dbConnector.getConnection();
	int count = 0;
	String sql = "delete from cart_info where user_id=?";

	try {
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, userId);

		count = preparedStatement.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	try {
		connection.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return count;
}

public boolean isExistsCartInfo() {

	return false;
}

public int linkToLoginId(String loginId) {
	DBConnector dbConnector = new DBConnector();
	Connection connection = dbConnector.getConnection();
	int count = 0;
	String sql = "update cart_info set user_id=?";

	try {
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, loginId);
		count = preparedStatement.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	try {
		connection.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return count;
}
}