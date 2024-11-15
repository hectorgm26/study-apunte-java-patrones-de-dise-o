package builder.domain;

public class Telefono {

    private String numeroTelefono;
    private String extension;
    private String tipoTelefono;

    public Telefono() {
    }

    public Telefono(String numeroTelefono, String extension, String tipoTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.extension = extension;
        this.tipoTelefono = tipoTelefono;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getTipoTelefono() {
        return tipoTelefono;
    }

    public void setTipoTelefono(String tipoTelefono) {
        this.tipoTelefono = tipoTelefono;
    }

    @Override
    public String toString() {
        return "Telefono{" +
                "numeroTelefono='" + numeroTelefono + '\'' +
                ", extension='" + extension + '\'' +
                ", tipoTelefono='" + tipoTelefono + '\'' +
                '}';
    }
}
