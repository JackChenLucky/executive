package cn.jack.executive.system.model;

import java.io.Serializable;

public class SysRoleRight  implements Serializable{
	private Integer id ;
	private Integer funcid ;
	private Integer menuid ;
	private Integer roleid ;
	
	public SysRoleRight() {
	}
	
	public Integer getId(){
		return  id;
	}
	public void setId(Integer id ){
		this.id = id;
	}
	
	public Integer getFuncid(){
		return  funcid;
	}
	public void setFuncid(Integer funcid ){
		this.funcid = funcid;
	}
	
	public Integer getMenuid(){
		return  menuid;
	}
	public void setMenuid(Integer menuid ){
		this.menuid = menuid;
	}
	
	public Integer getRoleid(){
		return  roleid;
	}
	public void setRoleid(Integer roleid ){
		this.roleid = roleid;
	}
}