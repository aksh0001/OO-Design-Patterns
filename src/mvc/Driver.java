package mvc;

import mvc.application.CalculatorController;
import mvc.model.CalculatorModel;
import mvc.presentation.CalculatorView;

public class Driver {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView(model);
        CalculatorController controller = new CalculatorController(model, view, model);
        view.getApplicationFrame().setVisible(true);
    }
}
