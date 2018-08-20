package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ecsite.dto.ManagementLoginDTO;
import com.internousdev.ecsite.util.DBConnector;


public class ManagementLoginDAO {
	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();
	private ManagementLoginDTO managementloginDTO=new ManagementLoginDTO();

	public ManagementLoginDTO getLoginManagementInfo(String loginUserId,String loginPassword){
		String sql="SELECT*FROM login_manager_transaction where login_id=?AND login_pass=?";

		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);

			preparedStatement.setString(1, loginUserId);
			preparedStatement.setString(2, loginPassword);

			ResultSet resultSet=preparedStatement.executeQuery();

			if(resultSet.next()){
				managementloginDTO.setLoginId(resultSet.getString("login_id"));
				managementloginDTO.setLoginPassword(resultSet.getString("login_pass"));
				managementloginDTO.setUserName(resultSet.getString("user_name"));

				if(!(resultSet.getString("login_id").equals(null))){
					managementloginDTO.setLoginFlg(true);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return managementloginDTO;
	}

	public ManagementLoginDTO getManagementLoginDTO(){
		return managementloginDTO;
	}

}
