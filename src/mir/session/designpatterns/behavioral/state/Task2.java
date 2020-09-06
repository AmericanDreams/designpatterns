package mir.session.designpatterns.behavioral.state;

public class Task2 extends Task {

    public Task2(TaskHandler taskHandler) {
        super(taskHandler);
    }

    @Override
    public void doSomething() {
        System.out.println("Task 2 is in process...");
        getTaskHandler().setTask(new Task1(getTaskHandler()));
    }
}
