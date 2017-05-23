package cn.jack.executive.system.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jack.executive.system.dao.SysDicttypeDao;
import cn.jack.executive.system.model.SysDicttype;
import cn.jack.executive.system.service.SysDicttypeService;

@Service
public class SysDictTypeServiceImpl implements SysDicttypeService {

	@Autowired
	private SysDicttypeDao sysDicttypeDao;
	@Override
	public List<SysDicttype> allSysDictType() {
		return sysDicttypeDao.selectAll();
	}

}
