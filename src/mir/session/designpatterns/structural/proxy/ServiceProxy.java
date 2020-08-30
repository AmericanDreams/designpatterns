package mir.session.designpatterns.structural.proxy;

public class ServiceProxy implements Service {

    private Service service;

    public ServiceProxy(Service service) {
        this.service = service;
    }

    @Override
    public void doSomething() {
        System.out.println("Logging...");
        service.doSomething();
    }
}
