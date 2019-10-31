package Interfaz.Controlador;

import Negocios.*;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class Controller {
    private Electronicos electronicos;
    public TextField searchField;
    public TextField skuLabel;
    public TextField TituloLabel;
    public TextField AgeLabel;
    public TextField TipoMField;
    public TextField generoField;
    public TextField artistaField;
    public TextField tipoVField;
    public TextField clasificacionVField;
    public TextField artistasField;
    public TextField tipoVJField;
    public TextField clasificacionVJField;
    public TextField edicionField;

    public Controller(){
        this.electronicos = new Electronicos();
    }

    public void addMusic(ActionEvent actionEvent) {
        try{
            Electronica electronica = new Musica(artistaField.getText(), generoField.getText(), TipoMField.getText(), skuLabel.getText(), TituloLabel.getText(), Integer.parseInt(AgeLabel.getText()));
            this.electronicos.addLista(electronica);
        } catch (Exception ex){
            Alert alert = new Alert(Alert.AlertType.ERROR, ex.getMessage());
        }
        clean();
    }

    public void addVideo(ActionEvent actionEvent) {
        try{
            Electronica electronica = new Videos(artistasField.getText(), clasificacionVField.getText(), tipoVField.getText(), skuLabel.getText(), TituloLabel.getText(), Integer.parseInt(AgeLabel.getText()));
            this.electronicos.addLista(electronica);
        } catch (Exception ex){
            Alert alert = new Alert(Alert.AlertType.ERROR, ex.getMessage());
        }
        clean();
    }

    public void addVideojuego(ActionEvent actionEvent) {
        try{
            Electronica electronica = new Videojuegos(edicionField.getText(), clasificacionVJField.getText(), tipoVJField.getText(), skuLabel.getText(), TituloLabel.getText(), Integer.parseInt(AgeLabel.getText()));
            this.electronicos.addLista(electronica);
        } catch (Exception ex){
            Alert alert = new Alert(Alert.AlertType.ERROR, ex.getMessage());
        }
        clean();
    }

    public void delete(ActionEvent actionEvent) {
        try{
            this.electronicos.deleteLista(searchField.getText());
        } catch (Exception ex){
            Alert alert = new Alert(Alert.AlertType.ERROR, ex.getMessage());
        }
        clean();
    }

    public void edit(ActionEvent actionEvent) {
        try{
            this.electronicos.edit(skuLabel.getText(), TituloLabel.getText(), Integer.parseInt(AgeLabel.getText()), artistaField.getText(), generoField.getText(), TipoMField.getText(), artistasField.getText(), clasificacionVField.getText(), tipoVField.getText(), edicionField.getText(), clasificacionVJField.getText(), tipoVJField.getText());
        } catch (Exception ex){
            Alert alert = new Alert(Alert.AlertType.ERROR, ex.getMessage());
        }
        clean();
    }

    public void Mostrar(ActionEvent actionEvent) {
        clean();
        try{
            Electronica musica = new Musica();
            Electronica video = new Videos();
            Electronica videojuego = new Videojuegos();
            this.electronicos.returnElectronica(musica, video, videojuego, searchField.getText());

            if(this.electronicos.searchInstace(searchField.getText()) == 1){
                skuLabel.setText(musica.getSKU());
                TituloLabel.setText(musica.getTitulo());
                AgeLabel.setText(String.valueOf(musica.getAge()));
                artistaField.setText(((Musica) musica).getArtista());
                generoField.setText(((Musica) musica).getGenero());
                TipoMField.setText(((Musica) musica).getTipo());
            } else if (this.electronicos.searchInstace(searchField.getText()) == 2){
                skuLabel.setText(video.getSKU());
                TituloLabel.setText(video.getTitulo());
                AgeLabel.setText(String.valueOf(video.getAge()));
                artistasField.setText(((Videos) video).getArtistas());
                clasificacionVField.setText(((Videos) video).getClasificacion());
                tipoVField.setText(((Videos) video).getTipo());
            } else if (this.electronicos.searchInstace(searchField.getText()) == 3){
                skuLabel.setText(videojuego.getSKU());
                TituloLabel.setText(videojuego.getTitulo());
                AgeLabel.setText(String.valueOf(videojuego.getAge()));
                edicionField.setText(((Videojuegos) videojuego).getEdicion());
                clasificacionVJField.setText(((Videojuegos) videojuego).getClasificacion());
                tipoVJField.setText(((Videojuegos) videojuego).getTipo());
            }
        } catch (Exception ex){
            Alert alert = new Alert(Alert.AlertType.ERROR, ex.getMessage());
        }
    }

    public void clean(){
        skuLabel.setText("");
        TituloLabel.setText("");
        AgeLabel.setText("");
        artistaField.setText("");
        generoField.setText("");
        TipoMField.setText("");
        artistasField.setText("");
        clasificacionVField.setText("");
        tipoVField.setText("");
        edicionField.setText("");
        clasificacionVJField.setText("");
        tipoVJField.setText("");

    }
}
