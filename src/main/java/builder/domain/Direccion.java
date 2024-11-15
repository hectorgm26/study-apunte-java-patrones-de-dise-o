package builder.domain;

// 1. Crear un constructor vacio
// 2. Crear un constructor con todos los parametros
// 3. Crear los metodos getters y setters
// 4. Crear el metodo toString

public class Direccion {

    private String direccion;
    private String ciudad;
    private String pais;
    private String codigoPostal;

    public Direccion() {
    }

    public Direccion(String direccion, String ciudad, String pais, String codigoPostal) {
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.pais = pais;
        this.codigoPostal = codigoPostal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "direccion='" + direccion + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", pais='" + pais + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                '}';
    }
}
