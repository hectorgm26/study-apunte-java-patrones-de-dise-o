package factorymethod.factoryMethod.factory;

import factorymethod.factoryMethod.Vehiculo;
import factorymethod.factoryMethod.models.Avion;

public class AvionFactory extends VehiculoFactory {

    @Override
    public Vehiculo crearVehiculo() {
        return new Avion();
    }
}
