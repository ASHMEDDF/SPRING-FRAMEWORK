package com.learn.usoInterfaces;

import com.learn.usoInterfaces.interfaz.IEquipo;

public class Barcelona implements IEquipo {
    @Override
    public String mostrar() {
        return "Barcelona FC";
    }
}
