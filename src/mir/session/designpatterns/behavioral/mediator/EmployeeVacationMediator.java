package mir.session.designpatterns.behavioral.mediator;

public class EmployeeVacationMediator implements VacationMediator {

    private Boss boss;
    private Manager manager;

    public EmployeeVacationMediator(Boss boss, Manager manager) {
        this.boss = boss;
        this.manager = manager;
    }

    @Override
    public void notifyPeople() {
        boss.notifyMe();
        manager.textMe();
    }

    public Boss getBoss() {
        return boss;
    }

    public void setBoss(Boss boss) {
        this.boss = boss;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
