package com.politrix.util;

/**
 * Created by stdavis on 2/5/17.
 */
public interface Observable<T> {
    <U> void registerObserver(Observer<U> u);

    <U> void deregisterObserver(Observer<U> u);

    void notifyObservers();
}