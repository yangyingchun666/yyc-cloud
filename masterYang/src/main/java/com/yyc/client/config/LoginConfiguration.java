package com.yyc.client.config;

import com.yyc.client.interceptor.LoginInterceptor;
import com.yyc.client.service.UserInfoService;
import com.yyc.client.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class LoginConfiguration implements WebMvcConfigurer {

    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    RedisUtil redisUtil;
    // 注册拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 添加拦截的请求，并排除几个不拦截的请求
        registry.addInterceptor(new LoginInterceptor(userInfoService,redisUtil)).addPathPatterns("/**")
                .excludePathPatterns("/logOut","/index/register", "/", "/index/login","/static/**","/favicon.ico","/error","/verifyPhone","/verifyUsername");
    }

}
