package factorymethod.factoryMethod.factory;

import factorymethod.factoryMethod.Vehiculo;
import factorymethod.factoryMethod.models.Auto;

public class AutoFactory extends VehiculoFactory {

    @Override
    public Vehiculo crearVehiculo() {
        return new Auto();
    }
}
