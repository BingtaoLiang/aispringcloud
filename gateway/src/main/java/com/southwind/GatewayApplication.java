package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy        //包含了@EnableZuulServer ，设置该类是⽹网关的启动类。
@EnableAutoConfiguration    //可以帮助Spring Boot 应用将所有符合条件的`@Configuration`配置加载到当前SpringBoot创建并使用的IOC容器中
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class,args);
    }
}
