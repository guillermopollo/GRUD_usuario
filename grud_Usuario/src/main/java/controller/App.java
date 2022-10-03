package controller;

import CLASES.cliente;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.lang.ModuleLayer.Controller;
import java.lang.System.Logger;

import java.lang.System.Logger.Level;
import java.net.URL;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
     private ObservableList lista = FXCollections.observableArrayList();
 
  private Stage escenarioPrincipal;
    private BorderPane layoutPrincipal;
       private AnchorPane secondary , editarPersona;

    public ObservableList getlista(){
        return lista;
    }
    
    @Override
    public void start(Stage escenarioPrincipal)  {
     this.escenarioPrincipal = escenarioPrincipal;
        
        //Establezco el titulo
        this.escenarioPrincipal.setTitle("Libreta de Direcciones");
        
        //
        initLayoutPrincipal();
        
        //Muestra la vista persona
        muestraVistaPersona();
    }

    
    private void muestraVistaPersona() {
        
        FXMLLoader loader = new FXMLLoader();
        URL location = App.class.getResource("secondary.fxml");
        
        loader.setLocation(location);
        
        try {
         secondary = loader.load();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        layoutPrincipal.setCenter(secondary);
        
        //
        //
        SecondaryController controller = loader.getController();
        controller.setApp(this);
        
    }
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + "secondary.fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch(args);
    }
    private void initLayoutPrincipal() {
        
        //Cargar el layout principal
        FXMLLoader loader = new FXMLLoader();
        URL location = App.class.getResource("secondary.fxml");
        loader.setLocation(location);
        
        try {
            layoutPrincipal = loader.load();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    
        Scene escena = new Scene(layoutPrincipal);
        escenarioPrincipal.setScene(escena);
        escenarioPrincipal.show();
        
    }
     public boolean muestraEditarPersona(cliente cliente) {
        
        //Cargo la vista persona a partir de VistaPersona.fxml
        FXMLLoader loader = new FXMLLoader();
        URL location = App.class.getResource("secondary.fxml");
        loader.setLocation(location);
        try {
            secondary = loader.load();
        } catch (IOException ex) {
       
            return false;
        }
        
        //Creo el escenario de edición (con modal) y establezco la escena
        Stage escenarioEdicion = new Stage();
        escenarioEdicion.setTitle("Editar Cliente");
        //cuando le de a editar con el window modal no podras hacer nada en la ventana principal
        escenarioEdicion.initModality(Modality.WINDOW_MODAL);
        escenarioEdicion.initOwner(escenarioPrincipal);
        Scene escena = new Scene(editarPersona);
        escenarioEdicion.setScene(escena);
        
        //Asigno el escenario de edición y la persona seleccionada al controlador
        SecondaryController controller = loader.getController();
        controller.setEscenarioEdicion(escenarioEdicion);
        controller.setCliente(cliente);

        //Muestro el diálogo ahjsta que el ussuario lo cierre
        escenarioEdicion.showAndWait();
        
        //devuelvo el botón pulsado
        return controller.isGuardarClicked();
    
    }

}