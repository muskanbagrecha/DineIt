package com.mb.dineit.observable;

public interface Observer<T> {
    void update(Observable<T> observable);
}
