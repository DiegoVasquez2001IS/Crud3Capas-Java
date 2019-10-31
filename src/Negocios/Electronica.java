package Negocios;


import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luisf
 */
public class Electronica implements Serializable {

    private final static long serialVersionUID = 1L;
    protected String SKU;
    protected String Titulo;
    protected Integer Age;

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer Age) {
        this.Age = Age;
    }

    @Override
    public String toString() {
        return "SKU=" + SKU + ", Titulo=" + Titulo + ", Age=" + Age;
    }

    public Electronica() {
    }

    public Electronica(String SKU, String Titulo, Integer Age) {
        this.SKU = SKU;
        this.Titulo = Titulo;
        this.Age = Age;
    }

}

