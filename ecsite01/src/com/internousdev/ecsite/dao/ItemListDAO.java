package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.ItemListDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ItemListDAO {
	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();

	public ArrayList<ItemListDTO> getItemListInfo()
			throws SQLException{

					ArrayList<ItemListDTO> itemListInfoDTO=new ArrayList<ItemListDTO>();
					String sql="SELECT * FROM item_info_transaction";

					try{
						PreparedStatement preparedStatement=connection.prepareStatement(sql);
						ResultSet resultSet=preparedStatement.executeQuery();
						while(resultSet.next()){
							ItemListDTO dto=new ItemListDTO();
							dto.setId(resultSet.getString("id"));
							dto.setItemName(resultSet.getString("item_name"));
							dto.setItemPrice(resultSet.getString("item_price"));
							dto.setItemStock(resultSet.getString("item_stock"));
							dto.setInsert_date(resultSet.getString("insert_date"));
							dto.setUpdate_date(resultSet.getString("update_date"));
							itemListInfoDTO.add(dto);
						}

					}catch(Exception e){
						e.printStackTrace();
					}finally{
						connection.close();
					}
					return itemListInfoDTO;
				}

	public int itemHistoryDelete()
			throws SQLException{

					String sql="DELETE FROM item_info_transaction";
					PreparedStatement preparedStatement;
					int result=0;

					try{
						preparedStatement=connection.prepareStatement(sql);
						result=preparedStatement.executeUpdate();
					}catch(SQLException e){
						e.printStackTrace();
					}finally{
						connection.close();
					}
					return result;
				}


	public ItemListDTO getItemListInfo(String Id)
						throws SQLException{

		ItemListDTO dto=new ItemListDTO();
		String sql="SELECT * FROM item_info_transaction where id=?";

			try{
				PreparedStatement preparedStatement=connection.prepareStatement(sql);
				preparedStatement.setString(1, Id);
				ResultSet resultSet=preparedStatement.executeQuery();
				if(resultSet.next()){
					dto.setId(resultSet.getString("id"));
					dto.setItemName(resultSet.getString("item_name"));
					dto.setItemPrice(resultSet.getString("item_price"));
					dto.setItemStock(resultSet.getString("item_stock"));
					dto.setInsert_date(resultSet.getString("insert_date"));
					dto.setUpdate_date(resultSet.getString("update_date"));
				}
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				connection.close();
			}
			return dto;
			}

	public int itemDetailsHistoryDelete(String Id)
			throws SQLException{

					String sql="DELETE FROM item_info_transaction where id=?";
					PreparedStatement preparedStatement;
					int result=0;

					try{
						preparedStatement=connection.prepareStatement(sql);
						preparedStatement.setString(1, Id);
						result=preparedStatement.executeUpdate();
					}catch(SQLException e){
						e.printStackTrace();
					}finally{
						connection.close();
					}
					return result;
				}


}