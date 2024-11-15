package decorator.razas;

import decorator.Enemigo;

public class Humano implements Enemigo {

    @Override
    public void atacar() {
        System.out.println("ATACA DE HUMANO");
    }
}
