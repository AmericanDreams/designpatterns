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

        List<Wheel> wheels = new ArrayList<>();
        wheels.add(new Wheel());
        wheels.add(new Wheel());
        wheels.add(new Wheel());
        wheels.add(new Wheel());

        Car car1 = new Car(wheels);
        System.out.println(car1);


        List<Wheel> wheels2 = new ArrayList<>();
        wheels2.add(new Wheel());
        wheels2.add(new Wheel());
        wheels2.add(new Wheel());
        wheels2.add(new Wheel());

        Car car2 = new Car(wheels2);
        System.out.println(car2);

    }
}
