package com.mb.dineit.observable;

public interface Observable<T> {
    void addObserver(Observer<T>observer);
    void removeObserver(Observer<T> observer);
    void notifyObservers();
    T getData();
}
