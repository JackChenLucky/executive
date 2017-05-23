package cn.jack.executive.system.dao;

import java.util.List;

import org.beetl.sql.core.mapper.BaseMapper;

import cn.jack.executive.system.model.SysDicttype;

public interface SysDicttypeDao extends BaseMapper<SysDicttype> {

	List<SysDicttype> selectAll();
	
}
