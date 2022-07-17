package com.cwt.collaberaSpringBoot.CWT_Collabera_SpringBoot_Maven.customerapi.service;


import com.cwt.collaberaSpringBoot.CWT_Collabera_SpringBoot_Maven.customerapi.dto.CustomerDTO;
import com.cwt.collaberaSpringBoot.CWT_Collabera_SpringBoot_Maven.customerapi.entity.Customer;
import com.cwt.collaberaSpringBoot.CWT_Collabera_SpringBoot_Maven.customerapi.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class CustomerServiceImpl  implements  CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public CustomerDTO saveCustomer(CustomerDTO customerDTO) {
        Customer cust =  customerRepository.save(new Customer(customerDTO));
        return new CustomerDTO((cust));
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        List<CustomerDTO> dtoList = customerRepository.findAll().stream().map(CustomerDTO::new).collect(Collectors.toList());
        return dtoList;
    }

    @Override
    public CustomerDTO getCustomerByid(Integer custId) {

        return null;
    }

    @Override
    public void delCustomer(Integer custId) {

    }

    @Override
    public CustomerDTO updateCustomer(Customer customer, Integer custId) {
        return null;
    }

    @Override
    public void delAllCustomers() {

    }
}
