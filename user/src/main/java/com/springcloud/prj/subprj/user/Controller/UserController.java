package com.springcloud.prj.subprj.user.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @RequestMapping("get")
    public String getData(){
        return "user";
    }
}
