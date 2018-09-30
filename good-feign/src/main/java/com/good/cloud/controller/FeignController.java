package com.good.cloud.controller;

import com.good.cloud.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2018/9/27.
 */
@RestController
public class FeignController {
    @Autowired
    private FeignService feignService;
    @RequestMapping(value="/feign",method= RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public Map<String,Object> feign(){
        Map<String, Object> hello = feignService.hello("张三");

        return hello;
}}
