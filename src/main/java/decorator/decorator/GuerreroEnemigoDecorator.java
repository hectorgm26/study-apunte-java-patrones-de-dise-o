package decorator.decorator;

import decorator.Enemigo;

public class GuerreroEnemigoDecorator extends EnemigoDecorator {

    public GuerreroEnemigoDecorator(Enemigo enemigo) {
        super(enemigo);
    }

    @Override
    public void atacar() {
        super.atacar(); // VA A ATACAR EL ENEMIGO QUE LLEVA DENTRO Y EL MISMO DECORADOR
        System.out.println("ATAQUE DE GUERRERO");
    }
}

/*
ESTA CLASE ES UN DECORADOR CONCRETO, ES DECIR, UNA CLASE QUE EXTIENDE DE LA CLASE ABSTRACTA EnemigoDecorator
 Y QUE IMPLEMENTA EL METODO atacar() DE LA INTERFAZ Enemigo.
 EN ESTE CASO, ESTA CLASE REPRESENTA UN DECORADOR QUE AGREGA UN ATAQUE DE GUERRERO A UN ENEMIGO.
 POR EJEMPLO, SI UN ENEMIGO TIENE UN ATAQUE DE MAGO Y SE LE APLICA ESTE DECORADOR,
 EL ENEMIGO PASARA A TENER UN ATAQUE DE MAGO Y UN ATAQUE DE GUERRERO.


 */