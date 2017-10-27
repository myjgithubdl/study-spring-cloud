package com.myj.study.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by MYJ on 2017/10/24.
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloError")
    public String helloService(String name) {
        return restTemplate.getForObject("http://SPRING-CLOUD-EUREKA-CLIENT/hello?name="+name,String.class);
    }

    public String helloError(String name) {
        return "你好,"+name+",系统发生了错误!";
    }
}
