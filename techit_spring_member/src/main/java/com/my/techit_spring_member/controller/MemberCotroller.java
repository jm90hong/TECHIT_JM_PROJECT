package com.my.techit_spring_member.controller;

import java.util.Optional;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.my.techit_spring_member.domain.Member;
import com.my.techit_spring_member.service.MemberServiceImpl;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/member")
public class MemberCotroller {


    @Autowired
    MemberServiceImpl memberServiceImpl;


    @GetMapping("{code}")
    public Optional<Member> findByCode(@PathVariable(value="code") String code){

        try {
            Optional<Member> memberData = memberServiceImpl.findByMemberCode(code);
            if(memberData.isPresent()){
                return memberData;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return  null;

    }

    @PostMapping("create")
    public ResponseEntity<Member> create(
                        @RequestBody Member member,
                        @RequestParam(value="recm_code",defaultValue = "") String recommendCode
                    ) {
        try {
            String code = RandomStringUtils.randomAlphanumeric(10);
            member.setMemberCode(code);

            //todo 회원 가입
            Member result = memberServiceImpl.save(member);

            //todo 추천된 회원 포인트 증가
            Optional<Member> op = memberServiceImpl.findByMemberCode(recommendCode);
            if(op.isPresent()){
                Member _m = op.get();
                _m.setPoint(_m.getPoint()+1000);
                memberServiceImpl.update(_m.getId(), _m);
            }

            return ResponseEntity.status(HttpStatus.CREATED).body(result);

        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

}
