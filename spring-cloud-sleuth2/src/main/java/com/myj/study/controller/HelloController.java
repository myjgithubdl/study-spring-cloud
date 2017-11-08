package com.myj.study.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by MYJ on 2017/10/21.
 */

@RestController
public class HelloController {

    private static Logger logger= LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    String port;

    @RequestMapping("/trace-2")
    public String home(@RequestParam String name) {
        logger.info("==================call trace-2==================");
        ServiceInstance localServiceInstance = discoveryClient.getLocalServiceInstance();
        String str="Hello "+name+"，你访问服务的端口为:" +port;
        str +="<br/>主机为:"+localServiceInstance.getHost()+"  服务ID为:"+localServiceInstance.getServiceId();
        return str;
    }

}
