package builder;

import builder.domain.Contacto;
import builder.domain.Direccion;
import builder.domain.Telefono;

import java.util.ArrayList;
import java.util.List;

// El patron builder se puede implementar en cualquier clase que tenga muchos atributos y que se relacione con otras clases
// 1. Debajo de los constructores se crea un metodo publico estatico que retorna un objeto clase interna de la clase EmpleadoBuilder
// 2 Se implementa la interfaz IBuilder
// 3. Copiamos y pegamos TAL CUAL todos los atributos de la clase en la clase EmpleadoBuilder
// 4. Se crea un constructor vacio de la clase EmpleadoBuilder
// 5. Se crean los metodos set de cada atributo de la clase Empleado
// 6. Se moodifica el metodo build para que retorne un objeto de la clase Empleado, enviandole todos los atributos de la clase EmpleadoBuilder
public class Empleado {

    private int edad;
    private String nombre;
    private String genero;
    private Direccion direccion;
    private List<Telefono> telefonos = new ArrayList<>(); // el empleado puede tener uno o varios telefonos
    private List<Contacto> contactos = new ArrayList<>();  // el empleado puede tener uno o mas contactos

    public Empleado() {
    }

    public Empleado(int edad, String nombre, String genero, Direccion direccion, List<Telefono> telefonos, List<Contacto> contactos) {
        this.edad = edad;
        this.nombre = nombre;
        this.genero = genero;
        this.direccion = direccion;
        this.telefonos = telefonos;
        this.contactos = contactos;
    }

    // Con esta clase interna estatica o constructor de empleado, crearemos todos los atributos de la clase Empleado
    // generando todos los objeots, juntandolos en uno solo
    public static class EmpleadoBuilder implements IBuilder {

        private int edad;
        private String nombre;
        private String genero;
        private Direccion direccion;
        private List<Telefono> telefonos = new ArrayList<>();
        private List<Contacto> contactos = new ArrayList<>();

        public EmpleadoBuilder() {
        }

        // se retorna un objeto de la clase interna EmpleadoBuilder
        // Se crea el metodo para setear el atributo con el que se le manda como parametro
        // por ultimo se retorna el objeto de la clase interna EmpleadoBuilder con this
        // CON ESTO SE DA LA LIBERTAD DE SETEAR LOS ATRIBUTOS QUE SE DESEEN, O CREAR OBJETOS SIN SETEAR NINGUN ATRIBUTO
        public EmpleadoBuilder setEdad(int edad) {
            this.edad = edad;
            return this;
        }

        public EmpleadoBuilder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public EmpleadoBuilder setGenero(String genero) {
            this.genero = genero;
            return this;
        }

        // HAY DOS FORMAS DE SETEAR UN OBJETO DE UNA CLASE
        // FORMA 1 = SE LE MANDA UN OBJETO DE LA CLASE
        public EmpleadoBuilder setDireccion(Direccion direccion) {
            this.direccion = direccion;
            return this;
        }

        // FORMA 2 = SE LE MANDAN LOS PARAMETROS DE LA CLASE y ASI EL OBJETO SE CREA DENTRO DEL METODO
        public EmpleadoBuilder setDireccion(String direccion, String ciudad, String pais, String codigoPostal) {
            this.direccion = new Direccion(direccion, ciudad, pais, codigoPostal);
            return this;
        }

        public EmpleadoBuilder setTelefono(Telefono telefono) {
            this.telefonos.add(telefono);
            return this;
        }

        public EmpleadoBuilder setTelefono(String numeroTelefono, String extension, String tipoTelefono) {
            this.telefonos.add(new Telefono(numeroTelefono, extension, tipoTelefono));
            return this;
        }

        public EmpleadoBuilder setContacto(Contacto contacto) {
            this.contactos.add(contacto);
            return this;
        }

        public EmpleadoBuilder setContacto(String nombre, Telefono telefono, Direccion direccion) {
            this.contactos.add(new Contacto(nombre, telefono, direccion));
            return this;
        }

        @Override
        public Empleado build() {
            return new Empleado(edad, nombre, genero, direccion, telefonos, contactos);
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public List<Telefono> getTelefono() {
        return telefonos;
    }

    public void setTelefono(List<Telefono> telefono) {
        this.telefonos = telefono;
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "\n, edad=" + edad +
                "\n, nombre='" + nombre + '\'' +
                "\n, genero='" + genero + '\'' +
                "\n, direccion=" + direccion +
                "\n, telefono=" + telefonos +
                "\n, contactos=" + contactos +
                "}";
    }
}
