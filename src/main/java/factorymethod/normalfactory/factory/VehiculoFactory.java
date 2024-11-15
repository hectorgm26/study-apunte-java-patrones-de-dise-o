package factorymethod.normalfactory.factory;

import factorymethod.normalfactory.Vehiculo;
import factorymethod.normalfactory.models.Auto;
import factorymethod.normalfactory.models.Avion;
import factorymethod.normalfactory.models.Camion;
import factorymethod.normalfactory.models.Motocicleta;

public class VehiculoFactory {

    // ESTE METODO DEVOLVERA UN OBJETO DE TIPO VEHICULO, QUE ES LA INTERFAZ
    // ES DECIR, SE PODRA DEVOLVER CUALQUIER CLASE QUE IMPLEMENTE LA INTERFAZ VEHICULO
    // SE COLOCA COMO PARAMETROS STRING y typeOfVehiculo PARA QUE SE PUEDA CREAR CUALQUIER TIPO DE VEHICULO
    // ESTO FUNCIONA COMO UN SWITCH CASE, DONDE SE PUEDE CREAR CUALQUIER TIPO DE VEHICULO, el typeOfVehiculo lo que hace, es que se le pasa un string con el nombre del vehiculo que se quiere crear
    public Vehiculo crearVehiculo(String typeOfVehiculo) {

        if (typeOfVehiculo.equalsIgnoreCase("Auto")) {
            return new Auto();
        } else if (typeOfVehiculo.equalsIgnoreCase("Motocicleta")) {
            return new Motocicleta();
        } else if (typeOfVehiculo.equalsIgnoreCase("Avion")) {
            return new Avion();
        } else if (typeOfVehiculo.equalsIgnoreCase("Camion")) {
            return new Camion();
        } else {
            return null;
        }
    }


}
