package com.good.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by admin on 2018/9/7.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class GoodZuulApplication {
    public static void main(String []args){
        SpringApplication.run(GoodZuulApplication.class,args);
    }

}
