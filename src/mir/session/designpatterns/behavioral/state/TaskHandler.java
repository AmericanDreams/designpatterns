package mir.session.designpatterns.behavioral.state;

public class TaskHandler {

    private Task task = new Task1(this);

    public TaskHandler() {

    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public void handleTask() {
        task.doSomething();
    }
}
