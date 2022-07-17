package com.cwt.collaberaSpringBoot.CWT_Collabera_SpringBoot_Maven.customerapi.dto;

import com.cwt.collaberaSpringBoot.CWT_Collabera_SpringBoot_Maven.customerapi.entity.Address;
import com.cwt.collaberaSpringBoot.CWT_Collabera_SpringBoot_Maven.customerapi.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {

    @NotBlank(message = "First Name can`t be null/blank")
    private  String firstName;

    @NotBlank(message = "Last Name can`t be null/blank")
    private String lastName;

    @NotBlank(message = "Email can`t be null/blank")
    private String email;

    @Valid
    private AddressDTO addressDTO;

    @PastOrPresent
    private LocalDate dob;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;

    /*
    Model mapper dependency
    it helps to convert from dto to entity and vice versa
     */

    public CustomerDTO(Customer customer){
        this.firstName = customer.getFirstName();
        this.lastName = customer.getFirstName();
        this.email = customer.getEmail();
        Address customerAddress = customer.getAddress();
        this.addressDTO.setCity(customerAddress.getCity());
        this.addressDTO.setCountry(customerAddress.getCountry());
        this.dob = customer.getDob();
        this.createdOn = customer.getCreatedOn();
        this.updatedOn = customer.getUpdatedOn();
    }
}
