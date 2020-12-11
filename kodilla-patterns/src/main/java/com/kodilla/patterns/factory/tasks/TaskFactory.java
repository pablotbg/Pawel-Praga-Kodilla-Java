package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING_TASK = "SHOPPING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String DRIVING_TASK = "DRIVING_TASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING_TASK:
                return new ShoppingTask("Shopping list.", "milk", 2.0);
            case PAINTING_TASK:
                return new PaintingTask("Home painting.", "white", "kitchen");
            case DRIVING_TASK:
                return new DrivingTask("Business trip.", "Warsaw", "car");
            default:
                return null;
        }
    }

}
