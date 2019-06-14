package abstract_factory.af_eg1.widgets;

/**
 * This interface represents the abstract factory
 */
public interface WidgetFactory {
    public ScrollBar createScrollbar();
    public Window createWindow();
}
