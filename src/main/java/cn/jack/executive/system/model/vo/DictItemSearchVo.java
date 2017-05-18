package cn.jack.executive.system.model.vo;

import cn.jack.executive.common.bean.PageBean;

public class DictItemSearchVo extends PageBean {
	
	private String searchCondition;

	public String getSearchCondition() {
		return searchCondition;
	}

	public void setSearchCondition(String searchCondition) {
		this.searchCondition = searchCondition;
	} 
	
	
}
