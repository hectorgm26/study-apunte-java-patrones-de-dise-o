package decorator;

import decorator.decorator.AsesinoEnemigoDecorator;
import decorator.decorator.GuerreroEnemigoDecorator;
import decorator.decorator.MagoEnemigoDecorator;
import decorator.razas.Elfo;
import decorator.razas.Humano;

public class Main {
    public static void main(String[] args) {

        // PARA IMPLEMENTAR EL PATRON DECORATOR, SE CREAN CLASES DECORADORAS QUE HEREDAN DE LA CLASE ORIGINAL
        // TODAS LAS CLASES LLEVARAN UN ENEMIGO DENTRO, SALVO LAS RAZAS QUE SON LAS CLASES ORIGINALES, QUE SIMPLEMENTE ATACAN

        System.out.println("======= HUMANO GUERRERO =======");
        Enemigo humanoGuerrero = new GuerreroEnemigoDecorator(new Humano());
        humanoGuerrero.atacar();

        System.out.println("======= HUMANO GUERRO MAGO =======");
        Enemigo humanoGuerreroMago = new GuerreroEnemigoDecorator(new MagoEnemigoDecorator(new Humano()));
        humanoGuerreroMago.atacar();

        System.out.println("======= ELFO GUERRERO MAGO ASESINO =======");
        Enemigo elfoGuerreroMagoAsesino = new AsesinoEnemigoDecorator((new MagoEnemigoDecorator(new GuerreroEnemigoDecorator(new Elfo()))));
        elfoGuerreroMagoAsesino.atacar();
    }
}

/*
Patron de diseño estructural Decorator

El patrón de diseño Decorator se utiliza para añadir nuevas funcionalidades a un objeto sin modificar su estructura.
Este patrón crea una clase decoradora que envuelve la clase original
y proporciona funcionalidades adicionales manteniendo intacta la estructura de la clase original.

EJEMPLO: SE TENDRAN ENEMIGOS CON SUS CLASES Y RAZAS, SE PODRAN DECORAR CON ARMAS Y ARMADURAS, O HACER MIX DE AMBOS
EL PATRON ES PARA HACER COMBINACIONES MUCHAS COMBINACIONES, SIN NECESIDAD DE CREAR UNA CLASE PARA CADA COMBINACION,
NI MODIFICAR LAS CLASES ORIGINALES

UNA IMPLEMENTACION DE LA VIDA REAL SON LAS MATROSKAS RUSAS, QUE VAN UNA DENTRO DE OTRA, Y ASI SUCESIVAMENTE
EN ESTE CASO, TODAS LAS CLASES EN EL PAQUETE DE RAZAS, SERIAN LA MUÑECA MAS PEQUEÑA, Y LAS RESTANTES LAS CLASES DECORADORAS

 */
