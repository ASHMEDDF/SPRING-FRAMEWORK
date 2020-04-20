package com.learn.usoInterfaces;

import com.learn.usoInterfaces.interfaz.IEquipo;
import org.springframework.beans.factory.annotation.Required;

public class Jugador {

    private int numero;
    private String nombre;
    private IEquipo equipo;


    public int getNumero() {
        return numero;
    }


//SE AGREGA EL "@REQUIRED" SOLO AL METODO SET DEL ATRIBUTO PARA PODER SER REQUERIDO
    @Required
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
