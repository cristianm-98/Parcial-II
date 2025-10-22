package co.edu.uniquindio.poo.prueba.singleton;

import co.edu.uniquindio.poo.prueba.model.Apartamento;
import co.edu.uniquindio.poo.prueba.model.Inmueble;

import java.util.ArrayList;

public class Empresa {

    //Se utiliza el patron Singleton

    private static Empresa instance;
    private ArrayList<Inmueble>inmuebles;


    private Empresa(){
        inmuebles=new ArrayList<>();
        cargarDatos();
    }

    public static Empresa getInstance() {
        if (instance == null) {
            instance = new Empresa();
        }
        return instance;
    }

    private void cargarDatos(){
        inmuebles.add(new Inmueble("001","Apartamento","Pereira","5","2",2500));
        inmuebles.add(new Apartamento.Builder()
                .id("001").tipo("Apartamento")
                .ciudad("Armenia")
                .numHabitacion("4")
                .numPiso("1")
                .precio(2500)
                .build());
    }

    public ArrayList<Inmueble> getInmuebles() {
        return inmuebles;
    }

    public void setInmuebles(ArrayList<Inmueble> inmuebles) {
        this.inmuebles = inmuebles;
    }

    public void agregarInmueble(Inmueble inmueble){
        inmuebles.add(inmueble);
    }

    public boolean eliminarInmueble(Inmueble inmueble){
        return inmuebles.remove(inmueble);
    }

}
