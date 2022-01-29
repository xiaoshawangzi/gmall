package com.guazi.gmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author glj
 * @date 2022/1/29 3:26 下午
 * 第三方服务应用
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ThirdPartyApplication {
    public static void main(String[] args) {
        SpringApplication.run(ThirdPartyApplication.class,args);
    }
}
