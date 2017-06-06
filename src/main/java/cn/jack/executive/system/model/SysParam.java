package cn.jack.executive.system.model;
import java.io.Serializable;

/*
* 
* gen by beetlsql 2017-05-23
*/
public class SysParam implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id ;
	private String parmcde ;
	private String parmval ;
	private String note ;
	
	public SysParam() {
	}
	
	public Integer getId(){
		return  id;
	}
	public void setId(Integer id ){
		this.id = id;
	}

	public String getParmcde() {
		return parmcde;
	}
	public void setParmcde(String parmcde) {
		this.parmcde = parmcde;
	}
	public String getParmval() {
		return parmval;
	}
	public void setParmval(String parmval) {
		this.parmval = parmval;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
}
