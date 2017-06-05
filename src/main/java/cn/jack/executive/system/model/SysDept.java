package cn.jack.executive.system.model;

import java.io.Serializable;

import org.beetl.sql.core.TailBean;

public class SysDept  extends TailBean implements Serializable{
	private Integer id ;
	private Integer orderseq ;
	private Integer pid ;
	private Integer status ;
	private String deptcode ;
	private String deptname ;
	
	public SysDept() {
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
	
	public Integer getStatus(){
		return  status;
	}
	public void setStatus(Integer status ){
		this.status = status;
	}
	
	public String getDeptcode(){
		return  deptcode;
	}
	public void setDeptcode(String deptcode ){
		this.deptcode = deptcode;
	}
	
	public String getDeptname(){
		return  deptname;
	}
	public void setDeptname(String deptname ){
		this.deptname = deptname;
	}
}