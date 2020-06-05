package com.springcloud.prj.subprj.eurekaconsumer.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("consumer")
public class ConsumerController {
    private final String url="http://localhost:8001/provider/get";
    @RequestMapping("get")
    public String getData(){
        RestTemplate restTemplate=new RestTemplate();
        String data=restTemplate.getForObject(url,String.class);
        return data;
    }
}
