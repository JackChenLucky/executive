package cn.jack.executive.system.service;

import java.util.List;

import org.beetl.sql.core.engine.PageQuery;

import cn.jack.executive.system.model.SysDept;
import cn.jack.executive.system.model.SysUser;
import cn.jack.executive.system.model.vo.DeptSearchVo;

public interface SysDeptService {
	
	public PageQuery<SysDept> findDeptByPage(DeptSearchVo deptSearchVo);

	public SysDept findDeptById(String id);

	public void saveDept(SysDept sysdept);

	public List<SysDept> getAllTreeDept();
}
