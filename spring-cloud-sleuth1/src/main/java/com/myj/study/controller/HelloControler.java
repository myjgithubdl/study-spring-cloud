package com.myj.study.controller;

import com.myj.study.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by MYJ on 2017/10/24.
 */
@RestController
public class HelloControler {

    private static Logger logger= LoggerFactory.getLogger(HelloControler.class);

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/trace-1")
    public String hi(@RequestParam String name){
        logger.info("==================call trace-1==================");
        return helloService.helloService(name);
    }

}
