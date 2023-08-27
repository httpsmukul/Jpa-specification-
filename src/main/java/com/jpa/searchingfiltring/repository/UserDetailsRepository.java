package com.jpa.searchingfiltring.repository;

import com.jpa.searchingfiltring.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails,Long>, JpaSpecificationExecutor<UserDetails> {

}
