package observer.ejemplo2observer;

public abstract class Enemigo {

    private String nombre;
    private boolean activo;

    public Enemigo(String nombre) {
        this.nombre = nombre;
    }

    public abstract void atacar();

    public abstract void activar();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}

/*
ESTA CLASE DEBE SER ABSTRACTA YA QUE NO SE DEBE CREAR UN ENEMIGO DIRECTAMENTE,
SINO QUE SE DEBE CREAR UNA CLASE HIJA QUE HEREDA DE ESTA CLASE
ES DECIR, LA CLASE HIJA DEBE IMPLEMENTAR LOS METODOS ABSTRACTOS DE ESTA CLASE
 */
