package observer.ejemplo2observer;

public class Guerrero extends Enemigo implements MyObserver {

    public Guerrero(String nombre) {
        super(nombre);
        setActivo(false);
    }

    @Override
    public void atacar() {
        System.out.println(getNombre() + " Atacando");
    }

    @Override
    public void activar() {
        setActivo(true);
        System.out.println(getNombre() + " Activado");
    }

    @Override
    public void update() {
        activar();
        atacar();
    }
}

