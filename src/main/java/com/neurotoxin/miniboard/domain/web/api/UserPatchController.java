package com.neurotoxin.miniboard.domain.web.api;

import com.neurotoxin.miniboard.domain.web.entity.Member;
import com.neurotoxin.miniboard.domain.web.service.MemberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class UserPatchController {
    @Autowired
    private MemberServiceImpl service;
    //고객 정보 수정 화면 요청
    @RequestMapping("/modify.cu")
    public String modify(int id, Model model) {
        //선택한 고객의 정보를 DB에서 조회해온 후
        //수정 화면에 출력할 수 있도록 Model에 담는다
        model.addAttribute("vo", service.member_detail(id));
        return "customer/modify";
    }

    //고객 정보 수정 저장 처리 요청
    @RequestMapping("/update.cu")
    public String update(Member member) {
        //화면에서 수정 입력한 정보를 DB에 저장한 후
        service.member_update(member);

        //화면으로 연결
        return "redirect:detail.cu?id=" + member.getId();
    }
}
