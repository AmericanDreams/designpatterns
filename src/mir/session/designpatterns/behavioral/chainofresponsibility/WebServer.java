package mir.session.designpatterns.behavioral.chainofresponsibility;

import mir.session.designpatterns.behavioral.chainofresponsibility.filter.AutenticationFilter;
import mir.session.designpatterns.behavioral.chainofresponsibility.filter.CompressingFilter;
import mir.session.designpatterns.behavioral.chainofresponsibility.filter.Filter;

public class WebServer {

    public void handLeRequest(String request) {
        Filter autenticationFilter = new AutenticationFilter();
        autenticationFilter.handle(request);

        Filter filter = new CompressingFilter();
        filter.handle(request);
    }
}
