package com.neurotoxin.miniboard.domain.article.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class GetController {

    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    public String Hello() {
        return "Hello Spring!!";
    }
}