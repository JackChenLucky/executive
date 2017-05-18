package cn.jack.executive.system.model.bean;

/**
 * 
 * @author JackChen
 *
 */
public class SysDict {
	
	private long dict_Id;
	private String dict_Cde;
	private String dict_Val;
	private String dflt_Val;
	private String dict_Type;
	private String status;
	private String dict_Order;
	
	public long getDict_Id() {
		return dict_Id;
	}
	public void setDict_Id(long dict_Id) {
		this.dict_Id = dict_Id;
	}
	public String getDict_Cde() {
		return dict_Cde;
	}
	public void setDict_Cde(String dict_Cde) {
		this.dict_Cde = dict_Cde;
	}
	public String getDict_Val() {
		return dict_Val;
	}
	public void setDict_Val(String dict_Val) {
		this.dict_Val = dict_Val;
	}
	public String getDflt_Val() {
		return dflt_Val;
	}
	public void setDflt_Val(String dflt_Val) {
		this.dflt_Val = dflt_Val;
	}
	public String getDict_Type() {
		return dict_Type;
	}
	public void setDict_Type(String dict_Type) {
		this.dict_Type = dict_Type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDict_Order() {
		return dict_Order;
	}
	public void setDict_Order(String dict_Order) {
		this.dict_Order = dict_Order;
	}
}
