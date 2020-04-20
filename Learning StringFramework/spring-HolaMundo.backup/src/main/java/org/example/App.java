package org.example;

import com.learn.beans.Mundo;
import com.learn.beans.MundoAnotaciones;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        // -->CONFIGURACION CON .XML<--
        // ApplicationContext appContext = new ClassPathXmlApplicationContext("com.learn.xml/beans.xml");

        //-->CINFIGURACION CON ANOTACIONES<--
        ApplicationContext appContext = new AnnotationConfigApplicationContext(MundoAnotaciones.class);

        Mundo l = (Mundo) appContext.getBean ("luna");
        Mundo m = (Mundo) appContext.getBean("mundo");


        System.out.println(m.getSaludo() + "\n" + l.getSaludoMoon());


        ((ConfigurableApplicationContext) appContext).close();

    }
}
