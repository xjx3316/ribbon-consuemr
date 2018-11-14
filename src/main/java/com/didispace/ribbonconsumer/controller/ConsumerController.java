package com.didispace.ribbonconsumer.controller;

import com.didispace.ribbonconsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by xjx on 2018/11/13.
 */
@RestController
public class ConsumerController {

//    @Autowired
//    private RestTemplate restTemplate;
    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/ribbon-consumer",method = RequestMethod.GET)
    public String helloConsumer() {
        //return restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();
        return helloService.helloService();
    }

    @RequestMapping("/helloConsumer2")
    public String helloConsumer2() {
        return "helloConsumer2";
    }
}
