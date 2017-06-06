package cn.jack.executive.system.dao;

import java.util.List;

import org.beetl.sql.core.mapper.BaseMapper;

import cn.jack.executive.system.model.SysParam;
import cn.jack.executive.system.model.vo.ParamSearchVo;

public interface SysParamDao extends BaseMapper<SysParam> {

	List<SysParam> findSysParamByCde(String sParmCde);
	
	List<SysParam> selectSysParams(ParamSearchVo paramSearchVo);
	
	int insParam(SysParam param);
	
	int updParamById(SysParam param);
}
