package builder;

import builder.domain.Contacto;
import builder.domain.Direccion;
import builder.domain.Telefono;

public class Main {
    public static void main(String[] args) {
        /*
        Sin el patron Builder, tendriamos que hacer algo como esto:
        Empleado empleado = new Empleado();
        Direccion direccion = new Direccion();
        empleado.setDireccion(direccion);
        NO ES OPTIMO
        */

        Empleado empleado = new Empleado.EmpleadoBuilder()
                .setEdad(27)
                .setNombre("Hector")
                .setGenero("Masculino")

                .setDireccion(new Direccion("Calle 123", "CDMX", "Mexico", "12345"))
                .setDireccion("Union 4554", "Santiago", "Chile", "111169")

                .setTelefono(new Telefono("987654321", "XD", "Oficina"))
                .setTelefono("123456789", "123", "Casa")

                .setContacto(new Contacto("Juan",
                        new Telefono("123456789", "123", "Casa"),
                        new Direccion("Calle 123", "CDMX", "Mexico", "12345")))
                .build();

        System.out.println("Empleado: " + empleado);
    }
}

/*
Patron de diseño creacional Builder

Nos permite construir objetos compleos paso a paso.
Permite producir distintos tipos y representaciones de un objeto empleando el mismo codigo de construcción.

Esencialmente util cuando tenemos un objeto que se relaciona con distintos objetos
y podemos crear cada uno de esos objetos con un solo codigo de construcción, que generara todos los objetos relacionados.

Mediante varios pasos, tendremos como resultado un objeto final que se compone de varios objetos.

PARA IMPLEMENTARLO, CON EMPLOYEBUILDER SE SETEAN CADA UNA DE LAS PROPIEDAS,
Y AL ULTIMO VA EL METODO BUILD, QUE TOMA TODOS LOS ATRIBUTOS DE LA CLASE EMPLOYEBUILDER,
 Y LOS ENGLOBA EN UN SOLO OBJETO DE LA CLASE EMPLEADO


 */
