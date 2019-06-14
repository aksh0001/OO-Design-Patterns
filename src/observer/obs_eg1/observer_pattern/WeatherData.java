package observer.obs_eg1.observer_pattern;

import java.util.HashSet;

/**
 * This class represents a WeatherData class for the Observer pattern. This class is observed by many observers
 */
public abstract class WeatherData {
    private HashSet<Observer> observers;

    public WeatherData() {
        observers = new HashSet<>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers(float temp, float humidity, float pressure) { // again this is a bad design
        // of parameters since it is tightly coupled to the fact that subjects must have those exact params.
        for (Observer o : observers) {
            o.update(temp, humidity, pressure);
        }
    }


}
