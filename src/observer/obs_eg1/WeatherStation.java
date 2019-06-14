package observer.obs_eg1;

import observer.obs_eg1.concreteobservers.CurrentConditionsDisplay;
import observer.obs_eg1.concretesubjects.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(wd);

        currentDisplay.display();

        // Change the subject's state
        wd.setMeasurements(80, 65, 30.4f);
        wd.setMeasurements(82, 70, 29.2f);
        wd.setMeasurements(78, 90, 45.7f);

        wd.removeObserver(currentDisplay);
    }
}
