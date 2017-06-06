package cn.jack.executive.system.service.impl;

import java.util.List;

import org.beetl.sql.core.db.KeyHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jack.executive.system.dao.SysParamDao;
import cn.jack.executive.system.model.SysParam;
import cn.jack.executive.system.model.vo.ParamSearchVo;
import cn.jack.executive.system.service.SysParamService;

/**
 * 系统参数维护服务
 * @author ASUS
 */
@Service
public class SysParamServiceImpl implements SysParamService {
	
	@Autowired
	private SysParamDao sysParamDao;

	/**
	 * @param sParmCde 参数代码
	 */
	@Override
	public List<SysParam> findSysParamByCde(String sParmCde) {

		return sysParamDao.findSysParamByCde(sParmCde);
	}

	/**
	 * @param paramSearchVo 查询条件
	 */
	@Override
	public List<SysParam> selectSysParams(ParamSearchVo paramSearchVo) {

		return sysParamDao.selectSysParams(paramSearchVo);
	}

	@Override
	public int insParam(SysParam param) {
		
		return sysParamDao.insParam(param);
	}
	
	public KeyHolder addParam(SysParam param){
		param.setParmcde(param.getParmcde().toUpperCase());
		//sysParamDao.insert(param);
		return sysParamDao.insertReturnKey(param);
	}

	@Override
	public int updParamById(SysParam param) {
		
		return sysParamDao.updateById(param);
	}
	
	public SysParam findSysParamById(String id) {
		
		return sysParamDao.single(id);
	}
	
	public int delParamById(String id){
		
		return sysParamDao.deleteById(id);
	}
}
