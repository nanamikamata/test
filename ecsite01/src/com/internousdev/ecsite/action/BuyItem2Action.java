package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BuyItem2Action extends ActionSupport implements SessionAware{
	private int itemId;
	private String itemName;
	private int itemPrice;
	private int count;
	private String pay;
	public Map<String,Object> session;

	public String execute(){
		String result=SUCCESS;

		session.put("itemId", itemId);
		session.put("itemName", itemName);
		session.put("itemPrice", itemPrice);
		session.put("count", count);
		int intStock=Integer.parseInt(session.get("count").toString());
		int intPrice=Integer.parseInt(session.get("itemPrice").toString());
		session.put("total_price", intStock*intPrice);
		String payment;

		if(pay.equals("1")){
			payment="現金払い";
			session.put("pay",payment);
		}else{
			payment="クレジットカード";
			session.put("pay",payment);
		}
		return result;
	}

	public int getItemId(){
		return itemId;
	}
	public void setItemId(int itemId){
		this.itemId=itemId;
	}
	public String getItemName(){
		return itemName;
	}
	public void setItemName(String itemName){
		this.itemName=itemName;
	}
	public int getItemPrice(){
		return itemPrice;
	}
	public void setItemPrice(int itemPrice){
		this.itemPrice=itemPrice;
	}
	public int getCount(){
		return count;
	}
	public void setCount(int count){
		this.count=count;
	}
	public String getPay(){
		return pay;
	}
	public void setPay(String pay){
		this.pay=pay;
	}
	public Map<String,Object>getSession(){
		return session;
	}
	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}


}
