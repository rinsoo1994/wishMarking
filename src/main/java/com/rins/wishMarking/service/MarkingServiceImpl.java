package com.rins.wishMarking.service;

import com.rins.wishMarking.model.Marking;
import com.rins.wishMarking.model.Member;
import com.rins.wishMarking.repository.MarkingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MarkingServiceImpl implements MarkingService{
    private final MarkingRepository markingRepository;

    @Autowired
    public MarkingServiceImpl(MarkingRepository markingRepository) {
        this.markingRepository = markingRepository;
    }

    @Override
    public void save(Marking marking, Member member) {
        markingRepository.save(marking, member);
    }

    @Override
    public void findMark(int markNo) {
        Marking marking = markingRepository.findMark(markNo);
    }

    @Override
    public void findAllMark(Member member, int rows, int page) {
        markingRepository.findAllMark(member, page, rows);
    }
}
