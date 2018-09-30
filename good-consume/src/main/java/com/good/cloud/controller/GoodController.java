package com.good.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2018/9/7.
 */
@RestController
public class GoodController {
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping(value = "/consume",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public Map hello(){
        return restTemplate.getForEntity("http://hello-service/demo", Map.class).getBody();
    }
    @RequestMapping(value="/demo",method= RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public Map<String,Object> yes(){
        Map<String,Object>map=new HashMap<>();
        map.put("no","你好，我来自consume");
        return map;
    }

}
