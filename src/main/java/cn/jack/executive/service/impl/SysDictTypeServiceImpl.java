package cn.jack.executive.service.impl;
import java.util.List;

import org.beetl.sql.core.SQLManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jack.executive.dao.SysDictTypeDao;
import cn.jack.executive.model.bean.SysDictType;
import cn.jack.executive.service.SysDictTypeService;

@Service
public class SysDictTypeServiceImpl implements SysDictTypeService {

	@Autowired
	SysDictTypeDao sysDictTypeDao;
	@Autowired
    SQLManager sql;
	
	@Override
	public List<SysDictType> allSysDictType() {
		return sysDictTypeDao.selectAll();
	}

}
