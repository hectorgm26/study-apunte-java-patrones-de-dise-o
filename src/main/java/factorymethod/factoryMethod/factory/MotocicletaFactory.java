package factorymethod.factoryMethod.factory;

import factorymethod.factoryMethod.Vehiculo;
import factorymethod.factoryMethod.models.Motocicleta;

public class MotocicletaFactory extends VehiculoFactory {

    @Override
    public Vehiculo crearVehiculo() {
        return new Motocicleta();
    }
}
