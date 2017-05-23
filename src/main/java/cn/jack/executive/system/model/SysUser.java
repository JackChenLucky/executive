package cn.jack.executive.system.model;
import java.io.Serializable;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;

/*
* 
* gen by beetlsql 2017-05-23
*/
public class SysUser   implements Serializable{
	private Integer id ;
	private String email ;
	private String loginname ;
	private String othername ;
	private String password ;
	private String qq ;
	private String sex ;
	private String status ;
	private String telphone ;
	private String username ;
	private String webchat ;
	private Date expiredate ;
	
	public SysUser() {
	}
	
	public Integer getId(){
		return  id;
	}
	public void setId(Integer id ){
		this.id = id;
	}
	
	public String getEmail(){
		return  email;
	}
	public void setEmail(String email ){
		this.email = email;
	}
	
	public String getLoginname(){
		return  loginname;
	}
	public void setLoginname(String loginname ){
		this.loginname = loginname;
	}
	
	public String getOthername(){
		return  othername;
	}
	public void setOthername(String othername ){
		this.othername = othername;
	}
	
	public String getPassword(){
		return  password;
	}
	public void setPassword(String password ){
		this.password = password;
	}
	
	public String getQq(){
		return  qq;
	}
	public void setQq(String qq ){
		this.qq = qq;
	}
	
	public String getSex(){
		return  sex;
	}
	public void setSex(String sex ){
		this.sex = sex;
	}
	
	public String getStatus(){
		return  status;
	}
	public void setStatus(String status ){
		this.status = status;
	}
	
	public String getTelphone(){
		return  telphone;
	}
	public void setTelphone(String telphone ){
		this.telphone = telphone;
	}
	
	public String getUsername(){
		return  username;
	}
	public void setUsername(String username ){
		this.username = username;
	}
	
	public String getWebchat(){
		return  webchat;
	}
	public void setWebchat(String webchat ){
		this.webchat = webchat;
	}
	
	public Date getExpiredate(){
		return  expiredate;
	}
	public void setExpiredate(Date expiredate ){
		this.expiredate = expiredate;
	}
	
	
	

}
