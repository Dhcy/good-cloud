package com.good.cloud.controller;
import com.good.cloud.service.HelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2018/9/7.
 */
@RestController
public class DemoController {
    @Autowired
    private HelloService helloService;

    @RequestMapping(value="/hello",method= RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public Map<String,Object> yes(@RequestParam String name){
        Map<String,Object>map=new HashMap<>();
       String s= helloService.hello();
       if(name.equals("张三")){
           int i=1/0;
        map.put("demo",s+name);}
        return map;
    }


}
