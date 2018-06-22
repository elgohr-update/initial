package com.rite.initial.Controller.UserInfoController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class UserController {

    @RequestMapping(value = "user")
    public String userInfo(){ return "加载用户信息"; }
}
