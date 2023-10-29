package com.ssafy.ems.user.controller;

import com.ssafy.ems.user.service.UserServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService){
        this.userService = userService;
    }


}
