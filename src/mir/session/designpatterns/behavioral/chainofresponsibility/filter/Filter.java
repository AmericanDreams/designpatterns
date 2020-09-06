package mir.session.designpatterns.behavioral.chainofresponsibility.filter;

public interface Filter {
    public void handle(String request);
}
