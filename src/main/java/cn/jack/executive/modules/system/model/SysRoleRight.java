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
@TableName("sys_role_right")
public class SysRoleRight extends Model<SysRoleRight> {

    private static final long serialVersionUID = 1L;

	private Integer id;
	private Integer roleid;
	private Integer menuid;
	private Integer funcid;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRoleid() {
		return roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	public Integer getMenuid() {
		return menuid;
	}

	public void setMenuid(Integer menuid) {
		this.menuid = menuid;
	}

	public Integer getFuncid() {
		return funcid;
	}

	public void setFuncid(Integer funcid) {
		this.funcid = funcid;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
