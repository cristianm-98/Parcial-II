package co.edu.uniquindio.poo.prueba.factory;

import co.edu.uniquindio.poo.prueba.model.Apartamento;
import co.edu.uniquindio.poo.prueba.model.Inmueble;

//Se implementa el patron FactoryMethod
public class FactoryApartamento implements FactoyInmueble{
    @Override
    public Inmueble crearInmueble(String ciudad, String numHabitacion, String numPiso, double precio) {
        return new Apartamento.Builder()
                .ciudad(ciudad)
                .numHabitacion(numHabitacion)
                .numPiso(numPiso)
                .precio(precio)
                .build();
    }
}
