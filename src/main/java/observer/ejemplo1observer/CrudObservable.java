package observer.ejemplo1observer;

import java.util.HashSet;
import java.util.Set;

public class CrudObservable implements Observable {

    Set<Observer> observerSet = new HashSet<>();
    // esto es un set de observadores, para almacenar los observadores

    @Override
    public void addObserver(Observer observer) {
        observerSet.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observerSet.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerSet) {
            observer.update();
        }
    }
}

// En esta clase, tenemos que tener una forma de almacenar los observadores, para ello podemos usar una lista de observadores, o un set de observadores
// En este caso, usaremos un set de observer para almacenar los observadores
// AQUI SOLO ADMINISTRAMOS LOS OBSERVADORES, NO HACEMOS NADA MAS

