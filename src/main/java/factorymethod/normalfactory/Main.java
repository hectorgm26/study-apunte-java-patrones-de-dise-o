package factorymethod.normalfactory;

import factorymethod.normalfactory.factory.VehiculoFactory;

public class Main {
    public static void main(String[] args) {

        // se instancia la clase VehiculoFactory para crear un vehiculo
        VehiculoFactory vehiculoFactory = new VehiculoFactory();

        // se crea un vehiculo de tipo auto, asignandolo a la variable auto, el resultado del metodo crearVehiculo de la clase VehiculoFactory
        // y se le pasa como parametro el nombre del tipo de vehiculo que se quiere crear, a traves del enum TypeOfVehicle
        Vehiculo auto = vehiculoFactory.crearVehiculo(TypeOfVehicle.AUTO.name());
        Vehiculo camion = vehiculoFactory.crearVehiculo(TypeOfVehicle.CAMION.name());
        Vehiculo motocicleta = vehiculoFactory.crearVehiculo(TypeOfVehicle.MOTOCICLETA.name());
        Vehiculo avion = vehiculoFactory.crearVehiculo(TypeOfVehicle.AVION.name());

        auto.encender(); // se llama al metodo encender de la insterfaz auto, que la implementaroon los modelos de vehiculos
        camion.encender();
        motocicleta.encender();
        avion.encender();
    }
}

/*
Patron de diseño Factory Method

ES UN PATRON CREACIONAL QUE PROPORCIONA UNA INTERFAZ PARA CREAR OBJETOS EN UNA SUPERCLASE, MIENTRAS PERMITE A LAS SUBCLASES ALTERAR
EL TIPO DE OBJETOS QUE SE CREARÁN

ES DECIR, NOSOTROS TENDREMOS UNA INTERFAZ COMUN GENERAL ENTRE VARIOS OBJETOS QUE LA IMPLEMENTARAN, PERO CADA UNO DE ELLOS PODRA CREAR
UN OBJETO DIFERENTE

EJEMPLO: UNA INTERFAZ LOGISTICA, Y CON DOS SUBCLASES (LOGISTICA MARITIMA Y LOGISTICA TERRESTRE), Y AMBAS SERIAN IMPLEMENTACIONES DE LOGISTICA
DEJANDOSE A LAS SUBCLASES LA OPCION DE ALTERAR EL COMPORTAMIENTO Y EL TIPO DE OBJETO PARA QUE SE ADAPTE AL TIPO DE ENVIO QUE SE REALIZARA

SE IMPLEMENTA CUANDO HAY DIFERENTES Y MUCHAS FORMAS DE IMPLEMENTAR ALGUNA ACCION O COSA

DOS FORMAS DE IMPLEMENTARLO
1) FACTORY NORMAL
2) FACTORY METHOD
 */
