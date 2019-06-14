package mvc.presentation;

import mvc.observer_pattern.Observer;
import mvc.observer_pattern.Subject;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * This class represents the view in the MVC. It is also an observer and observes the Model in case that changes
 * due to time-triggered events or other controllers changing the model. Note that since this extends Observer,
 * we cannot extend JFrame; hence, I will use the classic "Composition over Inheritance" strategy to solve the
 * multiple inheritance scenario.
 */
public class CalculatorView extends Observer {

    private JFrame applicationFrame = new JFrame(); // composition
    private JTextField firstNumber = new JTextField(5); // NO DI (Dependency Injection)
    private JLabel additionLabel = new JLabel("+");
    private JTextField secondNumber = new JTextField(5);
    private JButton calculateButton = new JButton("Calculate");
    private JTextField solution = new JTextField(5);
    // **note: The view usually stores an attribute of the model, but we haven't done so here

    private Subject calcModel;

    public CalculatorView(Subject calcModel) {
        JPanel jPanel = new JPanel();
        this.applicationFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.applicationFrame.setSize(600, 200);

        jPanel.add(firstNumber);
        jPanel.add(additionLabel);
        jPanel.add(secondNumber);
        jPanel.add(calculateButton);
        jPanel.add(solution);

        this.applicationFrame.add(jPanel);
        this.calcModel = calcModel;
        calcModel.registerObserver(this);
    }


    @Override
    public void update(int newCalcValue) {
        // update the view with this new value
        this.setSolution(newCalcValue);

    }

    public int getFirstNumber() {
        return Integer.parseInt(firstNumber.getText());
    }

    public int getSecondNumber() {
        return Integer.parseInt(secondNumber.getText());
    }

    public int getSolution() {
        return Integer.parseInt(solution.getText());
    }

    public void setSolution(int solution) {
        this.solution.setText(Integer.toString(solution));
    }

    public void addCalculationActionListener(ActionListener listener) {
        calculateButton.addActionListener(listener);
    }

    public void displayErrorMessage(String message) {
        JOptionPane.showMessageDialog(this.applicationFrame, message);
    }

    public JFrame getApplicationFrame() {
        return applicationFrame;
    }
}

