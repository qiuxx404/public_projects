package com.qiuxx.security.annotation.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * @Description: 创建一个扩展 AbstractSecurityWebApplicationInitializer 的一个类,
 *                  它将会自动地加载 springSecurityFilterChain
 * @Author: qiuxx
 * @Date: 10:22 2017/12/28
 */
public class SpringSecurityInitializer extends AbstractSecurityWebApplicationInitializer {
    //do noting

    /*
        等同于web.xml中
        <filter>
		<filter-name>springSecurityFilterChain</filter-name>
		<filter-class>org.springframework.web.filter.DelegatingFilterProxy
                </filter-class>
	</filter>

	<filter-mapping>
		<filter-name>springSecurityFilterChain</filter-name>
		<url-pattern>/*</url-pattern>
	</filter-mapping>
     */
}
