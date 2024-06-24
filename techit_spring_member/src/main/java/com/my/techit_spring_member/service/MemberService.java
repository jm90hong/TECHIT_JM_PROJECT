package com.my.techit_spring_member.service;



import java.util.Optional;

import com.my.techit_spring_member.domain.Member;

public interface MemberService {

    public Member save(Member member);
    public Optional<Member> findById(Long id);
    public Member update(Long id, Member member);
    public void delete(Long id);

    public Optional<Member> findByMemberCode(String memberCode);

}
