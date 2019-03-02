package com.design.pattern.observer.invoker;

import com.design.pattern.observer.api.ISubject;
import com.design.pattern.observer.impl.ObserverA;
import com.design.pattern.observer.impl.ObserverB;
import com.design.pattern.observer.impl.SubjectImpl;

public class ObserverInvoker {
	public static void main(String[] args) {
		
		// Register All observer for notification
		ISubject subject=new SubjectImpl();
		subject.register(new ObserverA());
		ObserverB observerB=new ObserverB();
		subject.register(observerB);
		
		
		// Notify message to all observer
		subject.notifyObservers();
		
		// Remove observerA from List
		subject.unregister(observerB);
	}
}
