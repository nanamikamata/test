package com.internousdev.amoti.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.amoti.dao.ProductInfoDAO;
import com.internousdev.amoti.dto.ProductInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AdminProductDetailsAction extends ActionSupport implements SessionAware{

	private int id;
	private List<ProductInfoDTO> dto = new ArrayList<ProductInfoDTO>();
	private Map<String,Object> session;
	public String execute(){
		String result = SUCCESS;
		ProductInfoDAO dao = new ProductInfoDAO();
		ProductInfoDTO dto = new ProductInfoDTO();
		dto = dao.getProductInfo(id);
		session.put("id", dto.getId());
		session.put("productId", dto.getProductId());
		session.put("productName", dto.getProductName());
		session.put("productNameKana", dto.getProductNameKana());
		session.put("productDesctiption", dto.getProductDescription());
		session.put("categoryId", dto.getCategoryId());
		session.put("price", dto.getPrice());
		session.put("imageFilePath", dto.getImageFilePath());
		session.put("imageFileName", dto.getImageFileName());
		session.put("releaseDate", dto.getReleaseDate());
		session.put("releaseCompany", dto.getReleaseCompany());
		session.put("status", dto.getStatus());
		session.put("registDate", dto.getRegistDate());
		session.put("updateDate", dto.getUpdateDate());
		return result;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<ProductInfoDTO> getDto() {
		return dto;
	}
	public void setDto(List<ProductInfoDTO> dto) {
		this.dto = dto;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
