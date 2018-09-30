package com.good.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by admin on 2018/9/7.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class GoodFeignApplication {
    public static void main(String []args){
        SpringApplication.run(GoodFeignApplication.class,args);
    }

}
