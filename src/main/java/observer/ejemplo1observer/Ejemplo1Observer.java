package observer.ejemplo1observer;

public class Ejemplo1Observer implements Observer {

    @Override
    public void update() {
        System.out.println("Se ha llamado a ejemplo 1");
    }
}

// EJEMPLO PRACTICO = DAR AVISO POR CAMBIO EN BASE DE DATOS