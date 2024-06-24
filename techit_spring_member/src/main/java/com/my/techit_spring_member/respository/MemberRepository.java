package com.my.techit_spring_member.respository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.my.techit_spring_member.domain.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

    public Optional<Member> findByMemberCode(String code);

}
