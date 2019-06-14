package observer.obs_eg1.observer_pattern;

/**
 * This class represents abstract Observer entities
 */
public abstract class Observer {
    /**
     * This is the method that observers implement to react to subject updates
     * NB: This design is not very flexible since we are assuming all observers will have the following parameters.
     * Instead, follow the design of Java's in-built Observer pattern (rather than passing in explicit params,
     * it simply passes in the WeatherData so that the implementation can decide on how to handle state changes)
     * @param temp temperature
     * @param humidity humidity
     * @param pressure pressure
     */
    public abstract void update(float temp, float humidity, float pressure);
    // We could simply use the subject we are observing to update as well? Solves the inflexible parameters problem


//    public abstract void update();
}
