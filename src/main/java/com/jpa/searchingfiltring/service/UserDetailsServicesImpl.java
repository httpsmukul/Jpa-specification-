package com.jpa.searchingfiltring.service;


import com.jpa.searchingfiltring.entity.UserDetails;
import com.jpa.searchingfiltring.repository.UserDetailsRepository;
import com.jpa.searchingfiltring.specification.JpaSpecificationForUserDetails;
import com.jpa.searchingfiltring.specification.SearchCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsServicesImpl implements UserDetailServices{

    @Autowired
    private UserDetailsRepository userDetailsRepository;


    @Override
    public void findByHardCodedValue() {

        //we need to crate a list of criteria like this and just pass in jpaSpecificationForUserDetails,
        // so we can access form there
        List<SearchCriteria> criteriaList = new ArrayList<>();

        JpaSpecificationForUserDetails jpaSpecificationForUserDetails = new JpaSpecificationForUserDetails(criteriaList);

        List<UserDetails> response = userDetailsRepository.findAll(jpaSpecificationForUserDetails);

        System.out.println("jpaSpecificationForUserDetails+++++++" + response);
    }
}
