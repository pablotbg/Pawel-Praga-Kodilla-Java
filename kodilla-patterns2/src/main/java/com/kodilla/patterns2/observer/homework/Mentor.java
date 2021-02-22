package com.kodilla.patterns2.observer.homework;

public class Mentor implements ObserverTask {
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void notifyAboutNewTask(TaskQueue taskQueue) {
        System.out.println(mentorName + " has a new task to check " + taskQueue.getTasks().getLast()
                        + " from student " + taskQueue.getName() + "\n" +
                "Total tasks: " + taskQueue.getTasks().size() + " to check");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }


}
