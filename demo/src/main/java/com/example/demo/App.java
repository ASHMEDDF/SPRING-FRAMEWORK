package com.example.demo;

import com.hola.beans.HolaMundo;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext();
        HolaMundo m = appContext.getBean(HolaMundo.class);

    }
}
