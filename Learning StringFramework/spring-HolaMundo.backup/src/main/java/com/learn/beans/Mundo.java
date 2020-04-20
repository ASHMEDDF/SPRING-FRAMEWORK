package com.learn.beans;

import org.springframework.beans.factory.annotation.Value;

public class Mundo {

    @Value("Hello World!")
    private String saludo;

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

    @Value("Hello Moon!")
    private String saludoMoon;

    public String getSaludoMoon() {
        return saludoMoon;
    }

    public void setSaludoMoon(String saludoMoon) {
        this.saludoMoon = saludoMoon;
    }
}

