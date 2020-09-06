package mir.session.designpatterns.behavioral.chainofresponsibility;

import mir.session.designpatterns.behavioral.chainofresponsibility.filter.AutenticationFilter;
import mir.session.designpatterns.behavioral.chainofresponsibility.filter.CompressingFilter;
import mir.session.designpatterns.behavioral.chainofresponsibility.filter.ExampleFilter;
import mir.session.designpatterns.behavioral.chainofresponsibility.filter.Filter;

public class Main {

    public static void main(String[] args) {
        /**
         * WebServer in icerisindeki Filter ler arasinda zencirvari elaqe qurulmalididr. Ve request
         * sirasi ile hemin filter ler terefinden handle olunmalidir.
         * */

        Filter compressingFilter = new CompressingFilter(null);
        compressingFilter.setNextFilter(new ExampleFilter(null));

        Filter autenticationFilter = new AutenticationFilter(compressingFilter);

        WebServer webServer = new WebServer(autenticationFilter);
        webServer.handLeRequest("request");
    }
}
