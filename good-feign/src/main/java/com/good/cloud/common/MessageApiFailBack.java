package com.good.cloud.common;

import com.good.cloud.service.FeignService;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2018/9/28.
 */
@Component
public class MessageApiFailBack implements FeignService {
    @Override
    public Map<String, Object> hello(String name) {
        Map<String,Object>map=new HashMap<>();
        map.put(name,"调用方法出错啦");
        return map;
    }
}
