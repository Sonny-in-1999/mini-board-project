package com.neurotoxin.miniboard.domain.web.api;

import com.neurotoxin.miniboard.domain.web.entity.Member;
import com.neurotoxin.miniboard.domain.web.service.MemberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class UserPostController {
    @Autowired
    private MemberServiceImpl service;
    //신규 고객 등록 화면 요청
    @RequestMapping("/new.cu")
    public String customer() {
        return "customer/new";
    }
    //신규 고객 등록 처리 요청
    @RequestMapping("/insert.cu")
    public String insert(Member member) {
        //화면에서 입력한 정보를 DB에 저장한 후
        service.member_insert(member);

        //목록 화면으로 연결
        return "redirect:list.cu";
    }
}
