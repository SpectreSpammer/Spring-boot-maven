package com.cwt.collaberaSpringBoot.CWT_Collabera_SpringBoot_Maven.EmailClient;

import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    public BasicSpellChecker basicSpellChecker(){
        return new BasicSpellChecker();
    }


    public AdvancedSpellChecker advancedSpellChecker(){
        return new AdvancedSpellChecker();
    }


    //@Bean can only be use to override a method not in a class
    /*
    @override is simple annotation to override a method from superclass or superinterface
    it's not related with @Bean
    @Bean is used to define a bean method inside @Configuration class

     */
    //@Scope(value = "prototype")
    public EmailClient emailClient(){
        EmailClient emailClient = new EmailClient();
        emailClient.setSpellChecker(advancedSpellChecker());
        emailClient.setMessage("Learning Spring Framework with Java Based Configuration!!");
        return emailClient;
    }
}
