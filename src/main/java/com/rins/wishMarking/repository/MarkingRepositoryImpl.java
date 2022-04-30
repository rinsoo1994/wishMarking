package com.rins.wishMarking.repository;

import com.rins.wishMarking.model.Marking;
import com.rins.wishMarking.model.Member;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public class MarkingRepositoryImpl implements MarkingRepository{
    Map<String, List<Marking>> markingInfo = new HashMap<>();

    @Override
    public void save(Marking marking, Member member) {
//        String name = member.getName();
//        if (markingInfo.containsKey(member.getName())) {
//            markingInfo.get(name).add(marking);
//        }
//        else {
//            List<Marking> markingList = new ArrayList();
//            markingList.add(Marking)
//            markingInfo.put(name, );
//        }
    }


    @Override
    public Marking findMark(int markNo) {
        return null;
    }

    @Override
    public List<Marking> findAllMark(Member member, int page, int rows) {
        return null;
    }
}
