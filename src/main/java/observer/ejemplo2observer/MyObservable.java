package observer.ejemplo2observer;

public interface MyObservable {

    void subscribir(MyObserver observer);

    void desubscribir(MyObserver observer);

    void notificarALosDemas();
}

// EL OBSERVABLE ES QUIEN VIGILARA, Y NOTIFICARA A LOS DEMAS
// POR ENDE, EL OBSERVABLE DEBE TENER UNA LISTA DE OBSERVADORES A LOS CUALES NOTIFICAR