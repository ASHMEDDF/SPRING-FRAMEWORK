package com.learn.usoInterfaces;


import com.learn.usoInterfaces.interfaz.IEquipo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppInterfaces {

    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("com.learn.interfaces/interfaces.xml");
        Jugador jug = (Jugador) appContext.getBean("messi");

        //IEquipo equip = (IEquipo) appContext.getBean("barcelona");

        System.out.println(jug.getNombre() + " - " + jug.getEquipo().mostrar());

        ((ConfigurableApplicationContext) appContext).close();
    }
}
