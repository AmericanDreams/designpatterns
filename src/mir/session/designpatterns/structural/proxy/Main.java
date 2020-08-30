package mir.session.designpatterns.structural.proxy;

public class Main {

    public static void main(String[] args) {

        /**
         * Ashagidaki useService methoduna gonderdiyimiz ServiceImpl objectinin her doSomething
         * methodu cagirildiqda LOG-lamaq isteyirik. Amma bunun yalniz bu ashaqidaki methodda istifade olunan
         * zaman olmasi ucun class in icerisine hemin loglama kodunu elave ede bilmerik
         * */

        Service service = new ServiceImpl();
        useService(service);
    }

    public static void useService(Service service) {
        service.doSomething();
    }
}
