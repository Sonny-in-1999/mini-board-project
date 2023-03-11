package com.neurotoxin.miniboard.domain.web.api;

import com.neurotoxin.miniboard.domain.web.entity.Member;
import com.neurotoxin.miniboard.domain.web.service.MemberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

public class UserGetController {
    @Autowired
    private MemberServiceImpl service;
    //고객 관리 목록 화면
    @RequestMapping("/list.cu")
    public String list(HttpSession session, Model model) {
        //서블릿에서는 request에서 getsession으로 세션을 가져왔다면,
        //스프링에서는 바로 세션에 접근할 수 있게 HttpSession을 지원한다.

        //category 어트리뷰트의 값에 따라 active 속성을 결정한다.
        session.setAttribute("category", "cu");		//카테고리 어트리뷰트에 cu를 설정
        List<Member> list = service.member_list();
        model.addAttribute("list", list);
        return "customer/list";
    }
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