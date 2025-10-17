package co.edu.uniquindio.poo.prueba.facade;

import co.edu.uniquindio.poo.prueba.factory.*;
import co.edu.uniquindio.poo.prueba.model.Inmueble;

//Se implementa el patron Facade

public class InmuebleFacade {
    private FactoyInmueble factoyApartamento;
    private FactoyInmueble factoryCasa;
    private FactoyInmueble factoryFinca;
    private FactoyInmueble factoryLocal;

    public InmuebleFacade() {
        this.factoyApartamento = new FactoryApartamento();
        this.factoryCasa = new FactoryCasa();
        this.factoryFinca = new FactoryFinca();
        this.factoryLocal = new FactoryLocal();
    }
    public Inmueble crearApartamento(String tipo,String ciudad, String numHabitacion, String numPiso, double precio) {
        return factoyApartamento.crearInmueble(tipo,ciudad,numHabitacion, numPiso, precio);
    }
    public Inmueble crearCasa(String tipo,String ciudad, String numHabitacion, String numPiso, double precio) {
        return factoryCasa.crearInmueble(tipo,ciudad,numHabitacion, numPiso, precio);
    }
    public Inmueble crearFinca(String tipo,String ciudad, String numHabitacion, String numPiso, double precio) {
        return factoryFinca.crearInmueble(tipo,ciudad,numHabitacion, numPiso, precio);
    }
    public Inmueble crearLocal(String tipo,String ciudad, String numHabitacion, String numPiso, double precio) {
        return factoryLocal .crearInmueble(tipo,ciudad,numHabitacion, numPiso, precio);
    }

}
