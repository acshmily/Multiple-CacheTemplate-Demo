package cn.acshmily.demo;

import cn.besttone.cachetemplate.autoconfigure.announce.EnableCacheTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
 // @EnableCacheTemplate
// 单例的时候使用，多例不能使用
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
