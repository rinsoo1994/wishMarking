package com.rins.wishMarking.service;

import com.rins.wishMarking.model.Marking;
import com.rins.wishMarking.model.Member;

public interface MarkingService {
    void save(Marking marking, Member member);
    void findMark(int markNo);
    void findAllMark(Member member, int rows, int page);
}
