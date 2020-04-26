package com.leyou.comments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: xy
 * @Feature: 开启feign
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class LyCommentsApplication {
    public static void main(String[] args) {
        SpringApplication.run(LyCommentsApplication.class,args);
    }
}
