package com.neurotoxin.miniboard.domain.web.repo;

import com.neurotoxin.miniboard.domain.web.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

// https://upcake.tistory.com/323 참고

@Repository
public abstract class MemMemberRepo implements MemberRepo {
    @Autowired
    MongoTemplate mongoTemplate;
    private MemberRepo memberRepo;
    public void member_insert(Member member) {

    }
    @Override
    public List<Member> member_list() {
        return memberRepo.member_list();
    }

    @Override
    public Member member_detail(int id) {
        return member_detail(id);
    }

    @Override
    public void member_update(Member member) {
    }

    @Override
    public void member_delete(int id) {
    }

}