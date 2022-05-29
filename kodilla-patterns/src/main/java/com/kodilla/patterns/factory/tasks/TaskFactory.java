package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING TASK";
    public static final String PAINTING = "PAINTING TASK";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Shopping in city center", "New tshirt", 4);
            case PAINTING:
                return new PaintingTask("Finish the picture", "blue", "sky");
            case DRIVING:
                return new DrivingTask("A trip", "Praha", "rented Mercedes");
            default:
                return null;
        }
    }
}
