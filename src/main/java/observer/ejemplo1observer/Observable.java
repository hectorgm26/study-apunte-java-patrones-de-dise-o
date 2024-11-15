package observer.ejemplo1observer;

public interface Observable {

    void addObserver(Observer observer);

    void deleteObserver(Observer observer);

    void notifyObservers();
}

// ESTA CLASE ADMINISTRA LOS OBSERVADORES, LOS AGREGA, LOS ELIMINA Y LOS NOTIFICA