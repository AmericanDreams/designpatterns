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

        LightFacade lightFacade = new LightFacadeImpl(generator, light);
        useLight(lightFacade);
    }

    public static void useLight(LightFacade lightFacade) {
        lightFacade.lightTurnOn();
    }
}
