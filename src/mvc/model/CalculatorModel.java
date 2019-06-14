package mvc.model;

import mvc.observer_pattern.Subject;

import java.util.Timer;
import java.util.TimerTask;

/**
 * This class represents a model and also acts as a concrete subject
 * in the observer pattern for this active MVC. It is observed by the controller and the view
 */
public class CalculatorModel extends Subject {

    private int calculationValue;

    public void addTwoNumbers(int a, int b) {
        // responds to requests from the controller to change state
        this.calculationValue = a + b;
    }


    public int getCalculationValue() {
        return calculationValue;
    }

    // Let's say the model updates randomly due to a time triggered event
    public CalculatorModel() {
        int MINUTES = 1; // The delay in minutes
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() { // Function runs every MINUTES minutes.
                // Run the code you want here
                timeTriggerEvent();
            }
        }, 0, 1000 * 60 * MINUTES);

    }

    public void timeTriggerEvent() {
        System.out.println("Inside time trigger event method");
        this.calculationValue = (int) (Math.random() * 100);
        notifyObservers(calculationValue);
    }
}
