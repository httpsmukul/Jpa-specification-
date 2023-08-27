package com.jpa.searchingfiltring.specification;

import com.jpa.searchingfiltring.entity.UserDetails;
import com.jpa.searchingfiltring.repository.UserDetailsRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import jakarta.persistence.criteria.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import java.util.ArrayList;
import java.util.List;



public class JpaSpecificationForUserDetails implements Specification<UserDetails> {

    @Autowired
    UserDetailsRepository hotelsRepository;

    private List<SearchCriteria> criteriaList;

    public JpaSpecificationForUserDetails(List<SearchCriteria> criteriaList) {
        super();
        this.criteriaList = criteriaList;

    }


    @Override
    public Predicate toPredicate(Root<UserDetails> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {

        List<Predicate> predicateList =  new ArrayList<>();

        predicateList.add(criteriaBuilder.equal(root.<Integer> get("id"),1));

        predicateList.add(criteriaBuilder.greaterThanOrEqualTo(root.<String> get("address"), "kolkata"));
//
        predicateList.add(criteriaBuilder.notEqual(root.<Boolean> get("city"),"kashipur"));
////
        predicateList.add(criteriaBuilder.like(criteriaBuilder.lower(root.<String>get("last_name"))  , "%" + "sha" + "%"));

        return criteriaBuilder.and(predicateList.toArray(new Predicate[0]));
        // this line is taking one by one and adding 1 by 1 with and
    }
}
