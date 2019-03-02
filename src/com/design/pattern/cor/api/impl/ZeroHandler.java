package com.design.pattern.cor.api.impl;

import com.design.pattern.cor.api.Chain;
import com.design.pattern.cor.api.RequestNumber;

public class ZeroHandler implements Chain {

	private Chain chain;

	@Override
	public void setSucessor(Chain chain) {
		this.chain = chain;
	}

	@Override
	public void process(RequestNumber number) {
		if (number.getNumber() == 0) {
			System.out.println("Handle by "+this.getClass().getSimpleName());
		} else {
			this.chain.process(number);
		}
	}

}
