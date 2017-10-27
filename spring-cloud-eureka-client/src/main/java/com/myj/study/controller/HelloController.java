package com.myj.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.SchemaOutputResolver;


/**
 * Created by MYJ on 2017/10/21.
 */

@RestController
public class HelloController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    String port;

    @RequestMapping("/hello")
    public String home(@RequestParam String name) {
        ServiceInstance localServiceInstance = discoveryClient.getLocalServiceInstance();
        System.out.println("host:"+localServiceInstance.getHost()+"  serviceId:"+localServiceInstance.getServiceId());
        String str="Hello "+name+"，你访问的应用端口为:" +port;
        str +="<br/>host:"+localServiceInstance.getHost()+"  serviceId:"+localServiceInstance.getServiceId();
        return str;
    }

}
