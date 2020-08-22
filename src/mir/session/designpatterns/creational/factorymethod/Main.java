package mir.session.designpatterns.creational.factorymethod;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /**
         * Car object i yaratmaq prosesi olduqca qarishiqdir. Evvelce Wheel ler yaradilmali ve s. Bize lazimdir ki,
         * Bu qarishiq object i yaratma prosesini user den gizledek ve kodu daha sade hala getire bilek.
         * Ve gelecekde Car object inin yaradilmasi prosesi deyishilerse, bunu kodda yalniz bir yerde deyishdirmekle
         * hell ede bilek
         * */

        CarFactory carFactory = new CarFactoryImpl2();

        Car car1 = Car.getInstance();
        System.out.println(car1);

        Car car2 = carFactory.createInstance();;
        System.out.println(car2);

    }
}
