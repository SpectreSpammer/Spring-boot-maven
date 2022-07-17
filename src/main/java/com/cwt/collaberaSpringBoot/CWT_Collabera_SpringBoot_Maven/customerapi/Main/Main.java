package com.cwt.collaberaSpringBoot.CWT_Collabera_SpringBoot_Maven.customerapi.Main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
}
