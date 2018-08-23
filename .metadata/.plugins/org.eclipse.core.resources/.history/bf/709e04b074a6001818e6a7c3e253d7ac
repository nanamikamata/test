package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.LoginDTO;
import com.internousdev.ecsite.util.DBConnector;

public class LoginDAO {
	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();
	private LoginDTO loginDTO=new LoginDTO();


//ログイン機能
	public LoginDTO getLoginUserInfo(String loginUserId,String loginPassword){
		String sql="SELECT*FROM login_user_transaction where login_id=?AND login_pass=?";

		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);

			preparedStatement.setString(1, loginUserId);
			preparedStatement.setString(2, loginPassword);

			ResultSet resultSet=preparedStatement.executeQuery();

			if(resultSet.next()){
				loginDTO.setLoginId(resultSet.getString("login_id"));
				loginDTO.setLoginPassword(resultSet.getString("login_pass"));
				loginDTO.setUserName(resultSet.getString("user_name"));

				if(!(resultSet.getString("login_id").equals(null))){
					loginDTO.setLoginFlg(true);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return loginDTO;
	}

	public LoginDTO getLoginDTO(){
		return loginDTO;
	}

//ログイン機能終わり

//BuyItemListDAO
		public ArrayList<LoginDTO> getBuyItemList()
				throws SQLException{

						ArrayList<LoginDTO> buyItemListDTO=new ArrayList<LoginDTO>();
						String sql="SELECT * FROM item_info_transaction";

						try{
							PreparedStatement preparedStatement=connection.prepareStatement(sql);
							ResultSet resultSet=preparedStatement.executeQuery();
							while(resultSet.next()){
								LoginDTO dto=new LoginDTO();
								dto.setId(resultSet.getString("id"));
								dto.setItemName(resultSet.getString("item_name"));
								dto.setItemPrice(resultSet.getString("item_price"));
								dto.setItemStock(resultSet.getString("item_stock"));
								dto.setInsert_date(resultSet.getString("insert_date"));
								dto.setUpdate_date(resultSet.getString("update_date"));
								buyItemListDTO.add(dto);
							}

						}catch(Exception e){
							e.printStackTrace();
						}finally{
							connection.close();
						}
						return buyItemListDTO;
					}
}
