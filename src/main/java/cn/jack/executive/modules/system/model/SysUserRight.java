package cn.jack.executive.modules.system.model;

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
@TableName("sys_user_right")
public class SysUserRight extends Model<SysUserRight> {

    private static final long serialVersionUID = 1L;

	private Integer id;
	private Integer userid;
	private Integer rightid;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getRightid() {
		return rightid;
	}

	public void setRightid(Integer rightid) {
		this.rightid = rightid;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
