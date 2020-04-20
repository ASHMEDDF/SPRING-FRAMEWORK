package com.learn.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Persona implements InitializingBean, DisposableBean {

//SE IMPLEMENTAS LAS INTERFACES "InitializingBean" Y "DisposableBean", LUEGO SE GENERAN LOS METODOS EN EL "@OVERRIDE" CORRESPONDIENTE

    private int id;
    private String nombre;
    private String apellido;
    private Pais pais;
    private Ciudad ciudad;


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

    @Override
    public void afterPropertiesSet() throws Exception { System.out.println("Antes de iniciar el Bean"); }

    @Override
    public void destroy() throws Exception { System.out.println("El Bean será destruido"); }
}
