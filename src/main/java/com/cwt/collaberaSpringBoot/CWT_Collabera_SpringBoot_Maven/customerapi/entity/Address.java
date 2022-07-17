package com.cwt.collaberaSpringBoot.CWT_Collabera_SpringBoot_Maven.customerapi.entity;

import com.cwt.collaberaSpringBoot.CWT_Collabera_SpringBoot_Maven.customerapi.dto.AddressDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Address {
    private String city;
    private String country;


    public Address(AddressDTO addressDTO){
        this.city = addressDTO.getCity();
        this.country = addressDTO.getCountry();
    }
}
