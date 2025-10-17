package co.edu.uniquindio.poo.prueba.model;

public class Local extends Inmueble{

    //Se implementa el patron Builder
    private Local(Builder builder) {
        super(builder.ciudad, builder.numHabitacion, builder.numPiso, builder.precio);

    }

    public static class Builder {
        private String ciudad;
        private String numHabitacion;
        private String numPiso;
        private double precio;

        public Builder ciudad(String ciudad) {
            this.ciudad = ciudad;
            return this;
        }

        public Builder numHabitacion(String numHabitacion) {
            this.numHabitacion = numHabitacion;
            return this;
        }

        public Builder numPiso(String numPiso) {
            this.numPiso = numPiso;
            return this;
        }

        public Builder precio(double precio) {
            this.precio = precio;
            return this;
        }

        public Local build() {
            return new Local(this);
        }
    }
}
