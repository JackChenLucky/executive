package cn.jack.executive.system.dao;

import java.util.List;

import org.beetl.sql.core.mapper.BaseMapper;

import cn.jack.executive.system.model.DeptTree;
import cn.jack.executive.system.model.SysDept;
import cn.jack.executive.system.model.vo.DeptSearchVo;

public interface SysDeptDao extends BaseMapper<SysDept> {

	List<SysDept> findDeptBy(DeptSearchVo deptSearchVo);

	List<DeptTree> findDeptByPid(Integer pid);
}
