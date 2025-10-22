package co.edu.uniquindio.poo.prueba.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.prueba.model.Inmueble;
import co.edu.uniquindio.poo.prueba.singleton.Empresa;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class ListaApartamentosControllers {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnEliminar;

    @FXML
    private Button btnRegresar;

    @FXML
    private TableColumn<Inmueble, String> colCiudad;

    @FXML
    private TableColumn<Inmueble, String> colHabitacion;

    @FXML
    private TableColumn<Inmueble, String> colId;

    @FXML
    private TableColumn<Inmueble, String> colPiso;

    @FXML
    private TableColumn<Inmueble, Double> colPrecio;

    @FXML
    private TableColumn<Inmueble, String> colTipo;

    @FXML
    private TableView<Inmueble> tbListaInmuebles;

    private Empresa empresa;
    private MenuPrincipalControllers menuPrincipalControllers;
    private AnchorPane menuPrincipal;
    private Pane menuSecundario;
    private ObservableList<Inmueble>listaInmubles;

    @FXML
    void onEliminar(ActionEvent event) {

    }

    @FXML
    void onRegresar(ActionEvent event) {

    }

    @FXML
    void initialize() {
        empresa = Empresa.getInstance();

        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colTipo.setCellValueFactory(new PropertyValueFactory<>("tipo"));
        colCiudad.setCellValueFactory(new PropertyValueFactory<>("ciudad"));
        colHabitacion.setCellValueFactory(new PropertyValueFactory<>("numHabitacion"));
        colPiso.setCellValueFactory(new PropertyValueFactory<>("numPiso"));
        colPrecio.setCellValueFactory(new PropertyValueFactory<>("precio"));

        cargarInmueble();
    }

    public void cargarInmueble(){
        listaInmubles= FXCollections.observableArrayList(empresa.getInmuebles());
        tbListaInmuebles.setItems(listaInmubles);
    }


    public void setMenuPrincipalControllers(MenuPrincipalControllers menuPrincipalControllers) {
        this.menuPrincipalControllers = menuPrincipalControllers;
        this.menuSecundario = menuPrincipalControllers.getMenuPrincipal();
    }

}
