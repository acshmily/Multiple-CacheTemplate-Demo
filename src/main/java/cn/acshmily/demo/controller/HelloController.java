package cn.acshmily.demo.controller;

import cn.besttone.cachetemplate.autoconfigure.service.CacheTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: Huanghz
 * @Description: TODO
 * @Date:Created in 8:58 上午 2020/6/22
 * @ModifyBy:
 **/
@RestController
@RequestMapping("hello")
public class HelloController {
    @GetMapping
    public String hello(){
        cacheTemplate1.stringSet("1","2");
        return cacheTemplate2.stringGet("1");
    }

    @Resource
    @Qualifier("cacheTemplate1")
    private CacheTemplate cacheTemplate1;
    @Resource
    @Qualifier("cacheTemplate2")
    private CacheTemplate cacheTemplate2;
}
