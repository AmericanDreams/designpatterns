package mir.session.designpatterns.behavioral.mediator;

public class Main {

    public static void main(String[] args) {
        /**
         * Employee class inin Manager ve Boss is tightly coupled elaqesi var. Bu elaqeleri yeni bir class a
         * kocururek Employee nin vacationu cixan zaman kimleri hansi shekilde notify etmesini bilmeli olmasindan
         * azad etmish olariq.
         * */

        VacationMediator vacationMediator = new EmployeeVacationMediator(new Boss(), new Manager());

        Employee employee = new Employee(vacationMediator);
        employee.leaveForVacation();
    }
}
