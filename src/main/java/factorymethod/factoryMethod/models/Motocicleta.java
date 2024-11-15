package factorymethod.factoryMethod.models;

import factorymethod.factoryMethod.Vehiculo;

public class Motocicleta implements Vehiculo {

    @Override
    public void encender() {
        System.out.println("--> Motocicleta encendida");
    }

    @Override
    public void detener() {
        System.out.println("--> Motocicleta detenida");
    }
}
