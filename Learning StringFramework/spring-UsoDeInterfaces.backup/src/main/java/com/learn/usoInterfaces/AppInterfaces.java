package com.learn.usoInterfaces;


import com.learn.usoInterfaces.interfaz.IEquipo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppInterfaces {

    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext(
                "com.learn.interfaces/interfaces.xml");
        Jugador jug = (Jugador) appContext.getBean("messi");

//EL USO DE INTERFACES PERMITE MODIFICAR EL MENSAGE DE "BARCELONA" O "JUVENTUS" SOLO CAMBBIANDO EL NOMBRE DEL BEAN
//SIN NECESIDAD DE CAMBIAR TODA LA LINEA

      //IEquipo equip = (IEquipo) appContext.getBean("juventus");
        IEquipo equip = (IEquipo) appContext.getBean("barcelona");

        System.out.println(jug.getNombre() + " - " + equip.mostrar());

        ((ConfigurableApplicationContext) appContext).close();
    }
}
