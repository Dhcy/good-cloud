package com.good.cloud.service.impl;

import com.good.cloud.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 2018/9/27.
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello() {
        return "我是第三个hello!";
    }

}
