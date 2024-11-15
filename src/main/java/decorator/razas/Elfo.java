package decorator.razas;

import decorator.Enemigo;

public class Elfo implements Enemigo {

    @Override
    public void atacar() {
        System.out.println("ATACA DE ELFO");
    }
}
