package com.jpa.searchingfiltring.controller;

import com.jpa.searchingfiltring.service.UserDetailServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/user")
public class UserDetailsController {

    @Autowired
    private UserDetailServices userDetailServices;

    @PostMapping("/searching")
    public void findByInput(){
        System.out.println("yes hit me");
        userDetailServices.findByHardCodedValue();
    }

    @GetMapping("get")
    public String find(){
        return "yes";
    }


}
