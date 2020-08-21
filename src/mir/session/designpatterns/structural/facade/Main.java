package mir.session.designpatterns.structural.facade;

public class Main {

    public static void main(String[] args) {

        Generator generator = new GeneratorImpl();
        Light light = new LightImpl();


        /**
         * Light sondurub yandirmaq prosesinde bir nece proses heyata kecirilmeli olur.
         * Bunu abstract ve sade vesiyyete getirmek lazimdir ki, user prosessin detallarindan
         * xeberdar olmadan bu funksionalliqi istifade ede bilsin
         * */

        //turn on the light
        generator.start();
        light.turnOn();


        //turn of the light
        light.turnOff();
        generator.stop();


    }
}
