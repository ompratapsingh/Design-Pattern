package com.design.pattern.observer.impl;

import com.design.pattern.observer.api.IObserver;

public class ObserverB implements IObserver{

	@Override
	public void update(String data) {
		System.out.println(data);
	}
	
}
