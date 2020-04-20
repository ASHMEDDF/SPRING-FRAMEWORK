package com.learn.usoInterfaces;

import com.learn.usoInterfaces.interfaz.IEquipo;

public class Jugador {

    private int numero;
    private String nombre;
    private IEquipo equipo;
//SE AGREGA EL METODO DE LA INNTERFAZ CON SU RESPECTIVO GET Y SET

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public IEquipo getEquipo() {
        return equipo;
    }

    public void setEquipo(IEquipo equipo) {
        this.equipo = equipo;
    }
}
