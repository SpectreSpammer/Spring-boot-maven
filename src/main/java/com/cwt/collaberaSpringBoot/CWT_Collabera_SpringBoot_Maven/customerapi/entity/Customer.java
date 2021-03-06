package com.cwt.collaberaSpringBoot.CWT_Collabera_SpringBoot_Maven.customerapi.entity;

import com.cwt.collaberaSpringBoot.CWT_Collabera_SpringBoot_Maven.customerapi.dto.AddressDTO;
import com.cwt.collaberaSpringBoot.CWT_Collabera_SpringBoot_Maven.customerapi.dto.CustomerDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.PostConstruct;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="cwt_customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer custId;
    @Column(name = "first_name",length = 20,updatable = true)
    private  String firstName;
    private String lastName;
    @Column(name = "email",length = 255,unique = true,nullable = false)
    private String email;

    @Embedded
    private Address address;
    private LocalDate dob;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;

    public Customer(CustomerDTO customerDTO){
        this.firstName = customerDTO.getFirstName();
        this.lastName = customerDTO.getLastName();
        this.email = customerDTO.getEmail();
        AddressDTO addressDTO = customerDTO.getAddressDTO();
        this.address.setCity(addressDTO.getCity());
        this.address.setCountry(addressDTO.getCountry());
        this.dob = customerDTO.getDob();
        this.createdOn = customerDTO.getCreatedOn();
        this.updatedOn = customerDTO.getUpdatedOn();
    }

    @PrePersist
    public void created_On(){
        this.createdOn = LocalDateTime.now();
    }

    @PostUpdate
    public void updated_on(){
        this.updatedOn = LocalDateTime.now();
    }
}
