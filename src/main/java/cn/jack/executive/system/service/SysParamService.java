package cn.jack.executive.system.service;

import java.util.List;

import org.beetl.sql.core.db.KeyHolder;

import cn.jack.executive.system.model.SysParam;
import cn.jack.executive.system.model.vo.ParamSearchVo;

public interface SysParamService {
	
	public List<SysParam> findSysParamByCde(String sParmCde);
	
	public SysParam findSysParamById(String id);
	
	public List<SysParam> selectSysParams(ParamSearchVo paramSearchVo);
	
	public int insParam(SysParam param);
	
	public int updParamById(SysParam param);
	
	public int delParamById(String id);
	
	public KeyHolder addParam(SysParam param);
}
