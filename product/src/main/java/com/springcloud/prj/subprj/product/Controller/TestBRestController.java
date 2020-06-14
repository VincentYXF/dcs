package com.springcloud.prj.subprj.product.Controller;


import com.springcloud.prj.subprj.product.Model.UserModel;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("restb")
@Api("测试TestB")
public class TestBRestController {


    @RequestMapping("/get")
    public String getInfo(String InfoName){
        return InfoName;
    }


}
