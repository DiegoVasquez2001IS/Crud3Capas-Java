package Datos;

import Negocios.Electronica;

import java.io.*;
import java.util.LinkedList;

public class Datos {
    private String Archivo = "Datos.dat";

    public Datos(){

    }

    public Datos(String Archivo){
        this.Archivo = Archivo;
    }

    public LinkedList<Electronica> LeerDatos() throws Exception {
        try{
            File file = new File(this.Archivo);
            if (!file.exists()){
                throw new Exception("El archivo no existe");
            }
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            LinkedList<Electronica> linkedList = (LinkedList) ois.readObject();
            ois.close();
            return linkedList;
        } catch (Exception ex){
            throw new Exception(ex);
        }
    }

    public void Guardar(LinkedList<Electronica> linkedList) throws Exception {
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(this.Archivo)));
            oos.writeObject(linkedList);
            oos.close();
        } catch (Exception ex){
            throw new Exception(ex);
        }
    }
}
