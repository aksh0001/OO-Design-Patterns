package observer.obs_eg1.concretesubjects;

/**
 * This class represents the concrete subject, weather data, which is class that changes
 */
public class WeatherData extends observer.obs_eg1.observer_pattern.WeatherData {
    private float temp;
    private float humidity;
    private float pressure;

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();

    }

    private void measurementsChanged() {
        notifyObservers(this.temp, this.humidity, this.pressure);
    }


}
