package mvc.application;

import mvc.model.CalculatorModel;
import mvc.observer_pattern.Observer;
import mvc.observer_pattern.Subject;
import mvc.presentation.CalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController extends Observer {

    private CalculatorView view;
    private CalculatorModel model;

    private Subject calcModel;

    public CalculatorController(CalculatorModel model, CalculatorView view, Subject calcModel) {
        this.view = view;
        this.model = model;

        this.view.addCalculationActionListener(new CalculateListener());
        this.calcModel = calcModel;
        calcModel.registerObserver(this);
    }

    private class CalculateListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int first, second = 0;
            try {
                // get user input
                first = view.getFirstNumber();
                second = view.getSecondNumber();

                model.addTwoNumbers(first, second); // tells model to change it's state

                view.setSolution(model.getCalculationValue()); // informs the view to change as appropriate
            } catch (NumberFormatException n) {
                view.displayErrorMessage("You need to enter two integers!");
            }
        }
    }


    @Override
    public void update(int newCalcValue) {
    }
}
