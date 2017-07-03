package cn.jack.executive.system.model;
import java.io.Serializable;
import java.math.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.beetl.sql.core.TailBean;

import java.sql.Timestamp;

/*
* 
* gen by beetlsql 2017-05-23
*/
public class SysUser extends TailBean  implements Serializable{
	//主键
	private Integer id;
	//所在科室ID
	private String dept;
	//电子邮件
	private String email;
	//登录名
	private String loginname;
	//别名
	private String othername;
	//密码
	private String password;
	//QQ号码
	private String qq;
	//性别
	private String sex;
	//状态
	private int status;
	//联系电话
	private String telphone;
	//姓名
	private String username;
	//微信号码
	private String webchat;
	//出生日期
	private Date birthday;
	//过期日期
	private Date expiredate;
	
	private Set<SysRole> roles;
	
	public SysUser() {
	}
	
	public Set<SysRole> getRoles() {
		return roles;
	}

	public void setRoles(Set<SysRole> roles) {
		this.roles = roles;
	}

	public Integer getId(){
		return  id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	
	public String getDept(){
		return  dept;
	}
	public void setDept(String dept){
		this.dept = dept;
	}
	
	public String getEmail(){
		return  email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getLoginname(){
		return  loginname;
	}
	public void setLoginname(String loginname){
		this.loginname = loginname;
	}
	
	public String getOthername(){
		return  othername;
	}
	public void setOthername(String othername){
		this.othername = othername;
	}
	
	public String getPassword(){
		return  password;
	}
	public void setPassword(String password){
		this.password = password;
	}
	
	public String getQq(){
		return  qq;
	}
	public void setQq(String qq){
		this.qq = qq;
	}
	
	public String getSex(){
		return  sex;
	}
	public void setSex(String sex){
		this.sex = sex;
	}
	
	public int getStatus(){
		return  status;
	}
	public void setStatus(int status){
		this.status = status;
	}
	
	public String getTelphone(){
		return  telphone;
	}
	public void setTelphone(String telphone){
		this.telphone = telphone;
	}
	
	public String getUsername(){
		return  username;
	}
	public void setUsername(String username){
		this.username = username;
	}
	
	public String getWebchat(){
		return  webchat;
	}
	public void setWebchat(String webchat){
		this.webchat = webchat;
	}
	
	public Date getBirthday(){
		return  birthday;
	}
	public void setBirthday(Date birthday){
		this.birthday = birthday;
	}
	
	public Date getExpiredate(){
		return  expiredate;
	}
	public void setExpiredate(Date expiredate){
		this.expiredate = expiredate;
	}
}
