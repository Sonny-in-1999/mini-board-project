package com.neurotoxin.miniboard.domain.web.api;

import com.neurotoxin.miniboard.domain.web.entity.Member;
import com.neurotoxin.miniboard.domain.web.service.MemberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootViewController {
    @Autowired
    private MemberServiceImpl service;
    //고객 상세 화면 요청
    @RequestMapping("/detail.cu")
    public String detail(int id, Model model) {
        //선택한 고객 정보를 DB에 조회해와서
        Member member = service.member_detail(id);
        //화면에 출력할 수 있도록 Model에 담는다.
        //원래는 string타입으로 담겨야하지만 스프링에서는 자동으로 형변환이 되서 int타입으로 담긴다.

        model.addAttribute("member", member);
        return "customer/detail";
    }

}