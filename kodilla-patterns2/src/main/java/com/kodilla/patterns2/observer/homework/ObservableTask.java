package com.kodilla.patterns2.observer.homework;

public interface ObservableTask {
    void registerObserver(ObserverTask observerTask);
    void notifyObservers();
    void removeObserver(ObserverTask observerTask);
}
