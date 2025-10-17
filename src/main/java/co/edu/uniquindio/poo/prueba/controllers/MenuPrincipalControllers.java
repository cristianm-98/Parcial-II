package co.edu.uniquindio.poo.prueba.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.prueba.app.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class MenuPrincipalControllers {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnFormulario;

    @FXML
    private Button btnListaProducto;

    @FXML
    private AnchorPane menuPrincipal;

    @FXML
    void onFormulario(ActionEvent event) {
//        try {
//            FXMLLoader loader = new FXMLLoader(App.class.getResource("/co/edu/uniquindio/poo/prueba/FormularioProducto.fxml"));
//            Parent formulario = loader.load();
//
//            // Obtener el controlador del formulario
//            FormularioProductoController controller = loader.getController();
//            controller.setDashboardController(this);
//
//            // Reemplazar el contenido del contenedor principal
//            menuPrincipal.getChildren().clear();
//            menuPrincipal.getChildren().add(formulario);
//
//        } catch (IOException e) {
//            mostrarAlerta("Error", "No se pudo cargar el formulario", Alert.AlertType.ERROR);
//            e.printStackTrace();
//        }

    }

    @FXML
    void onListaProducto(ActionEvent event) {

    }

    @FXML
    void initialize() {
    }
    public AnchorPane getMenuPrincipal(){
        return menuPrincipal;
    }

}
