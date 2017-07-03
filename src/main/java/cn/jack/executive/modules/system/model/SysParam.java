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
@TableName("sys_param")
public class SysParam extends Model<SysParam> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	private String parmcde;
	private String parmval;
	private String note;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
