package com.unicom.engine_three.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.unicom.engine_three.intercept.LoginInterceptor;

@Configuration
public class RegisterInterceptor extends WebMvcConfigurerAdapter {
	@Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor());

        super.addInterceptors(registry);
    }
}
