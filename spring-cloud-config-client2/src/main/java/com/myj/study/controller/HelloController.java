package com.myj.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by MYJ on 2017/10/28.
 */
@RefreshScope
@RestController
public class HelloController {

    @Value("${from}")
    String from;

    @Autowired
    private Environment env;

    @RequestMapping(value = "/from")
    public String from(){
        return this.from;
    }

    @RequestMapping(value = "/from2")
    public String from2(){
        return env.getProperty("from" , "undefined");
    }

}
