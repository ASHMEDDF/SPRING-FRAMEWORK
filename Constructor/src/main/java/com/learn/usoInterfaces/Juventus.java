package com.learn.usoInterfaces;

import com.learn.usoInterfaces.interfaz.IEquipo;

public class Juventus implements IEquipo {
    @Override
    public String mostrar() {
        return "Juventus";
    }
}
