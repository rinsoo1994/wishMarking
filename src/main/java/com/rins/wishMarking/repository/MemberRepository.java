package com.rins.wishMarking.repository;

import com.rins.wishMarking.model.Member;

public interface MemberRepository {
    void save(Member member);
    Member findMember(String name);
}
