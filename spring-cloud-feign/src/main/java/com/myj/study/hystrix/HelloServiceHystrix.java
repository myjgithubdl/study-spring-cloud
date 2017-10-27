package com.myj.study.hystrix;

import com.myj.study.service.HelloService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by MYJ on 2017/10/25.
 */
@Component
public class HelloServiceHystrix  implements HelloService {
    @Override
    public String sayHelloService(@RequestParam(value = "name") String name) {
        return "你好,"+name+",spring-cloud-feign容错提示:spring-cloud-eureka-client服务系统发生了错误!";
    }
}
