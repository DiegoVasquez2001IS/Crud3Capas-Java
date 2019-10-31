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
public class Videos extends Electronica {

    private String Artistas;
    private String Clasificacion;
    private String Tipo;

    public Videos() {
    }

    public Videos(String Artistas, String Clasificacion, String Tipo, String SKU, String Titulo, Integer Age) {
        super(SKU, Titulo, Age);
        this.Artistas = Artistas;
        this.Clasificacion = Clasificacion;
        this.Tipo = Tipo;
    }

    public String getArtistas() {
        return Artistas;
    }

    public void setArtistas(String Artistas) {
        this.Artistas = Artistas;
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
        return super.toString() + "Videos: " + "Artistas=" + Artistas + ", Clasificacion=" + Clasificacion + ", Tipo=" + Tipo;
    }






}

