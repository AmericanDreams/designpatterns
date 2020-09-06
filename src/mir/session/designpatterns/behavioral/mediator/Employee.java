package mir.session.designpatterns.behavioral.mediator;

public class Employee {

    private Boss boss;
    private Manager manager;

    public Employee(Boss boss, Manager manager) {
        this.boss = boss;
        this.manager = manager;
    }

    public void leaveForVacation() {
        boss.notifyMe();
        manager.textMe();
    }
}
