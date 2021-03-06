package mir.session.designpatterns.structural.adapter;

public class Main {

    public static void main(String[] args) {
        Engine engine = new SimpleEngine();

        /**
         * controlerSwitch methodunun signature sini deyishdirmeden oraya
         * Engine interface sinin instancenini gondere bilmeliyik
         * */

        EngineAdapter engineAdapter = new EngineAdapter(engine);

        controlSwitch(engineAdapter);
    }

    public static void controlSwitch(Switch s) {
        s.turnOn();
    }
}
