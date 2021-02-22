package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TaskQueue implements ObservableTask {
    private final List<ObserverTask> observers;
    private final Deque<String> tasks;
    private final String studentName;

    public TaskQueue(String studentName) {
        observers = new ArrayList<>();
        tasks = new ArrayDeque<>();
        this.studentName = studentName;
    }

    public void addTask(String task) {
        tasks.offerLast(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(ObserverTask observerTask) {
        observers.add(observerTask);
    }

    @Override
    public void notifyObservers() {
        for(ObserverTask observerTask : observers) {
            observerTask.notifyAboutNewTask(this);
        }
    }

    @Override
    public void removeObserver(ObserverTask observerTask) {
        observers.remove(observerTask);
    }

    public Deque<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return studentName;
    }
}
