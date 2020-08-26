package mir.session.designpatterns.behavioral.chainofresponsibility.filter;

public class AutenticationFilter implements Filter {

    @Override
    public void handle(String request) {
        // Autentication cheching...
        System.out.println("Autentication filter is working...");
        if (request.equals("request")){
            System.out.println("Authentication is successful...");
        } else {
            System.out.println("Authentication is failed...");
        }
    }
}
