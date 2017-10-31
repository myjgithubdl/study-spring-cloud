package com.myj.study.rabbitmq.test;

import com.myj.study.SpringBootRabbitmqApplication;
import com.myj.study.rabbitmq.sender.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by MYJ on 2017/10/30.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringBootRabbitmqApplication.class)
public class HelloApplicationTests {

    @Autowired
    private Sender sender;

    @Test
    public void  hello(){
        sender.send();
    }
}
