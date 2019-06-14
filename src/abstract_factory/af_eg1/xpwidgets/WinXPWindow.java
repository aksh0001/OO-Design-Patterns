package abstract_factory.af_eg1.xpwidgets;

import abstract_factory.af_eg1.widgets.Window;

/**
 * This class is a concrete implementation of the abstract product, Window -- meant specifically for XP.
 */
public class WinXPWindow extends Window {
    @Override
    public void describeWindow() {
        System.out.println("This is a Windows XP Window!");
    }
}
