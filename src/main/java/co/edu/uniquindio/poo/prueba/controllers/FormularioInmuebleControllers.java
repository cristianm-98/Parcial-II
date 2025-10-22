package co.edu.uniquindio.poo.prueba.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.prueba.singleton.Empresa;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

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
    private ComboBox<String> cbTipoInmueble;

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

    private Empresa empresa;
    private MenuPrincipalControllers menuPrincipalControllers;
    private AnchorPane menuPrincipal;
    private Pane menuSecundario;


    @FXML
    void onAgregar(ActionEvent event) {

    }

    @FXML
    void onRegresar(ActionEvent event) {

    }

    @FXML
    void initialize() {
        empresa = Empresa.getInstance();
        cbTipoInmueble.getItems().addAll("Apartamento","Casa","Finca","Local");
    }

    public void setMenuPrincipalControllers(MenuPrincipalControllers menuPrincipalControllers) {
        this.menuPrincipalControllers = menuPrincipalControllers;
        this.menuSecundario = menuPrincipalControllers.getMenuPrincipal();
    }

}