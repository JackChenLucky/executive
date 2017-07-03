package cn.jack.executive.modules.system.dao;

import cn.jack.executive.modules.system.model.MenuTree;
import cn.jack.executive.modules.system.model.SysMenu;

import java.util.List;

import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author Jackchen
 * @since 2017-07-07
 */
public interface SysMenuMapper extends BaseMapper<SysMenu> {

	List<MenuTree> findMenuByPid(Integer id);

}