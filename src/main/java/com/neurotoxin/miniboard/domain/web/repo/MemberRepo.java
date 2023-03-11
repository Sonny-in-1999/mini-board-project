package com.neurotoxin.miniboard.domain.web.repo;

import com.neurotoxin.miniboard.domain.web.entity.Member;
import org.springframework.boot.ApplicationArguments;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MemberRepo extends MongoRepository<Member, String> {

    List<Member> member_list();

    Member member_detail(int id);

    void member_update(Member member);

    void member_delete(int id);
}