package com.neurotoxin.miniboard.domain.web.service;

import com.neurotoxin.miniboard.domain.web.entity.Member;

import java.util.List;

public interface MemberService {
    //CRUD(Create/Read/Update/Delete)
    //인터페이스이므로 기본적으로 abstract 속성이 붙어서 추상 메서드가 된다.
    //고객 정보 삽입 저장
    void member_insert(Member member);

    //목록 조회
    List<Member> member_list();

    //상세(1건) 조회
    Member member_detail(int id);

    //고객 정보 변경 저장
    void member_update(Member member);

    //고객 정보 삭제
    void member_delete(int id);
}