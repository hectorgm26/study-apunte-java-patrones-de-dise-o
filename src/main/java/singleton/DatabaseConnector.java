package singleton;

/*
Reglas para implementar el patron singleton
1. Debemos tener un constructor privado, ya que debemos restringir la creacion de objetos
2. Debemos tener un atributo privado estatico del tipo de la clase
3. Debemos tener un metodo publico estatico que devuelva la instancia que va a devolver el objeto
PLUS: si la aplicacion es multi-hilos, se debe sincronizar el metodo getInstance con la palabra reservada synchronized
 */

public class DatabaseConnector {

    // es comun que aparezca el nombre como instance, ya que ahi se guardara el unico objeto que se creara
    private static DatabaseConnector databaseConnector;

    private DatabaseConnector() {
        System.out.println("Creando el objeto DatabaseConnector");
    }

    // el metodo es publico y estatico, ya que se necesita acceder de cualquier parte de la aplicacion, y es estatico porque no se necesita crear un objeto para acceder a el
    public static synchronized DatabaseConnector getInstance() { // por convencion se coloca getInstance
        if (databaseConnector == null) { // si el objeto todavia no ha sido creado
            databaseConnector = new DatabaseConnector(); // podemos usar el constructor aqui, porque se determino como privado, es decir solo esta disponible dentro de la clase
        }
        return databaseConnector; // se retorna el objeto creado
    }
    // y si por alguna razon se vuelve a llamar al metodo getInstance, no se volvera a crear un objeto, ya que se comprobara que ya existe uno creado, y retornara la instancia del objeto creado

    public void connectDatabase() {
        System.out.println("Conectando base de datos " + databaseConnector);
    }

    public void disconnectDatabase() {
        System.out.println("Desconectando la base de datos " + databaseConnector);
    }
}
