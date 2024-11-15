package factorymethod.factoryMethod.models;

import factorymethod.factoryMethod.Vehiculo;

public class Avion implements Vehiculo {

    @Override
    public void encender() {
        System.out.println("--> Avión encendido");
    }

    @Override
    public void detener() {
        System.out.println("--> Avión detenido");
    }

    /*
    PROBLEMA CON ESTE METODO: CON EL SIGUIENTE CODIGO:
    Vehiculo avion = vehiculoFactory.crearVehiculo("avion");
    SI SE QUIERE LLAMAR AL METODO VOLAR, NO SE PODRA, YA QUE EL METODO NO ESTA EN LA INTERFAZ GENERAL VEHICULO
    SOLUCION: CREAR UNA INTERFAZ ESPECIFICA PARA CADA VEHICULO QUE CONTENGA LOS METODOS ESPECIFICOS DE CADA VEHICULO
     */
    public void volar() {
        System.out.println("--> Avión volando");
    }
}
/*
Recordar que cada clase, debe implementar la interfaz general Vehiculo
PERO IGUALMENTE PUEDEN TENER SUS METODOS PROPIOS QUE NO ESTEN EN LA INTERFAZ GENERAL
 */