package mir.session.designpatterns.behavioral.chainofresponsibility.filter;

public abstract class Filter {

    private Filter nextFilter;

    public Filter(Filter nextFilter) {
        this.nextFilter = nextFilter;
    }

    public abstract void handle(String request);

    public Filter getNextFilter() {
        return nextFilter;
    }

    public void setNextFilter(Filter nextFilter) {
        this.nextFilter = nextFilter;
    }
}
