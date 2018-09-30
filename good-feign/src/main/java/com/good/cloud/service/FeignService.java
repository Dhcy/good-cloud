package com.good.cloud.service;

import com.good.cloud.common.MessageApiFailBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Created by admin on 2018/9/27.
 */
@FeignClient(value="hello-service",fallback = MessageApiFailBack.class)
public interface FeignService {
    @RequestMapping("/hello")
    Map<String,Object> hello(@RequestParam("name") String name);
}
