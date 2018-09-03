package com.internousdev.sample_web2.action;

import

public class HomeAction extends ActionSupport implements SessionAware{
	private List<MCategoryDTO> mCategoryDtoList=new ArrayList<MCategoryDTO>()
	private String categoryId;
	private Map<String,Object> session;
	public String execute(){

		if (!(session.containsKey("loginId")) && !(session.containsKey("tempUserId"))) {
			CommonUtility commonUtility=new CommonUtility();
			session.put("tempUserId", commonUtility.getRamdomValue());
		}
	}

}
