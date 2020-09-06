package mir.session.designpatterns.behavioral.strategy;

public class Main {

    public static void main(String[] args) {
        /**
         * Hansin taskin run olunacaqina runtime da qerar verilmesini temin etmek lazimdir.
         * */

        TaskRunner taskRunner = new TaskRunner(new Task1());
        taskRunner.handleTask();
    }
}
