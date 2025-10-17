package co.edu.uniquindio.poo.prueba.model;

import javafx.util.Builder;

public class Inmueble {

    private String ciudad;
    private String numHabitacion;
    private String numPiso;
    private double precio;

    public Inmueble(String ciudad,String numHabitacion,String numPiso, double precio){
        this.ciudad=ciudad;
        this.numHabitacion=numHabitacion;
        this.numPiso=numPiso;
        this.precio=precio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(String numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public String getNumPiso() {
        return numPiso;
    }

    public void setNumPiso(String numPiso) {
        this.numPiso = numPiso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
