package com.good.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by admin on 2018/9/7.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GoodClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodClientApplication.class, args);
    }
}
