package Negocios;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luisf
 */
public class Videojuegos extends Electronica{

    private String Edicion;
    private String Clasificacion;
    private String Tipo;

    public Videojuegos() {
    }

    public Videojuegos(String Edicion, String Clasificacion, String Tipo, String SKU, String Titulo, Integer Age) {
        super(SKU, Titulo, Age);
        this.Edicion = Edicion;
        this.Clasificacion = Clasificacion;
        this.Tipo = Tipo;
    }

    public String getEdicion() {
        return Edicion;
    }

    public void setEdicion(String Edicion) {
        this.Edicion = Edicion;
    }

    public String getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(String Clasificacion) {
        this.Clasificacion = Clasificacion;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "Videojuegos: " + "Edicion=" + Edicion + ", Clasificacion=" + Clasificacion + ", Tipo=" + Tipo;
    }





}

