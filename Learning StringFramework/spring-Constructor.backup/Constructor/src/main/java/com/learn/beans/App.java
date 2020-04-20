package com.learn.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("com.learn.xml/beans.xml");
        Persona per = (Persona) appContext.getBean("persona");

        System.out.println(per.getId() + "\n" + per.getNombre() + "\n" + per.getApellido());



        ((ConfigurableApplicationContext) appContext).close();
    }
}
