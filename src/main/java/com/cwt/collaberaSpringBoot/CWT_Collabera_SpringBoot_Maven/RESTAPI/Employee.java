package com.cwt.collaberaSpringBoot.CWT_Collabera_SpringBoot_Maven.RESTAPI;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    Integer eid;
    String name;
    String position;
    String departmentl;
}
