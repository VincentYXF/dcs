package com.springcloud.prj.subprj.eurekaprovider.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("provider")
public class ProviderController {

    @RequestMapping(value = "get")
    public  String getData(){
        return "数据";
    }

}
