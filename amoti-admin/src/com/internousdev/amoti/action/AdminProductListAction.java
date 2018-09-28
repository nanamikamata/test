package com.internousdev.amoti.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.amoti.dao.ProductInfoDAO;
import com.internousdev.amoti.dto.PaginationDTO;
import com.internousdev.amoti.dto.ProductInfoDTO;
import com.internousdev.amoti.util.Pagination;
import com.opensymphony.xwork2.ActionSupport;

public class AdminProductListAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private List<ProductInfoDTO> productInfoDtoList = new ArrayList<ProductInfoDTO>();
	private ProductInfoDAO productInfoDAO = new ProductInfoDAO();

	public String execute() throws SQLException{
		productInfoDtoList = productInfoDAO.getProductInfoList();

		Pagination pagination = new Pagination();
		PaginationDTO paginationDTO = pagination.initialize(productInfoDtoList, 9);
		session.put("totalPageSize", paginationDTO.getTotalPageSize());
		session.put("currentPageNumber", paginationDTO.getCurrentPageNo());
		session.put("totalRecordSize", paginationDTO.getTotalPageSize());
		session.put("startRecordNo", paginationDTO.getStartRecordNo());
		session.put("endRecordNo", paginationDTO.getEndRecordNo());
		session.put("pageNumberList", paginationDTO.getPageNumberList());
		session.put("productInfoDtoList", paginationDTO.getCurrentProductInfoPage());
		session.put("hasNextPage", paginationDTO.hasNextPage());
		session.put("hasPreviousPage", paginationDTO.hasPreviousPage());
		session.put("nextPageNo", paginationDTO.getNextPageNo());
		session.put("previousPageNo", paginationDTO.getPreviousPageNo());

		String result = SUCCESS;
		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public List<ProductInfoDTO> getProductList() {
		return productInfoDtoList;
	}

	public void setProductList(List<ProductInfoDTO> productList) {
		this.productInfoDtoList = productList;
	}

	public ProductInfoDAO getProductInfoDAO() {
		return productInfoDAO;
	}

	public void setProductInfoDAO(ProductInfoDAO productInfoDAO) {
		this.productInfoDAO = productInfoDAO;
	}
}
