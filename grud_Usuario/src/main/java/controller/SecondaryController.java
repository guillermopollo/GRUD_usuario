package controller;

import CLASES.cliente;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Pattern;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
public class SecondaryController  {

    @FXML
       private TextField usuario;
    @FXML
    private TextField  contraseña;
    @FXML
    private TextField  descueento;
     private App app;
    
        private Stage escenarioEdicion; //Escenario de edición
    private cliente cliente; // Referencia a la clase cliente
    private boolean guardarClicked = false;
    
      public void setApp(App app) {
        
        this.app = app;
    }
    
    @FXML
    private void initialize() {
    }
       public void setEscenarioEdicion(Stage escenarioEdicion) {
        this.escenarioEdicion = escenarioEdicion;
    }
       public void setCliente(cliente  cliente) {
        this.cliente = cliente ;

        usuario.setText(cliente.getCorreo_electronico());
        contraseña.setText(cliente.getPass());
    

        
    }
           @FXML
    private void cancelar() {
        escenarioEdicion.close();
    }
          @FXML
    private void guardar() {
        
//        if (datosValidos()) {
            
            //Asigno datos a propiedades de persona
     cliente.setCorreo_electronico(usuario.getText());
     cliente.setPass(contraseña.getText());
    cliente.setDescuentos(descueento.getTranslateX());

            guardarClicked = true; //Cambio valor booleano
            escenarioEdicion.close(); //Cierro el escenario de edición
            
//        }
    }
     public boolean isGuardarClicked() {
        return guardarClicked;
    }
    private boolean datosValidos(){
      String correo = "^[A-Za-z0-9+_.-]+@(.+)$";
        //Inicializo string para mensajes
        String mensajeError = "";

        //Compruebo los campos
        if (usuario.getText() != correo) {
            mensajeError += "usuario no válido.\n"; 
        }
        if (contraseña.getText() == null || contraseña.getText().length() == 0) {
            mensajeError += "contraseña no valida .\n"; 
        }
       

   

       

        //Si no hay errores devuelvo true, si no, una alerta con los errores y false
        if (mensajeError.length() == 0) {
            return true;
        } else {
            //Muestro alerta y devuelvo false
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error");
            alerta.setHeaderText("Datos no válidos");
            alerta.setContentText("Por favor, corrige los errores");
            alerta.showAndWait();
            return false;
        }
        
    }


}