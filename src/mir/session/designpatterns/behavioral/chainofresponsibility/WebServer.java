package mir.session.designpatterns.behavioral.chainofresponsibility;

import mir.session.designpatterns.behavioral.chainofresponsibility.filter.AutenticationFilter;
import mir.session.designpatterns.behavioral.chainofresponsibility.filter.CompressingFilter;
import mir.session.designpatterns.behavioral.chainofresponsibility.filter.Filter;

public class WebServer {

    private Filter filter;

    public WebServer(Filter filter) {
        this.filter = filter;
    }

    public void handLeRequest(String request) {
        getFilter().handle(request);
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }
}
