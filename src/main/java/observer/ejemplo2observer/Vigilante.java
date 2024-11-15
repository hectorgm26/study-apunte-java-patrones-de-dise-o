package observer.ejemplo2observer;

import java.util.ArrayList;
import java.util.List;

public class Vigilante extends Enemigo implements MyObservable {

    // EL VIGILANTE TENDRA UNA lista de observadores a los cuales notificar, y los añadira en el subscribe
    private List<MyObserver> observers = new ArrayList<>();

    public Vigilante(String nombre) {
        super(nombre);
        setActivo(true); // El vigilante siempre estara activo buscando a los enemigos
    }

    @Override
    public void atacar() {
        System.out.println(getNombre() + " Atacando");
    }

    @Override
    public void activar() {
        System.out.println(getNombre() + " Activado, enviando mensaje de alerta");
        notificarALosDemas();
    }

    // ESTE METODO SE EJECUTARA CUANDO SE AÑADA UN OBSERVADOR, Y SE AÑADIRA A LA LISTA DE OBSERVADORES, PARA QUE CUANDO SE ACTIVE EL VIGILANTE, SE LES NOTIFIQUE
    // Y SE LE NOTIFICARA, POR MEDIO DEL METODO UPDATE, QUE SE EJECUTARA EN CADA OBSERVADOR QUE ESTE EN LA LISTA
    @Override
    public void subscribir(MyObserver observer) {
        observers.add(observer);
    }

    @Override
    public void desubscribir(MyObserver observer) {
        observers.remove(observer);
    }

    // ESTE METODO RECORRERA LA LISTA DE OBSERVADORES Y LES ENVIARA UN MENSAJE DE ALERTA, EJECUTANDO EL METODO UPDATE DE CADA OBSERVADOR
    @Override
    public void notificarALosDemas() {
        for (MyObserver observer : observers) {
            observer.update();
        }
    }
}

/*
PARA IMPLEMENTAR A TODOS LOS OBSERVADORES, SE TIENE QUE UTILIZAR UNA ESTRUCTURA DE DATOS QUE PUEDE SER UNA LISTA O UN MAP

LUEGO, CON EL METODO SUBSCRIBE, SE AÑADIRA A LA LISTA DE OBSERVADORES UN TIPO DE ENEMIGO,
PARA QUE CUANDO SE ACTIVE EL VIGILANTE, SE LES NOTIFIQUE A TODOS LOS ENEMIGOS AGREGADOS

UNA VEZ ACTIVADO EL VIGILANTE, SE LLAMA AL METODO NOTIFICARALOSDEMAS, QUE MANDAR A TODOS LOS OBSERVADORES UN MENSAJE DE ALERTA, EJECUTANDO EL METODO UPDATE DE ESTADO

 */
