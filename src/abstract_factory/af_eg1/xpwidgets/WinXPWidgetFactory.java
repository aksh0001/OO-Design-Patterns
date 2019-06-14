package abstract_factory.af_eg1.xpwidgets;

import abstract_factory.af_eg1.widgets.ScrollBar;
import abstract_factory.af_eg1.widgets.WidgetFactory;
import abstract_factory.af_eg1.widgets.Window;

/**
 * This is a concrete factory that the client uses to create XP Widgets.
 */
public class WinXPWidgetFactory implements WidgetFactory {
    @Override
    public ScrollBar createScrollbar() {
        return new WinXPScrollBar();
    }

    @Override
    public Window createWindow() {
        return new WinXPWindow();
    }
}
