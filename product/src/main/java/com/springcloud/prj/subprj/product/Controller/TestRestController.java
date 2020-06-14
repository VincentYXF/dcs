package com.springcloud.prj.subprj.product.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest")
@ApiModel(value = "测试")
public class TestRestController {

    @ApiModelProperty(value = "主键id")
    private String tsid;
    @ApiModelProperty(value = "名字")
    private String tsname;

    @RequestMapping("get")
    public String getData(){
        return "rest test";
    }
}
