package abstract_factory.af_eg1;

import abstract_factory.af_eg1.widgets.ScrollBar;
import abstract_factory.af_eg1.widgets.WidgetFactory;
import abstract_factory.af_eg1.widgets.Window;

public class Client {
    private WidgetFactory widgetFactory;

    public Client(WidgetFactory widgetFactory)
    {
        this.widgetFactory = widgetFactory;
    }

    public void testClient()
    {
        ScrollBar sc = widgetFactory.createScrollbar();
        Window wi = widgetFactory.createWindow();
        sc.describeScrollBar();
        wi.describeWindow();
    }
}
