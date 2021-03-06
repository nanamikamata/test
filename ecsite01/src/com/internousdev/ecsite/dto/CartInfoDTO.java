package com.internousdev.ecsite.dto;

import java.util.Date;

public class CartInfoDTO {
		private int id;
		private String userId;
		private int itemId;
		private int count;
		private int itemPrice;
		private Date insertDate;
		private Date updateDate;

		private String itemName;
		private int subtotal;

		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public int getItemId() {
			return itemId;
		}
		public void setItemId(int itemId) {
			this.itemId = itemId;
		}
		public int gettCount() {
			return count;
		}
		public void setCount(int count) {
			this.count = count;
		}
		public int getItemPrice() {
			return itemPrice;
		}
		public void setItemPrice(int itemPrice) {
			this.itemPrice = itemPrice;
		}
		public Date getInsertDate() {
			return insertDate;
		}
		public void setInsertDate(Date insertDate) {
			this.insertDate = insertDate;
		}
		public Date getUpdateDate() {
			return updateDate;
		}
		public void setUpdateDate(Date updateDate) {
			this.updateDate = updateDate;
		}
		public String getItemName() {
			return itemName;
		}
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		public int getSubtotal() {
			return subtotal;
		}
		public void setSubtotal(int subtotal) {
			this.subtotal = subtotal;
		}

}
