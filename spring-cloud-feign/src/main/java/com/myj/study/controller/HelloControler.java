package com.myj.study.controller;

import com.myj.study.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by MYJ on 2017/10/25.
 */
@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello(@RequestParam String name){
        return helloService.sayHelloService(name);
    }

}
