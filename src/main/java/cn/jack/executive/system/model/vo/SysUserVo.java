package cn.jack.executive.system.model.vo;

import cn.jack.executive.system.model.SysUser;

/**
 * 系统用户
 * @author JackChen
 *
 */
public class SysUserVo extends SysUser {
	
	private String expiredate_str;
	
	private String birthday_str;

	public String getExpiredate_str() {
		return expiredate_str;
	}

	public void setExpiredate_str(String expiredate_str) {
		this.expiredate_str = expiredate_str;
	}

	public String getBirthday_str() {
		return birthday_str;
	}

	public void setBirthday_str(String birthday_str) {
		this.birthday_str = birthday_str;
	}
}
