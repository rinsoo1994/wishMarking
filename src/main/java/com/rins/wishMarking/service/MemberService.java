package com.rins.wishMarking.service;

import com.rins.wishMarking.model.Member;

public interface MemberService {
    void join(Member member);
    Member findMember(String name);
}
