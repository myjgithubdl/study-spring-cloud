package com.myj.study.service;

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

    public String helloService(String name) {
        return restTemplate.getForObject("http://spring-cloud-sleuth2/trace-2?name="+name,String.class);
    }

}
