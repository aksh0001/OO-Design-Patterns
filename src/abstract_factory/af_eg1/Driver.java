package abstract_factory.af_eg1;

import abstract_factory.af_eg1.macwidgets.MacWidgetFactory;
import abstract_factory.af_eg1.widgets.WidgetFactory;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Testing Abstract Factory Pattern\n");
        WidgetFactory widgetFactory = new MacWidgetFactory();
        Client test = new Client(widgetFactory);
        test.testClient();
    }
}
