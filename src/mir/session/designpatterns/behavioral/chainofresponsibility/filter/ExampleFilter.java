package mir.session.designpatterns.behavioral.chainofresponsibility.filter;

public class ExampleFilter extends Filter {

    public ExampleFilter(Filter nextFilter) {
        super(nextFilter);
    }

    @Override
    public void handle(String request) {
        System.out.println("Example Filter is working...");
        if (getNextFilter() != null) {
            getNextFilter().handle(request);
        }
    }
}
