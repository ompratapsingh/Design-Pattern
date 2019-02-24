package com.design.pattern.observer.impl;

import java.util.ArrayList;
import java.util.List;

import com.design.pattern.observer.api.IObserver;
import com.design.pattern.observer.api.ISubject;

public class SubjectImpl implements ISubject {

	private final List<IObserver> list = new ArrayList<>();

	@Override
	public void register(IObserver observer) {
		if (!list.contains(observer)) {
			list.add(observer);
			System.out.println(observer.getClass().getName() +" Registered Sucessfully!");
		} else {
			System.out.println("Observer allready exist in queue!");
		}

	}

	@Override
	public void unregister(IObserver observer) {
		if (list.contains(observer)) {
			list.remove(observer);
			System.out.println(observer.getClass().getName()+" Unregistred from list");
		} else {
			System.out.println("Observer not exist in quque!");
		}

	}

	@Override
	public void notifyObservers() {
		for (final IObserver iObserver : list) {
			iObserver.update("Update for " + iObserver.getClass().getName());
		}
	}

}
