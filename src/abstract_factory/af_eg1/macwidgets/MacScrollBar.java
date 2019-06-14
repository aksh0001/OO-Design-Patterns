package abstract_factory.af_eg1.macwidgets;

import abstract_factory.af_eg1.widgets.ScrollBar;

/**
 * This class is a concrete implementation of the abstract product, ScrollBar -- meant specifically for Mac.
 */
public class MacScrollBar extends ScrollBar {
    @Override
    public void describeScrollBar() {
        System.out.println("This is a Mac Scroll Bar!");
    }
}
