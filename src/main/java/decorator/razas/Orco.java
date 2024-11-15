package decorator.razas;

import decorator.Enemigo;

public class Orco implements Enemigo {

    @Override
    public void atacar() {
        System.out.println("ATACA DE ORCO");
    }
}
