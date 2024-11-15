package decorator.decorator;

import decorator.Enemigo;

public class MagoEnemigoDecorator extends EnemigoDecorator {

    public MagoEnemigoDecorator(Enemigo enemigo) {
        super(enemigo);
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println("ATAQUE DE MAGO");
    }
}
