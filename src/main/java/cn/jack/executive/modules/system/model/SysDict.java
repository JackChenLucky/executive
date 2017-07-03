package cn.jack.executive.modules.system.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Jackchen
 * @since 2017-07-07
 */
@TableName("sys_dict")
public class SysDict extends Model<SysDict> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	private String dictcde;
	private String dictval;
	private String dfltval;
	private String dicttype;
	private Integer status;
	private Integer dictorder;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDictcde() {
		return dictcde;
	}

	public void setDictcde(String dictcde) {
		this.dictcde = dictcde;
	}

	public String getDictval() {
		return dictval;
	}

	public void setDictval(String dictval) {
		this.dictval = dictval;
	}

	public String getDfltval() {
		return dfltval;
	}

	public void setDfltval(String dfltval) {
		this.dfltval = dfltval;
	}

	public String getDicttype() {
		return dicttype;
	}

	public void setDicttype(String dicttype) {
		this.dicttype = dicttype;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getDictorder() {
		return dictorder;
	}

	public void setDictorder(Integer dictorder) {
		this.dictorder = dictorder;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
