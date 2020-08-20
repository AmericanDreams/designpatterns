package mir.session.designpatterns.creational.singleton;

public class Main {

    public static void main(String[] args) {
        /**
        * Bize lazimdir ki , Yeni instance yalniz bir defe create olsun
        * ve her lazim olduqda eyni insance user e teqdim olunsun.
        * */

        SingletonObject instance1 = getInstanceOfSingletonObject();
        SingletonObject instance2 = getInstanceOfSingletonObject();
        SingletonObject instance3 = getInstanceOfSingletonObject();


        System.out.println(instance1 == instance2);
        System.out.println(instance2 == instance3);
    }

    public static SingletonObject getInstanceOfSingletonObject() {
        return new SingletonObject();
    }
}
