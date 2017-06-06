package cn.jack.executive.system.model;

import java.io.Serializable;

/*
* 
* gen by beetlsql 2017-06-06
*/
public class SysMenu   implements Serializable{
	private Integer id ;
	private Integer orderseq ;
	private Integer pid ;
	private String describle ;
	private String icon ;
	private String name ;
	private String params ;
	private String url ;
	
	public SysMenu() {
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
	
	public Integer getPid(){
		return  pid;
	}
	public void setPid(Integer pid ){
		this.pid = pid;
	}
	
	public String getDescrible(){
		return  describle;
	}
	public void setDescrible(String describle ){
		this.describle = describle;
	}
	
	public String getIcon(){
		return  icon;
	}
	public void setIcon(String icon ){
		this.icon = icon;
	}
	
	public String getName(){
		return  name;
	}
	public void setName(String name ){
		this.name = name;
	}
	
	public String getParams(){
		return  params;
	}
	public void setParams(String params ){
		this.params = params;
	}
	
	public String getUrl(){
		return  url;
	}
	public void setUrl(String url ){
		this.url = url;
	}
}