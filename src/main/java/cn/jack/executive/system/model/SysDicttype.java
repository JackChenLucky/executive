package cn.jack.executive.system.model;
import java.io.Serializable;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;

/*
* 
* gen by beetlsql 2017-05-23
*/
public class SysDicttype   implements Serializable{
	private Integer id ;
	private Integer status ;
	private String dicttype ;
	private String note ;
	
	public SysDicttype() {
	}
	
	public Integer getId(){
		return  id;
	}
	public void setId(Integer id ){
		this.id = id;
	}
	
	public Integer getStatus(){
		return  status;
	}
	public void setStatus(Integer status ){
		this.status = status;
	}
	
	public String getDicttype(){
		return  dicttype;
	}
	public void setDicttype(String dicttype ){
		this.dicttype = dicttype;
	}
	
	public String getNote(){
		return  note;
	}
	public void setNote(String note ){
		this.note = note;
	}
	
	
	

}
