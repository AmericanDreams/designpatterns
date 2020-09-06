package mir.session.designpatterns.behavioral.chainofresponsibility.filter;

public class AutenticationFilter extends Filter {

    public AutenticationFilter(Filter nextFilter) {
        super(nextFilter);
    }

    @Override
    public void handle(String request) {
        // Autentication cheching...
        System.out.println("Autentication filter is working...");
        if (request.equals("request")){
            System.out.println("Authentication is successful...");
            if (getNextFilter() !=  null) {
                getNextFilter().handle(request);
            }
        } else {
            System.out.println("Authentication is failed...");
        }
    }
}
