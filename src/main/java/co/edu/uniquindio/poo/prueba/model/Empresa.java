package co.edu.uniquindio.poo.prueba.model;

import java.util.ArrayList;

public class Empresa {

    //Se utiliza el patron Singleton

    private static Empresa instance;
    private String nit;
    private String nombre;
    private ArrayList<Inmueble> inmuebles = new ArrayList<>();


    private Empresa(){
//        listaVehiculos.add(new Auto("A01", "Toyota", "Corolla", 2020, 40000, 4, false));
//        listaVehiculos.add(new Moto("M01", "Suzuki", "GSX250R", 2020, 15000, "250", "Sport"));
//        listaVehiculos.add(new Camion("C01", "Mercedes", "Actros 2545", 2021, 45000, 25.5, 4));

    }

    public static Empresa getInstance() {
        if (instance == null) {
            instance = new Empresa();
        }
        return instance;
    }
}
