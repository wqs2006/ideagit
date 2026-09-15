package com.itheima.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

import javax.servlet.Filter;

//设置一个servlet配置类，在里面加载spring的配置
public class servletconfig extends AbstractDispatcherServletInitializer {
    //加载springmvc的配置类
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(springmvcconfig.class);
        return ctx;
    }

    //设置springmvc的拦截路径
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    //加载spring的配置类
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }

    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        return  new Filter[]{characterEncodingFilter};
    }
}
