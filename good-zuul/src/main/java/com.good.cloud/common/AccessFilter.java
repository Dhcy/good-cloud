package com.good.cloud.common;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by admin on 2018/9/28.
 */
@Component
public class AccessFilter extends ZuulFilter{

    private static Logger log = LoggerFactory.getLogger(AccessFilter.class);
    @Override
    public String filterType() {
       //前置过滤器
        return "pre";
    }

    @Override
    public int filterOrder() {
        //数字越大，优先级越低
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        //是否执行该过滤器，true代表需要
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx=RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        //获取传来的参数accessToken
        String accessToken = request.getParameter("accessToken");
        if(accessToken==null){
            log.warn("access token is empty!");
            //过滤该请求，不让下级服务去转发请求，到此结束
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            return null;
        }
        //如果有token,则进行路由转发
        log.info("access token ok");
        //这里return的值没有意义，zuul框架没有使用该返回值
        return null;
    }
}
