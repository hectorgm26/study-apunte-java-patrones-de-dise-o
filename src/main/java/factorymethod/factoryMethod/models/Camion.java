package factorymethod.factoryMethod.models;

import factorymethod.factoryMethod.Vehiculo;

public class Camion implements Vehiculo {

    @Override
    public void encender() {
        System.out.println("--> Camión encendido");
    }

    @Override
    public void detener() {
        System.out.println("--> Camión detenido");
    }
}
