package com.rins.wishMarking.repository;

import com.rins.wishMarking.model.Member;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class MemberRepositoryImpl implements MemberRepository{
    Map<String, Member> memberInfo = new HashMap<>();

    @Override
    public void save(Member member) {
        memberInfo.put(member.getName(), member);
    }

    @Override
    public Member findMember(String name) {
        return memberInfo.get(name);
    }
}
