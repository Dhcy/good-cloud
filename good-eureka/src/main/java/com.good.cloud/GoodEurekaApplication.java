package com.good.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by admin on 2018/9/7.
 */
@EnableEurekaServer
@SpringBootApplication
public class GoodEurekaApplication {
    public static void main(String []args){
        SpringApplication.run(GoodEurekaApplication.class,args);
    }
}
