package com.myj.study.service;

import com.myj.study.hystrix.HelloServiceHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by MYJ on 2017/10/25.
 */

@FeignClient(value = "spring-cloud-eureka-client" , fallback = HelloServiceHystrix.class)
public interface HelloService {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHelloService(@RequestParam(value = "name") String name);

}
