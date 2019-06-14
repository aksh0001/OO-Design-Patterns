package abstract_factory.af_eg1.macwidgets;

import abstract_factory.af_eg1.widgets.Window;

/**
 * This class is a concrete implementation of the abstract product, Window -- meant specifically for Mac.
 */
public class MacWindow extends Window {
    @Override
    public void describeWindow() {
        System.out.println("This is a Mac Window!");
    }
}
