package mir.session.designpatterns.structural.proxy;

public class ServiceImpl implements Service {
    @Override
    public void doSomething() {
        System.out.println("I did something");
    }
}
