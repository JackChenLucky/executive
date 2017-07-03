package cn.jack.executive.core.util;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import cn.jack.executive.common.constants.cache.Cache;
import cn.jack.executive.common.constants.cache.CacheKey;
import cn.jack.executive.modules.system.dao.SysDeptMapper;
import cn.jack.executive.modules.system.model.SysDept;

@Component
@DependsOn("springContextHolder")
public class ContextHolder {
	
	private SysDeptMapper deptMapper = SpringContextHolder.getBean(SysDeptMapper.class);
	
	public static ContextHolder self() {
        return SpringContextHolder.getBean("contextHolder");
    }
	
	/**
     * 获取部门名称
     */
    @Cacheable(value = Cache.CONSTANT, key = "'" + CacheKey.DEPT_NAME + "'+#deptId")
    public String getDeptName(Integer deptId) {
        SysDept dept = deptMapper.selectById(deptId);
        if (ToolUtil.isNotEmpty(dept) && ToolUtil.isNotEmpty(dept.getDeptname())) {
            return dept.getDeptname();
        }
        return "";
    }
}
