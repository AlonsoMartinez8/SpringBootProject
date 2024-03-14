package com.example.demospringbootapi.model;

import jakarta.persistence.*;
import java.math.BigInteger;
import java.util.Objects;

@Entity
public class Equipo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "CODEQUIPO")
    private BigInteger codequipo;

    public BigInteger getCodequipo() {
        return codequipo;
    }

    public void setCodequipo(BigInteger codequipo) {
        this.codequipo = codequipo;
    }

    @Basic
    @Column(name = "NOMBRE")
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "PRESIDENTE")
    private String presidente;

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    @Basic
    @Column(name = "AÑOFUNDACION")
    private BigInteger añofundacion;

    public BigInteger getAñofundacion() {
        return añofundacion;
    }

    public void setAñofundacion(BigInteger añofundacion) {
        this.añofundacion = añofundacion;
    }

    @Basic
    @Column(name = "ENTRENADOR")
    private String entrenador;

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    @Basic
    @Column(name = "ESTADIO")
    private String estadio;

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    @Basic
    @Column(name = "SITIOWEB")
    private String sitioweb;

    public String getSitioweb() {
        return sitioweb;
    }

    public void setSitioweb(String sitioweb) {
        this.sitioweb = sitioweb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipo equipo = (Equipo) o;
        return Objects.equals(codequipo, equipo.codequipo) && Objects.equals(nombre, equipo.nombre) && Objects.equals(presidente, equipo.presidente) && Objects.equals(añofundacion, equipo.añofundacion) && Objects.equals(entrenador, equipo.entrenador) && Objects.equals(estadio, equipo.estadio) && Objects.equals(sitioweb, equipo.sitioweb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codequipo, nombre, presidente, añofundacion, entrenador, estadio, sitioweb);
    }
}
