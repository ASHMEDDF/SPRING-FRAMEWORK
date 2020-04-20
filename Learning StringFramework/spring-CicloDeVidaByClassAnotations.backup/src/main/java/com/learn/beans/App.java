package com.learn.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("com.learn.xml/beans.xml");
        Persona per = (Persona) appContext.getBean("persona");

        System.out.println(per.getId() + " " + per.getNombre() + " " + per.getApellido() + " "
                + per.getPais().getNombre() + " " + per.getCiudad().getNombre());

            //PARA CONTINUAR CON EL PROCESO DE DESTRUCCION  SE DEBE CERRAR EL RECURSO
        ((ConfigurableApplicationContext) appContext).close();
    }
}
