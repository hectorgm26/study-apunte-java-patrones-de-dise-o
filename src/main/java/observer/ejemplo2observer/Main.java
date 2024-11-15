package observer.ejemplo2observer;

public class Main {
    public static void main(String[] args) {

        Guerrero guerrero1 = new Guerrero("Guerrero 1");
        Guerrero guerrero2 = new Guerrero("Guerrero 2");
        Mago mago1 = new Mago("Mago 1");
        Mago mago2 = new Mago("Mago 2");

        Vigilante vigilante = new Vigilante("Vigilante");

        vigilante.subscribir(guerrero1);
        vigilante.subscribir(guerrero2);
        vigilante.subscribir(mago1);
        vigilante.subscribir(mago2);
        vigilante.activar();
        System.out.println("==================================");
        vigilante.desubscribir(guerrero1);
        vigilante.activar();


    }
}


/*
Patron de diseño Observer

El observador necesita observar algo
El observable necesita ser observado por algo o alguien

Es un patron de diseño de comportamiento, que define una dependencia de uno a muchos entre objetos,
de manera que cuando un objeto cambia su estado, todos los objetos que dependen de él son notificados y actualizados automáticamente.

HAY UN OBJETO QUE NOTIFICA A TODOS LOS DEMAS
EJEMPLO: LAS TORRES DEL FAR CRY 3, QUE AL MOMENTO DE DETECTARLE, LE AVISE A LOS ENEMIGOS QUE ESTAN A SU ALREDEDOR PARA QUE TE ATACQUEN
OBSERVABLE = VIGILANTE DE LA TORRE
OBSERVADOR u observers= OTROS ENEMIGOS INACTIVOS RONDANDO POR AHI

TANTO MAGOS COMO GUERREROS SERAN OBSERVADORES QUE ESTARAN ATENTOS A LA SEÑAL DEL VIGILANTE, QUE DARA EL AVISO DE QUE EL JUGADOR ESTA CERCA PARA ATACARLO

DESDE JAVA 9 ESTAN DEPRECADOS LOS OBSERVABLES Y OBSERVADORES, SE RECOMIENDA USAR INTERFACES FUNCIONALES

 */