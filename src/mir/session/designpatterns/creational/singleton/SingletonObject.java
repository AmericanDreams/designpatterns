package mir.session.designpatterns.creational.singleton;

public class SingletonObject {

    private volatile static SingletonObject instance;

    private SingletonObject() {
        System.out.println("SingletonObject is created");
    }

    public static SingletonObject getInstance() {
        if (instance == null) {
            synchronized (SingletonObject.class) {
                if (instance == null) {
                    instance = new SingletonObject();
                }
            }
        }
        return instance;
    }
}
