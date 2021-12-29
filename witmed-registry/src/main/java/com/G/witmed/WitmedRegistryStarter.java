package com.G.witmed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <b>智慧医疗信息平台 - Eureka 注册中心启动类</b>
 */
@SpringBootApplication
@EnableEurekaServer
public class WitmedRegistryStarter {
    public static void main(String[] args) {
        SpringApplication.run(WitmedRegistryStarter.class,args);
    }
}
