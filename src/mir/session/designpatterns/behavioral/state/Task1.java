package mir.session.designpatterns.behavioral.state;

public class Task1 extends Task {

    public Task1(TaskHandler taskHandler) {
        super(taskHandler);
    }

    @Override
    public void doSomething() {
        System.out.println("Task 1 is in process...");
        getTaskHandler().setTask(new Task2(getTaskHandler()));
    }
}
