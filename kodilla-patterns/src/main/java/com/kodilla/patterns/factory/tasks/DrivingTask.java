package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {

    private final String taskName;
    private final String where;
    private final String using;
    private boolean taskExecuted = true;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        if (taskExecuted) {
            System.out.println("Task " + taskName + " has been executed.");
        } else {
            System.out.println("Task " + taskName + " has not been executed.");
            taskExecuted = false;
        }
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return taskExecuted;
    }
}
