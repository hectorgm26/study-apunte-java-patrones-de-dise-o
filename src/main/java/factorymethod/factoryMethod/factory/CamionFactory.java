package factorymethod.factoryMethod.factory;

import factorymethod.factoryMethod.Vehiculo;
import factorymethod.factoryMethod.models.Camion;

public class CamionFactory extends VehiculoFactory {

    @Override
    public Vehiculo crearVehiculo() {
        return new Camion();
    }
}
