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

        HttpServletRequest req = (HttpServletRequest)request;
        String contextPath = req.getContextPath();
        String uri = req.getRequestURI().substring(contextPath.length());
        boolean flage = SecurityUtils.getSubject().isPermitted(uri);
        return flage;
    }
}
