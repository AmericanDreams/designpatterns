package mir.session.designpatterns.behavioral.mediator;

public class Main {

    public static void main(String[] args) {
        /**
         * Employee class inin Manager ve Boss is tightly coupled elaqesi var. Bu elaqeleri yeni bir class a
         * kocururek Employee nin vacationu cixan zaman kimleri hansi shekilde notify etmesini bilmeli olmasindan
         * azad etmish olariq.
         * */
        Employee employee = new Employee(new Boss(), new Manager());
        employee.leaveForVacation();
    }
}
