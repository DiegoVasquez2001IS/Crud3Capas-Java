package Negocios;

import Datos.Datos;
import Interfaz.Controlador.Controller;
import javafx.scene.control.Alert;

import java.util.LinkedList;

public class Electronicos {

    LinkedList<Electronica> linkedList = null;
    Datos datos;

    public Electronicos(){
        try {
            datos = new Datos();
            this.linkedList = datos.LeerDatos();

        } catch (Exception ex){
            this.linkedList = new LinkedList<>();
        }
    }

    public void Guardar(){
        try {
            datos.Guardar(this.linkedList);
        } catch (Exception ex){
            System.out.println(ex);
        }
    }

    public Electronica returnElectronica(Electronica musica, Electronica video, Electronica videojuego, String SKU){
        for (int i = 0; i < this.linkedList.size(); i++){
            if(this.linkedList.get(i).getSKU().equals(SKU)){
                if(this.linkedList.get(i) instanceof Musica){
                    musica.setSKU(SKU);
                    musica.setTitulo(this.linkedList.get(i).getTitulo());
                    musica.setAge(this.linkedList.get(i).getAge());
                    ((Musica) musica).setArtista(((Musica) this.linkedList.get(i)).getArtista());
                    ((Musica) musica).setGenero(((Musica) this.linkedList.get(i)).getGenero());
                    ((Musica) musica).setTipo(((Musica) this.linkedList.get(i)).getTipo());
                    //musica = new Musica(((Musica) this.linkedList.get(i)).getArtista(), ((Musica) this.linkedList.get(i)).getGenero(), ((Musica) this.linkedList.get(i)).getTipo(), SKU, this.linkedList.get(i).getTitulo(), this.linkedList.get(i).getAge());
                    return musica;
                } else if (this.linkedList.get(i) instanceof Videos){
                    video.setSKU(SKU);
                    video.setTitulo(this.linkedList.get(i).getTitulo());
                    video.setAge(this.linkedList.get(i).getAge());
                    ((Videos) video).setArtistas(((Videos) this.linkedList.get(i)).getArtistas());
                    ((Videos) video).setClasificacion(((Videos) this.linkedList.get(i)).getClasificacion());
                    ((Videos) video).setTipo(((Videos) this.linkedList.get(i)).getTipo());
                    return video;
                } else if (this.linkedList.get(i) instanceof Videojuegos){
                    videojuego.setSKU(SKU);
                    videojuego.setTitulo(this.linkedList.get(i).getTitulo());
                    videojuego.setAge(this.linkedList.get(i).getAge());
                    ((Videojuegos) videojuego).setEdicion(((Videojuegos) this.linkedList.get(i)).getEdicion());
                    ((Videojuegos) videojuego).setClasificacion(((Videojuegos) this.linkedList.get(i)).getClasificacion());
                    ((Videojuegos) videojuego).setTipo(((Videojuegos) this.linkedList.get(i)).getTipo());
                    //videojuego = new Videojuegos(((Videojuegos) this.linkedList.get(i)).getEdicion(), ((Videojuegos) this.linkedList.get(i)).getClasificacion(), ((Videojuegos) this.linkedList.get(i)).getTipo(), SKU, this.linkedList.get(i).getTitulo(), this.linkedList.get(i).getAge());
                    return videojuego;
                }
            }
        }
        return null;
    }

    public int searchInstace(String SKU){
        for (int i = 0; i < this.linkedList.size(); i++){
            if (this.linkedList.get(i).getSKU().equals(SKU)){
                if (this.linkedList.get(i) instanceof Musica){
                    return 1;
                } else if (this.linkedList.get(i) instanceof Videos){
                    return 2;
                }
            }
        }
        return 3;
    }

    public void addLista(Electronica electronica){
        //LeerDatos();
        if(existStatus(electronica) == true){
            this.linkedList.add(electronica);
            for(Electronica element: linkedList){
                System.out.println(element);
            }
            Guardar();
        } else {
            System.out.println("Ya existe");
            Alert alert = new Alert(Alert.AlertType.WARNING, "Ya existe el SKU");
            alert.show();
        }
    }

    public void deleteLista(String SKU){
        for (int i = 0; i < this.linkedList.size(); i++){
            if(this.linkedList.get(i).getSKU().equals(SKU)){
                this.linkedList.remove(i);
            }
        }
        for(Electronica element: linkedList){
            System.out.println(element);
        }
        Guardar();
    }

    public boolean existStatus(Electronica electronica){
        for(int i = 0; i < this.linkedList.size(); i++){
            if (this.linkedList.get(i).getSKU().equals(electronica.getSKU())){
                return false;
            }
        }
        return true;
    }

    public void edit(String SKU, String Titulo, Integer Age, String Artista, String Genero, String TipoM, String Artistas, String ClasificacionV, String TipoV, String Edicion, String ClasificacionVJ, String TipoVJ){
        for (int i = 0; i < this.linkedList.size(); i++){
            if(this.linkedList.get(i).getSKU().equals(SKU)){
                this.linkedList.get(i).setTitulo(Titulo);
                this.linkedList.get(i).setAge(Age);
                if(this.linkedList.get(i) instanceof Musica){
                    ((Musica) this.linkedList.get(i)).setArtista(Artista);
                    ((Musica) this.linkedList.get(i)).setGenero(Genero);
                    ((Musica) this.linkedList.get(i)).setTipo(TipoM);
                } else if (this.linkedList.get(i) instanceof Videos){
                    ((Videos) this.linkedList.get(i)).setArtistas(Artistas);
                    ((Videos) this.linkedList.get(i)).setClasificacion(ClasificacionV);
                    ((Videos) this.linkedList.get(i)).setTipo(TipoV);
                } else if (this.linkedList.get(i) instanceof Videojuegos){
                    ((Videojuegos) this.linkedList.get(i)).setEdicion(Edicion);
                    ((Videojuegos) this.linkedList.get(i)).setClasificacion(ClasificacionVJ);
                    ((Videojuegos) this.linkedList.get(i)).setTipo(TipoVJ);
                }
            }
        }
        for(Electronica element: linkedList){
            System.out.println(element);
        }
        Guardar();
    }
}
