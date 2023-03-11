package com.neurotoxin.miniboard.domain.web.api;

import com.neurotoxin.miniboard.domain.web.service.MemberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class UserDeleteController {
    @Autowired
    private MemberServiceImpl service;
    @RequestMapping("/delete.cu")
    public String delete(int id) {
        //선택한 고객 정보를 DB에서 삭제한 후
        service.member_delete(id);
        //목록 화면으로 연결
        return "redirect:list.cu";
    }

}
