package mir.session.designpatterns.behavioral.comand;

public class RemoteControl {

    private Tv tv;

    public RemoteControl(Tv tv) {
        this.tv= tv;
    }

    public void pressButton() {

        tv.turnOn();
    }


    public void printLast3Commands() {
        //Implement...
    }

}
