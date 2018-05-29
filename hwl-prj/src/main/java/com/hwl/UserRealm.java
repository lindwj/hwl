package com.hwl;

import java.util.Map;
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

import com.hwl.service.ManagerService;
import com.hwl.service.model.Manager;
import com.hwl.service.util.Common;

public class UserRealm extends AuthorizingRealm{
	
	@Autowired
	private ManagerService managerService;
	
	/**
     * 授权
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

    	Manager mng = (Manager) principals.getPrimaryPrincipal();
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        
        Map<String,Object> mso =managerService.findRoles(mng.getManagerId());
        
        if(mso.get("set")!=null ){
        	
        	Set<String> roleset =(Set<String>)mso.get("set");
        	if(roleset!=null&&roleset.size()>0){
        		authorizationInfo.setRoles(roleset);
        	}
        	
        	
        	String roleids = (String)mso.get("roleids");
        	if(roleids!=null&&roleids.length()>0){
        		
        		Set<String> permissions =managerService.findPermissions(roleids);
        		
        		if(permissions!=null){
        		authorizationInfo.setStringPermissions(permissions);    
        		}
        	}
        	
        }
        

        return authorizationInfo;
    }

    /**
     * 认证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {


        UsernamePasswordToken upToken = (UsernamePasswordToken) token;
        String username = upToken.getUsername().trim();
        String password = "";
        if (upToken.getPassword() != null) {
            password = new String(upToken.getPassword());
        }
        
        Manager mng =new Manager();
        mng.setAccount(username);
        mng.setPassword(password);
        
        mng = managerService.login(mng);

        if (mng != null) {
            SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(mng, password.toCharArray(), getName());
            return info;
        }
        return null;
    }
    
    


}
