package cn.jack.executive.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jack.executive.system.dao.SysFuncDao;
import cn.jack.executive.system.model.SysFunc;
import cn.jack.executive.system.service.SysFuncService;

@Service
public class SysFuncServiceImpl implements SysFuncService{

	@Autowired
	SysFuncDao sysFuncDao;
	
	@Override
	public SysFunc findFuncById(String funcid) {
		return sysFuncDao.single(funcid);
	}

}
