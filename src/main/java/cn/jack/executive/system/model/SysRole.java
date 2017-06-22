package cn.jack.executive.system.model;

import java.io.Serializable;

/*
* 
* gen by beetlsql 2017-06-12
*/
public class SysRole   implements Serializable{
	private Integer id ;
	private Integer orderseq ;
	private Integer status ;
	private String describle ;
	private String rolename ;
	
	public SysRole() {
	}
	
	public Integer getId(){
		return  id;
	}
	public void setId(Integer id ){
		this.id = id;
	}
	
	public Integer getOrderseq(){
		return  orderseq;
	}
	public void setOrderseq(Integer orderseq ){
		this.orderseq = orderseq;
	}
	
	public Integer getStatus(){
		return  status;
	}
	public void setStatus(Integer status ){
		this.status = status;
	}
	
	public String getDescrible(){
		return  describle;
	}
	public void setDescrible(String describle ){
		this.describle = describle;
	}
	
	public String getRolename(){
		return  rolename;
	}
	public void setRolename(String rolename ){
		this.rolename = rolename;
	}
}