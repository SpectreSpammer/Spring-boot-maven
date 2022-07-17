package com.cwt.collaberaSpringBoot.CWT_Collabera_SpringBoot_Maven.EmailClient;



public class AdvancedSpellChecker implements SpellChecker {

    @Override
    public void spellCheck(String message) throws InterruptedException {
        System.out.println("Spelling Check Being Processed By : "+ getClass().getSimpleName());
        Thread.sleep(5000);
        if (!message.isBlank())
            System.out.println("Here is Your Message : "+ message);
        else
            throw new RuntimeException("Email Message Can't Be Null or Blank!!");
    }
}
