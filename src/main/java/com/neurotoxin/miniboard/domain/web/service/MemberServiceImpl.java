package com.neurotoxin.miniboard.domain.web.service;

import java.util.List;

import com.neurotoxin.miniboard.domain.web.entity.Member;
import com.neurotoxin.miniboard.domain.web.repo.MemMemberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemMemberRepo memMemberRepo;

    @Override
    public void member_insert(Member member) {
        memMemberRepo.member_insert(member);
    }

    @Override
    public List<Member> member_list() {
        return memMemberRepo.member_list();
    }

    @Override
    public Member member_detail(int id) {
        return memMemberRepo.member_detail(id);
    }

    @Override
    public void member_update(Member member) {
        memMemberRepo.member_update(member);
    }

    @Override
    public void member_delete(int id) {
        memMemberRepo.member_delete(id);
    }
}