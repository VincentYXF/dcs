package com.springcloud.prj.subprj.product.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("resta")
@Api("Swagger示例")
public class TestARestController {
    @ApiOperation("Swagger测试get")
    @RequestMapping("/get")
    public String getData(){
        return "get test";
    }

    @ApiOperation("Swagger测试show")
    @RequestMapping("/show")
    public String showInfo(){
        return "show test";
    }
}
