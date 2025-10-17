package co.edu.uniquindio.poo.prueba.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FormularioInmuebleControllers {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnRegresar;

    @FXML
    private TextField txtCiudad;

    @FXML
    private TextField txtHabitacion;

    @FXML
    private TextField txtPiso;

    @FXML
    private TextField txtPrecio;

    @FXML
    private TextField txtTipo;

    @FXML
    void onAgregar(ActionEvent event) {

    }

    @FXML
    void onRegresar(ActionEvent event) {

    }

    @FXML
    void initialize() {


    }
    public void setMenuPrincipalControllers(MenuPrincipalControllers dashboardController) {
        this.setMenuPrincipalControllers(); = dashboardController;
        this.setMenuPrincipalControllers(); = dashboardController.getMenuPrincipal();
    }

}
