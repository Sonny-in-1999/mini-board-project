package com.neurotoxin.miniboard.web.viewcontroller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RootController {

    @RequestMapping(method = RequestMethod.GET, path = "login")
    public String Login() {
        return "로그인 페이지입니다";
    }
}
