package com.mb.dineit.observable;

public interface Observable {
    public void addObserver();
    public void removeObserver();
    public void notifyObservers();
}
