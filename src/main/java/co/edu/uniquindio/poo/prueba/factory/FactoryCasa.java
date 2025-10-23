package co.edu.uniquindio.poo.prueba.factory;

import co.edu.uniquindio.poo.prueba.model.Apartamento;
import co.edu.uniquindio.poo.prueba.model.Casa;
import co.edu.uniquindio.poo.prueba.model.Inmueble;

//Se implementa el patron FactoryMethod
public class FactoryCasa implements FactoyInmueble{
    @Override
    public Inmueble crearInmueble(String id, String tipo,String ciudad, String numHabitacion, String numPiso, double precio) {
        return new Casa.Builder()
                .id(id)
                .tipo(tipo)
                .ciudad(ciudad)
                .numHabitacion(numHabitacion)
                .numPiso(numPiso)
                .precio(precio)
                .build();
    }
}
