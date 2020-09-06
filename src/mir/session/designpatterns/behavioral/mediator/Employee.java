package mir.session.designpatterns.behavioral.mediator;

public class Employee {

    private VacationMediator vacationMediator;

    public Employee(VacationMediator vacationMediator) {
        this.vacationMediator = vacationMediator;
    }

    public void leaveForVacation() {
        vacationMediator.notifyPeople();
    }
}
