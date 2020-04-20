package com.learn.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Persona {

    private int id;
    private String nombre;
    private String apellido;
    private Pais pais;
    private Ciudad ciudad;


    @PostConstruct
    private void init(){
        System.out.println("Antes de iniciar el Bean");
    }

    @PreDestroy
    private void destroy(){
        System.out.println("El Bean será destruido");
    }


    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
