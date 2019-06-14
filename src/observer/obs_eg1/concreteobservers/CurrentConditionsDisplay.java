package observer.obs_eg1.concreteobservers;

import observer.obs_eg1.observer_pattern.Observer;
import observer.obs_eg1.observer_pattern.WeatherData;

/**
 * This is an concrete observer class that observes the subject, WeatherData and reacts to the change
 */
public class CurrentConditionsDisplay extends Observer implements DisplayElement {
    private float humidity, temp, pressure;
    private WeatherData weatherData; // The subject it observes (handy if we wish to unregister this as an observer)
    // Note that this stores the concrete subject (association with concrete subject)

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temp + "F degrees and " + humidity + "% humidity and "
                + pressure + "kpa pressure");

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        // We could simply use the subject we are observing to update as well? Solves the inflexible parameters problem
        // Like follows: this.temp = weatherData.getTemp();
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
