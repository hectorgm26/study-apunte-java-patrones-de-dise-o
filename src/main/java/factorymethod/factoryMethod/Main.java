package factorymethod.factoryMethod;

import factorymethod.factoryMethod.factory.AutoFactory;
import factorymethod.factoryMethod.factory.CamionFactory;

public class Main {
    public static void main(String[] args) {

        // AQUI, A DIFERENCIA DEL FACTORY NORMAL, NO SE CREAN LOS OBJETOS LLAMANDO A VEHICULOFACTORY, POR SER UNA CLASE ABSTRACTA
        // QUE NO SE PUEDE INSTANCIAR
        // SINO QUE SE CREAN DIRECTO DE UNA FACTORY PROPIA DEL OBJETO QUE SE DESEA CREAR
        Vehiculo auto = new AutoFactory().crearVehiculo();
        auto.encender();

        Vehiculo camion = new CamionFactory().crearVehiculo();
        camion.encender();

        Vehiculo motocicleta = new CamionFactory().crearVehiculo();
        motocicleta.encender();

        Vehiculo avion = new CamionFactory().crearVehiculo();
        avion.encender();

    }
}
