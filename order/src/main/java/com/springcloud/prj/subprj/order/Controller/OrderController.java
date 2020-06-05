package com.springcloud.prj.subprj.order.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {

    @RequestMapping("get")
    public String getData(){
        return "order";
    }
}
