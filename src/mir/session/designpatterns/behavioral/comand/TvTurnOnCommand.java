package mir.session.designpatterns.behavioral.comand;

public class TvTurnOnCommand implements Command {

    private Tv tv;

    public TvTurnOnCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void doSomeThing() {
        tv.turnOn();
    }

    public Tv getTv() {
        return tv;
    }

    public void setTv(Tv tv) {
        this.tv = tv;
    }
}
