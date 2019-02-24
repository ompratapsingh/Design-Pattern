package com.design.pattern.observer.api;

public interface ISubject {

	public void register(IObserver observer);

	public void unregister(IObserver observer);

	public void notifyObservers();
}
