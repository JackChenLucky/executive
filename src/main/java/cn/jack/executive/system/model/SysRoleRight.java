package cn.jack.executive.system.model;

import java.io.Serializable;

public class SysRoleRight  implements Serializable{
	
	private Integer id ;
	private Integer rightid ;
	private Integer roleid ;
	
	public SysRoleRight() {
	}
	
	public Integer getId(){
		return  id;
	}
	public void setId(Integer id ){
		this.id = id;
	}
	
	public Integer getRightid(){
		return  rightid;
	}
	public void setRightid(Integer rightid ){
		this.rightid = rightid;
	}
	
	public Integer getRoleid(){
		return  roleid;
	}
	public void setRoleid(Integer roleid ){
		this.roleid = roleid;
	}
	
}