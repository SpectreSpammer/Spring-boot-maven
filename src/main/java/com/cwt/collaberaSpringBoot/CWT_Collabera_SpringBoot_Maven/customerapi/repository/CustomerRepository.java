package com.cwt.collaberaSpringBoot.CWT_Collabera_SpringBoot_Maven.customerapi.repository;

import com.cwt.collaberaSpringBoot.CWT_Collabera_SpringBoot_Maven.customerapi.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
