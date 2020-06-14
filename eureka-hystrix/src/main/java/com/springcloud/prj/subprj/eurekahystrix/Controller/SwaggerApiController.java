package com.springcloud.prj.subprj.eurekahystrix.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
@Api("swaggerHystrixController相关的api")
public class SwaggerApiController {
    @ApiOperation(value = "学生")
    @RequestMapping("get")
    public String getData(){
        String name;
        int age;
        name ="lisi";
        return name;

    }
}
