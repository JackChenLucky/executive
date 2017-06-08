package cn.jack.executive.system.service.impl;

import java.util.List;

import org.beetl.sql.core.SQLManager;
import org.beetl.sql.core.engine.PageQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jack.executive.system.dao.SysDeptDao;
import cn.jack.executive.system.model.DeptTree;
import cn.jack.executive.system.model.SysDept;
import cn.jack.executive.system.model.vo.DeptSearchVo;
import cn.jack.executive.system.service.SysDeptService;

@Service
public class SysDeptServiceImpl implements SysDeptService{

	@Autowired
	private SysDeptDao sysDeptDao;
	
	@Autowired
	private SQLManager sqlManager;
	
	@Override
	public PageQuery<SysDept> findDeptByPage(DeptSearchVo deptSearchVo) {
		PageQuery<SysDept> query = new PageQuery<SysDept>();
		query.setPageNumber(deptSearchVo.getPageNum());
		query.setPageSize(deptSearchVo.getNumPerPage());
		query.setParas(deptSearchVo);
		sqlManager.pageQuery("sysDept.findDeptBy", SysDept.class, query);
		return query;
	}

	@Override
	public SysDept findDeptById(String id) {
		return sysDeptDao.single(id);
	}

	@Override
	public void saveDept(SysDept sysdept) {
		if(sysdept.getId()==null){
			sysDeptDao.insert(sysdept);
		}else{
			sysDeptDao.updateById(sysdept);
		}
	}

	/**
	 * 获取树形结构部门列表
	 */
	@Override
	public DeptTree getAllTreeDept() {
		DeptTree deptTree = new DeptTree();
		deptTree.setId(0);
		deptTree.setDeptname("组织机构");
		//1、查询当前节点的下级节点
		FillSubDepts(deptTree);
		return deptTree;
	}
	
	private void FillSubDepts(DeptTree deptTree){
		List<DeptTree> subDeptList = sqlManager.select("sysDept.findDeptByPid", DeptTree.class, deptTree);
		for(DeptTree dept:subDeptList){
			FillSubDepts(dept);
			deptTree.getSubDepts().add(dept);
		}
	}

}
