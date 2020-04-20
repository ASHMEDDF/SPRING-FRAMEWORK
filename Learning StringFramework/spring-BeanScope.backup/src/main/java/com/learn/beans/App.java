package com.learn.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("com.learn.xml/beans.xml");
        Persona per = (Persona) appContext.getBean("persona");
        Persona per2 = (Persona) appContext.getBean("persona");

        System.out.println(per.getId() + " " + per.getNombre() + " " + per.getApellido() + " "
                + per.getPais().getNombre() + " " + per.getCiudad().getNombre());

        System.out.println(per2.getId() + " " + per2.getNombre() + " " + per2.getApellido() + " "
                + per2.getPais().getNombre() + " " + per2.getCiudad().getNombre());


        ((ConfigurableApplicationContext) appContext).close();
    }
}
