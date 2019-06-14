package abstract_factory.af_eg1.macwidgets;

import abstract_factory.af_eg1.widgets.ScrollBar;
import abstract_factory.af_eg1.widgets.WidgetFactory;
import abstract_factory.af_eg1.widgets.Window;

/**
 * This is a concrete factory that the client uses to create Mac widgets.
 */
public class MacWidgetFactory implements WidgetFactory {
    @Override
    public ScrollBar createScrollbar() {
        return new MacScrollBar();
    }

    @Override
    public Window createWindow() {
        return new MacWindow();
    }
}
