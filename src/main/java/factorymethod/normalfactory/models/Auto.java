package factorymethod.normalfactory.models;

import factorymethod.normalfactory.Vehiculo;

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
