package com.learn.beans;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MundoAnotaciones {

    @Bean
    public Mundo mundo(){
        return new Mundo();
    }

    @Bean
    public Mundo luna(){
        return new Mundo();
    }



}
