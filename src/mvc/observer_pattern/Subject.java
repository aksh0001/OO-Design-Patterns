package mvc.observer_pattern;

import java.util.HashSet;

/**
 * This class represents an abstract WeatherData class for the Observer pattern.
 * This class is observed by many observers
 */
public abstract class Subject {
    private HashSet<Observer> observers;

    public Subject() {
        observers = new HashSet<>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers(int newCalcValue) {
        for (Observer o : observers) {
            o.update(newCalcValue);
        }
    }


}
