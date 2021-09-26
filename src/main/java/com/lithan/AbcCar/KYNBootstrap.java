package com.lithan.AbcCar;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.lithan.AbcCar.config.JPAConfig;
import com.lithan.AbcCar.config.SecurityConfig;
import com.lithan.AbcCar.config.WebMvcConfig;

//web.xml
public class KYNBootstrap extends AbstractAnnotationConfigDispatcherServletInitializer {
	
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{JPAConfig.class, SecurityConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebMvcConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
