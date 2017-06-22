package cn.jack.executive.system.service.impl;

import org.beetl.sql.core.SQLManager;
import org.beetl.sql.core.engine.PageQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jack.executive.system.dao.SysRoleDao;
import cn.jack.executive.system.model.SysDept;
import cn.jack.executive.system.model.SysRole;
import cn.jack.executive.system.model.vo.DeptSearchVo;
import cn.jack.executive.system.model.vo.RoleSearchVo;
import cn.jack.executive.system.model.vo.SysRoleVo;
import cn.jack.executive.system.service.SysRoleService;

@Service
public class SysRoleServiceImpl implements SysRoleService {

	@Autowired
	private SysRoleDao sysRoleDao;

	@Autowired
	private SQLManager sqlManager;
	
	@Override
	public void saveRole(SysRole sysRole) {
		if(sysRole.getId()==null){
			sysRoleDao.insert(sysRole);
		}else{
			sysRoleDao.updateById(sysRole);
		}

	}

	@Override
	public PageQuery<SysRoleVo> findRoleByPage(RoleSearchVo roleSearchVo) {
		PageQuery<SysRoleVo> query = new PageQuery<SysRoleVo>();
		query.setPageNumber(roleSearchVo.getPageNum());
		query.setPageSize(roleSearchVo.getNumPerPage());
		query.setParas(roleSearchVo);
		sqlManager.pageQuery("sysRole.findRoleBy", SysRoleVo.class, query);
		return query;
	}
	
	@Override
	public SysRole findRoleById(String id) {
		return sysRoleDao.single(id);
	}

}
