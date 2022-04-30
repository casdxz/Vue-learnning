package com.bear.web.demo;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @program: IntelliJ IDEA
 * @description: 容器初始化
 * @author: bear
 * @create: 2022-04-09 08:37
 **/
public class ServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(WebDemoApplication.class);
    }
}
