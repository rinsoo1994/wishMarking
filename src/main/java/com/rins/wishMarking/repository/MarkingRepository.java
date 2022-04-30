package com.rins.wishMarking.repository;

import com.rins.wishMarking.model.Marking;
import com.rins.wishMarking.model.Member;

import java.util.List;

public interface MarkingRepository {
    void save(Marking marking, Member member);
    Marking findMark(int markNo);
    List<Marking> findAllMark(Member member, int page, int rows);
}
