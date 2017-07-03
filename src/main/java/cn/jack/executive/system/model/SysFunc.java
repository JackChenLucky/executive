package cn.jack.executive.system.model;
import java.io.Serializable;

public class SysFunc  implements Serializable{
	
	private Integer id ;
	private Integer menuid ;
	private String funcname ;
	private String functype ;
	
	public SysFunc() {
	}
	
	public Integer getId(){
		return  id;
	}
	public void setId(Integer id ){
		this.id = id;
	}
	
	public Integer getMenuid(){
		return  menuid;
	}
	public void setMenuid(Integer menuid ){
		this.menuid = menuid;
	}
	
	public String getFuncname(){
		return  funcname;
	}
	public void setFuncname(String funcname ){
		this.funcname = funcname;
	}
	
	public String getFunctype(){
		return  functype;
	}
	public void setFunctype(String functype ){
		this.functype = functype;
	}
}
