package com.qiuxx.shiro.utils;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.qiuxx.shiro.beans.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authz.PermissionsAuthorizationFilter;
import org.springframework.stereotype.Component;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Description:
 * @Author: qiuxx
 * @Date: 14:23 2017/12/19
 */
@Component("frameperms")
public class FramePermissionsAuthorizationFilter extends PermissionsAuthorizationFilter{

    @Override
    public boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) throws IOException {
       // Subject subject = SecurityUtils.getSubject();
        //User  user = (User)subject.getPrincipal();

        HttpServletRequest req = (HttpServletRequest)request;
        Subject subject1 = getSubject(request, response);
        String uri = req.getRequestURI();
       // String requestURL = req.getRequestURI().toString();
        String contextPath = req.getContextPath();

        int i = uri.indexOf(contextPath);
        if (i > -1) {
            uri = uri.substring(i + contextPath.length());
        }
        if (StringUtils.isBlank(uri)){
            uri="/";
        }
        boolean permitted = false;
        if ("/".equals(uri)) {
            permitted = true;
        } else {
            permitted = subject1.isPermitted(uri);
        }
//        String isqx = "否";
//        if(permitted) {
//            isqx = "是";
//        }

        return permitted;
    }
}
