package com.hoannguyen.configconsumer.controller;

import com.hoannguyen.configconsumer.model.MemberProfileConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
    @Autowired
    MemberProfileConfiguration memberProfileConfiguration;

    @RequestMapping("profile")
    public MemberProfileConfiguration getConfig(){
        return memberProfileConfiguration;
    }
}
