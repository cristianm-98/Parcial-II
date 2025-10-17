package co.edu.uniquindio.poo.prueba.model;

public class Casa extends Inmueble {

    private Casa(Builder builder) {
        super(builder.tipo,builder.ciudad, builder.numHabitacion, builder.numPiso, builder.precio);

    }

    public static class Builder {
        private String tipo;
        private String ciudad;
        private String numHabitacion;
        private String numPiso;
        private double precio;


        public Builder tipo(String tipo){
            this.tipo=tipo;
            return this;
        }

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

        public Casa build() {
            return new Casa(this);
        }
    }
}