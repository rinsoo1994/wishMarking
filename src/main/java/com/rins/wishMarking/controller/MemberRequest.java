package com.rins.wishMarking.controller;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MemberRequest {
    private String name;
    private String birthday;
    private String sex;
}
