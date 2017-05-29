package cn.jack.executive.common.model;

import java.io.Serializable;

/**
 * 分页基类封装
 * @author JackChen
 *
 */
public class PageBean implements Serializable{
	
	private static final long serialVersionUID = -2113525961847707803L;

	private int rows = 20;
	
	private int page = 1;
	
	private String sidx;
	
	private String sord = "asc";

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getSidx() {
		return sidx;
	}

	public void setSidx(String sidx) {
		this.sidx = sidx;
	}

	public String getSord() {
		return sord;
	}

	public void setSord(String sord) {
		this.sord = sord;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}