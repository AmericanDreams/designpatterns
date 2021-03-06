package mir.session.designpatterns.behavioral.chainofresponsibility.filter;

public class CompressingFilter extends Filter {


    public CompressingFilter(Filter nextFilter) {
        super(nextFilter);
    }

    @Override
    public void handle(String request) {
        //Compressing...
        System.out.println("Compressing Filter is working...");
        if (getNextFilter() != null) {
            getNextFilter().handle(request);
        }
    }
}
