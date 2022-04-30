package com.rins.wishMarking.controller;

import com.rins.wishMarking.model.Member;
import com.rins.wishMarking.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

@RequestMapping("/")
@Controller
public class MemberController {
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/members/join")
    @ResponseBody
    public String join(@RequestBody MemberRequest memberRequest) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.KOREA);
        LocalDate birthday = LocalDate.parse(memberRequest.getBirthday(), dateTimeFormatter);
        Member member = new Member(memberRequest.getName(), memberRequest.getSex(), birthday);
        memberService.join(member);
        return "hello world";
    }

    @GetMapping("/member/{name}")
    @ResponseBody
    public Member findMember(@PathVariable String name) {
        return memberService.findMember(name);
    }
}
