package mir.session.designpatterns.behavioral.chainofresponsibility.filter;

public class CompressingFilter implements Filter {
    @Override
    public void handle(String request) {
        //Compressing...
        System.out.println("Compressing Filter is working...");
    }
}
