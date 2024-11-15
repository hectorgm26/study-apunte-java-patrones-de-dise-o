package decorator.decorator;

import decorator.Enemigo;

public abstract class EnemigoDecorator implements Enemigo {

    // el atributo sera la clase de la muñeca hueca, es decir,
    // la clase que se va a decorar (que puede ser hueca o decorada), y dentro va una clase enemigo,
    protected Enemigo enemigo;

    public EnemigoDecorator(Enemigo enemigo) {
        this.enemigo = enemigo;
    }

    // EL METODO ATACAR DE LA CLASE ENEMIGO SE VA A EJECUTAR, POR TANTO LA CLASE DE ADENTRO DE ESTA CLASE
    @Override
    public void atacar() {
        enemigo.atacar();
    }
}
