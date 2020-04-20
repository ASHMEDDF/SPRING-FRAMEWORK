package com.learn.usoInterfaces;

import com.learn.usoInterfaces.interfaz.IEquipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Jugador {

    private int numero;
    private String nombre;
//SE AGREGA LA ANOTACION @AUTOWIRE EN LAS PROPIEDADES POR BUENA CONSTUMBRE, TAMBIEN PUEDE IR EN EL METODO
    @Autowired

//SE AGREGA @QUALIFIER PARA HACER QUE EL EL AUTOWIRE SEA BYTIPE, EN CASO DE NO ACCEDER CAMBIANDO EL ID DEL BEAN FACILMENTE
    @Qualifier("barcelonaQualifier")
    private IEquipo equipo;


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
