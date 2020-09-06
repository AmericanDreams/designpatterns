package mir.session.designpatterns.behavioral.strategy;

public class TaskRunner {

    private Task task;

    public TaskRunner(Task task) {
        this.task = task;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public void handleTask() {
        getTask().doSomething();
    }
}
