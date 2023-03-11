package com.neurotoxin.miniboard.domain.web.api;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


public class RootViewController {

    @RequestMapping(method = RequestMethod.GET, path = "login")
    public String Login() {
        return "로그인 페이지입니다";
    }
}