package com.springcloud.prj.subprj.product.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value = "get")
    public String getData(){
        return "Hello";
    }
}
