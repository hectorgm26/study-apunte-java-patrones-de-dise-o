package factorymethod.factoryMethod.factory;

import factorymethod.factoryMethod.Vehiculo;

// el abstract dice que esta clase si o si sera heredada, es decir deberan existir clases hijas que hereden de esta padre
public abstract class VehiculoFactory {

    public abstract Vehiculo crearVehiculo();

}

/*
ESTA CLASE ES UNA FACTORIA DE VEHICULOS, PERO ESTA HARA QUE TENGAMOS OTRAS CLASES FACTORIAS ESPECIFICAS PARA CADA TIPO DE VEHICULO Y OBJETO ESPECIFICO

 */