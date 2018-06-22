package com.rite.initial.Controller.IndexController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class IndexController {

    @RequestMapping(value = "/")
    public String start(){
        return "123";
    }

    public String reading() { return "读取数据"; }

}
