package singleton;

public class Main {
    public static void main(String[] args) {

        DatabaseConnector databaseConnector = DatabaseConnector.getInstance();

        System.out.println("databaseConnector = " + databaseConnector);

        DatabaseConnector databaseConnector2 = DatabaseConnector.getInstance();

        System.out.println("databaseConnector2 = " + databaseConnector2);
        // AQUI APUNTA AL MISMO OBJETO EN MEMORIA, YA QUE SE GARANTIZA QUE SIEMPRE QUE SE LLAME AL METODO getInstance, SE RETORNARA EL MISMO OBJETO CON LA VALIDACION QUE SE HIZO EN EL METODO

        System.out.println("\n");
        databaseConnector.connectDatabase();
        databaseConnector2.connectDatabase();

    }
}

/*
Patron creacional Singleton

Nos ayuda a la creacion de objetos, y permite asegurarnos de que una clase tenga una unica instancia
a la vez, que proporciona un punto de acceso global a dicha instancia, es decir, que en nuestra aplicacion
solo tendremos un solo objeto para toda la aplicacion, independiende de donde se encuentre, y no crearemos varios, tendremos uno global

Ejemplo = se quiere crear un objeto para la conexion a una base de datos, pero otra parte de la app quiere conectarse, y querria crear un nuevo objeto
pero no se puede, ya que se romperia el patron singleton, y se crearia un nuevo objeto, y no seria el mismo objeto que se creo al principio

POSIBLE PROBLEMA EN APLICACIONES MULTIHILOS
¿QUE PASA SI UNA APLICACION MULTIHILOS LLAMA AL METODO getInstance AL MISMO TIEMPO, ambos crearan objetos diferentes
y habran problemas de sincronizacion
para solucionar esto, se deben sincronizar los hilos, y se usa la palabra reservada synchronized en el metodo getInstance
ya que el objetivo es que la app maneje siempre un solo objeto, y no varios, teniendo una sola instancia sincronizada

 */
