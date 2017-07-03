package cn.jack.executive.modules.system.model.vo;

import cn.jack.executive.common.model.PageBean;

public class UserSearchVo extends PageBean{
	
	private String username;
	
	private String status;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
