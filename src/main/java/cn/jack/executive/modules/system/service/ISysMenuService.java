package cn.jack.executive.modules.system.service;

import cn.jack.executive.modules.system.model.MenuTree;
import cn.jack.executive.modules.system.model.SysMenu;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Jackchen
 * @since 2017-07-06
 */
public interface ISysMenuService extends IService<SysMenu> {

	MenuTree getAllTreeMenu();
	
}