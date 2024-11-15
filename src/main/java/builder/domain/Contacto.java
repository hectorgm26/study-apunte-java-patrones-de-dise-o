package builder.domain;

public class Contacto {

    private String nombre;
    private Telefono telefono; // la clase contacto tendra como atributo un telefono, que sera un objeto de la clase Telefono
    private Direccion direccion; // la clase contacto tendra como atributo una direccion, que sera un objeto de la clase Direccion

    public Contacto() {
    }

    public Contacto(String nombre, Telefono telefono, Direccion direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                ", direccion=" + direccion +
                '}';
    }
}
