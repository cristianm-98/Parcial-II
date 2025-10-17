package co.edu.uniquindio.poo.prueba.factory;

import co.edu.uniquindio.poo.prueba.model.Apartamento;
import co.edu.uniquindio.poo.prueba.model.Finca;
import co.edu.uniquindio.poo.prueba.model.Inmueble;

//Se implementa el patron FactoryMethod
public class FactoryFinca implements FactoyInmueble {
    @Override
    public Inmueble crearInmueble(String tipo,String ciudad, String numHabitacion, String numPiso, double precio) {
        return new Finca.Builder()
                .tipo(tipo)
                .ciudad(ciudad)
                .numHabitacion(numHabitacion)
                .numPiso(numPiso)
                .precio(precio)
                .build();
    }
}
