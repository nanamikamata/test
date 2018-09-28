package com.internousdev.amoti.action;

import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class AdminProductEditConfirmAction extends ActionSupport implements SessionAware{
	private String id;
	private String productId;
	private String productName;
	private String productNameKana;
	private String productDescription;
	private String categoryId;
	private String price;
	private String imageFilePath;
	private String imageFileName;
	private Date releaseDate;
	private String releaseCompany;
	private String status;
	private Date registDate;
	private Date updateDate;
	public Map<String,Object> session;

	public String execute(){
		String result = SUCCESS;

		if(!(id.equals(""))
		&& !(productId.equals(""))
		&& !(productName.equals(""))
		&& !(productNameKana.equals(""))
		&& !(productDescription.equals(""))
		&& !(categoryId.equals(""))
		&& !(price.equals(""))
		&& !(imageFilePath.equals(""))
		&& !(imageFileName.equals(""))
		&& !(releaseDate.equals(""))
		&& !(releaseCompany.equals(""))
		&& !(status.equals(""))
		&& !(registDate.equals(""))
		&& !(updateDate.equals(""))){
			session.put("id",id);
			session.put("product_id",productId);
			session.put("product_name",productName);
			session.put("product_name_kana",productNameKana);
			session.put("product_description",productDescription);
			session.put("category_id",categoryId);
			session.put("price",price);
			session.put("image_file_path",imageFilePath);
			session.put("image_file_name",imageFileName);
			session.put("release_date",releaseDate);
			session.put("release_company",releaseCompany);
			session.put("status", status);
			session.put("regist_date",registDate);
			session.put("update_date",updateDate);
		}
		return result;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductNameKana() {
		return productNameKana;
	}
	public void setProductNameKana(String productNameKana) {
		this.productNameKana = productNameKana;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getImageFilePath() {
		return imageFilePath;
	}
	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}
	public String getImageFileName() {
		return imageFileName;
	}
	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getReleaseCompany() {
		return releaseCompany;
	}
	public void setReleaseCompany(String releaseCompany) {
		this.releaseCompany = releaseCompany;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getRegistDate() {
		return registDate;
	}
	public void setRegistDate(Date registDate) {
		this.registDate = registDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
