package com.cwt.collaberaSpringBoot.CWT_Collabera_SpringBoot_Maven.EmailClient;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailClientConfiguration implements CommandLineRunner {


    @Autowired
    private EmailClient emailClient;

    public static void main(String[] args) {
        SpringApplication.run(EmailClientConfiguration.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
        emailClient.sendEmail();
    }
}
