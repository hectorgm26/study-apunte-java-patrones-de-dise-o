package observer.ejemplo1observer;

public class Main {
    public static void main(String[] args) {

        CrudObservable observable = new CrudObservable();

        observable.addObserver(new Ejemplo1Observer());
        observable.addObserver(new Ejemplo2Observer());
        observable.notifyObservers();

        observable.addObserver(new Ejemplo3Observer());
        observable.notifyObservers();
    }
}

/*
Patron de diseño Observer

El patrón de diseño Observer es un patrón de comportamiento que consiste en definir una dependencia uno a muchos entre objetos, de manera que cuando un objeto cambie su estado, todos los objetos que dependen de él sean notificados y actualizados automáticamente.
Es decir, nos ayuda a tener logicas separadas y codigo desacoplado, de tal manera que si un objeto cambia su estado, todos los objetos que dependen de él, se enteran y pueden actuar en consecuencia.

Nos ayuda a tener disparadores de eventos, en los cuales si pasa una accion, notificaremos a otra clase que escharará este evento
y actuará en consecuencia.


ADVERTENCIA: JAVA DESDE JAVA 9 TIENE UNA IMPLEMENTACION DE OBSERVERS, PERO NO ES RECOMENDABLE USARLA, YA QUE ES UNA IMPLEMENTACION DEPRECADA, Y SON CLASES, NO INTERFACES

 */