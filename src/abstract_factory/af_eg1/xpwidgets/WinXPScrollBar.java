package abstract_factory.af_eg1.xpwidgets;

import abstract_factory.af_eg1.widgets.ScrollBar;

/**
 * This class is a concrete implementation of the abstract product, ScrollBar -- meant specifically for XP.
 */
public class WinXPScrollBar extends ScrollBar {
    @Override
    public void describeScrollBar() {
        System.out.println("This is a Windows XP Scroll Bar!");
    }
}
