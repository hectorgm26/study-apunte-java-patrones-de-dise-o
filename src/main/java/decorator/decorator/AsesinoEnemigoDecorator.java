package decorator.decorator;

import decorator.Enemigo;

public class AsesinoEnemigoDecorator extends EnemigoDecorator {

    public AsesinoEnemigoDecorator(Enemigo enemigo) {
        super(enemigo);
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println("ATAQUE DE ASESINO");
    }
}
