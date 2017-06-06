package cn.jack.executive.system.model;

import java.util.ArrayList;
import java.util.List;

public class MenuTree extends SysMenu{

	private List<MenuTree> subMenus = new ArrayList<MenuTree>();

	public List<MenuTree> getSubMenus() {
		return subMenus;
	}

	public void setSubMenus(List<MenuTree> subMenus) {
		this.subMenus = subMenus;
	}
	
}
