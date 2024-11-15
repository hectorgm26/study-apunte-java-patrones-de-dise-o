package factorymethod.factoryMethod.models;

import factorymethod.factoryMethod.Vehiculo;

public class Auto implements Vehiculo {

    @Override
    public void encender() {
        System.out.println("--> Auto encendido");
    }

    @Override
    public void detener() {
        System.out.println("--> Auto detenido");
    }
}
