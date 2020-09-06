package mir.session.designpatterns.behavioral.comand;

public class Main {

    public static void main(String[] args) {

        /**
         * Gelecekde daha remote Controler Tv ile elaqeli ferqli commandlar da yerine yetirmeli ola biler.
         * Ummumiyyetle hemin Remote Controler bashqa ishler ucun de istifade oluna biler. Buna gore
         * Remote controlun eslinde button press olunduqda gorduyu ishden xebersiz olmalididr.
         * */

        Command tvTurnOnCommand = new TvTurnOnCommand(new Tv());

        RemoteControl remoteControl = new RemoteControl(tvTurnOnCommand);
        remoteControl.pressButton();

        //remoteControl.printLast3Commands();
    }
}
