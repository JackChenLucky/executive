package cn.jack.executive.system.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import cn.jack.executive.system.model.SysRole;
import cn.jack.executive.system.model.SysUser;
import cn.jack.executive.system.model.vo.SysRightVo;

public class AuthRealm extends AuthorizingRealm{

	@Autowired
    private SysUserService sysUserService;
	
	@Autowired
	private SysRoleRightService sysRoleRightService;

	/**
	 * 认证 登录
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken utoken=(UsernamePasswordToken) token;//获取用户输入的token
        String username = utoken.getUsername();
        SysUser user = sysUserService.findUserByLoginName(username);
        return new SimpleAuthenticationInfo(user, user.getPassword(),this.getClass().getName());//放入shiro.调用CredentialsMatcher检验密码
	}
	
	/**
	 * 授权
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		SysUser user=(SysUser) principals.fromRealm(this.getClass().getName()).iterator().next();//获取session中的用户
        List<String> permissions=new ArrayList<>();
        Set<SysRole> roles = user.getRoles();
        if(roles.size()>0) {
            for(SysRole role : roles) {
                List<SysRightVo> rights = sysRoleRightService.getRightsByRole(role.getId()+"");
                if(rights.size()>0) {
                    for(SysRightVo right : rights) {
                        permissions.add(right.getRightFlag());
                    }
                }
            }
        }
        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
        info.addStringPermissions(permissions);//将权限放入shiro中.
        return info;
	}


}
