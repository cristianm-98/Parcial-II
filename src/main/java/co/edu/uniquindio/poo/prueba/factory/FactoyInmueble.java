package co.edu.uniquindio.poo.prueba.factory;

import co.edu.uniquindio.poo.prueba.model.Inmueble;

//Se implementa el patron FactoryMethod
public interface FactoyInmueble {
    Inmueble crearInmueble(String id,String tipo,String ciudad, String numHabitacion, String numPiso, double precio);

}
