package com.cwt.collaberaSpringBoot.CWT_Collabera_SpringBoot_Maven.EmailClient;


import lombok.Data;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class EmailClient implements InitializingBean, DisposableBean {

    @Value("${email.message}")
    private String message;

    @Value("${ename}")
    private String name;

    @Autowired
    private SpellChecker spellChecker;


    public void sendEmail(){
        try {
            spellChecker.spellCheck(this.message + " : " + this.name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean is being destroyed!!!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean is being initialized!!!");
    }
}
