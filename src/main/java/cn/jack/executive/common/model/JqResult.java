package cn.jack.executive.common.model;

import java.io.Serializable;

import org.beetl.sql.core.engine.PageQuery;

import cn.jack.executive.system.model.SysUser;

/**
 * Jqgrid 需要返回的JSON数据格式
 * @author JackChen
 *
 */
public class JqResult<T> implements Serializable {
	
	private static final long serialVersionUID = 1L;
	/*当前页码*/
	private long page;
	/*总记录数*/
	private long total;
	/*每页显示的记录数*/
	private long records;
	/*List对象集合*/
	private Object rows;
	
	public JqResult(PageQuery<T> query){
		page = query.getPageNumber();
		records = query.getTotalRow();
		total = query.getTotalPage();
		rows = query.getList();
	}
	
	public long getPage() {
		return page;
	}

	public void setPage(long page) {
		this.page = page;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public long getRecords() {
		return records;
	}

	public void setRecords(long records) {
		this.records = records;
	}

	public Object getRows() {
		return rows;
	}

	public void setRows(Object rows) {
		this.rows = rows;
	}
	
}
