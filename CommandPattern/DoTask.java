package CommandPattern;

// Concrete command classes
class DoTask implements Command {
    private Task task;

    public DoTask(Task task) {
        this.task = task;
    }

    public void doIt() {
        task.doo();
    }
}

