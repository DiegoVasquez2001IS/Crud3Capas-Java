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
public class Musica extends Electronica{

    private String Artista;
    private String Genero;
    private String Tipo;

    public Musica() {
    }

    public Musica(String Artista, String Genero, String Tipo, String SKU, String Titulo, Integer Age) {
        super(SKU, Titulo, Age);
        this.Artista = Artista;
        this.Genero = Genero;
        this.Tipo = Tipo;
    }


    public String getArtista() {
        return Artista;
    }

    public void setArtista(String Artista) {
        this.Artista = Artista;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "Musica: " + "Artista=" + Artista + ", Genero=" + Genero + ", Tipo=" + Tipo;
    }



}
