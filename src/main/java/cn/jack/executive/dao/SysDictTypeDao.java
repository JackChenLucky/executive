package cn.jack.executive.dao;

import java.util.List;

import org.beetl.sql.core.mapper.BaseMapper;

import cn.jack.executive.model.bean.SysDictType;

public interface SysDictTypeDao extends BaseMapper<SysDictType> {
	public List<SysDictType> selectAll();
}
