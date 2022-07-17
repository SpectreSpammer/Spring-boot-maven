package com.cwt.collaberaSpringBoot.CWT_Collabera_SpringBoot_Maven.customerapi.service;


import com.cwt.collaberaSpringBoot.CWT_Collabera_SpringBoot_Maven.customerapi.dto.CustomerDTO;
import com.cwt.collaberaSpringBoot.CWT_Collabera_SpringBoot_Maven.customerapi.entity.Customer;

import java.util.List;

public interface CustomerService {

    CustomerDTO saveCustomer(CustomerDTO customerDTO);
    List<CustomerDTO> getAllCustomers();
    CustomerDTO getCustomerByid(Integer custId);
    void delCustomer(Integer custId);
    CustomerDTO updateCustomer(Customer customer,Integer custId);
    void delAllCustomers();


}
