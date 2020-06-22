package cn.acshmily.demo.config;

import cn.besttone.cachetemplate.autoconfigure.config.CacheClientAutoConfiguration;
import cn.besttone.cachetemplate.autoconfigure.config.CacheClientProperties;
import cn.besttone.cachetemplate.autoconfigure.service.CacheTemplate;
import org.springframework.boot.autoconfigure.cache.CacheProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Huanghz
 * @Description: 多例配置Bean
 * @Date:Created in 9:02 上午 2020/6/22
 * @ModifyBy:
 **/
@Configuration
public class CacheTemplateConfig {
    static CacheClientProperties cacheClientProperties = new CacheClientProperties();
    static CacheClientAutoConfiguration cacheClientAutoConfiguration = new CacheClientAutoConfiguration();
    static {
        cacheClientProperties.setUrl("http://192.168.29.109:8090");
        cacheClientProperties.setPassword("test");
        cacheClientProperties.setUserName("test");
    }
    @Bean("cacheTemplate1")
    CacheTemplate cacheTemplate(){
        return cacheClientAutoConfiguration.cacheTemplate(cacheClientProperties);
    }
    @Bean("cacheTemplate2")
    CacheTemplate cacheTemplate1(){
        return cacheClientAutoConfiguration.cacheTemplate(cacheClientProperties);
    }
}
