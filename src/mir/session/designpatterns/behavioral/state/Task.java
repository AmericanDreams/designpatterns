package mir.session.designpatterns.behavioral.state;

public abstract class Task {

    private TaskHandler taskHandler;

    public Task(TaskHandler taskHandler) {
        this.taskHandler = taskHandler;
    }

    public abstract void doSomething();

    public TaskHandler getTaskHandler() {
        return taskHandler;
    }

    public void setTaskHandler(TaskHandler taskHandler) {
        this.taskHandler = taskHandler;
    }
}
