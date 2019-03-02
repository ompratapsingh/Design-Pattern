package com.design.pattern.cor.invoker;

import com.design.pattern.cor.api.Chain;
import com.design.pattern.cor.api.RequestNumber;
import com.design.pattern.cor.api.impl.NegativeHandler;
import com.design.pattern.cor.api.impl.PositiveHandler;
import com.design.pattern.cor.api.impl.ZeroHandler;

public class Invoker {

	public static void main(String[] args) {

		Chain chain = new PositiveHandler();
		Chain chain1 = new NegativeHandler();
		Chain chain2 = new ZeroHandler();
		
		chain.setSucessor(chain1);
		chain1.setSucessor(chain2);
		
		RequestNumber requestNumber = new RequestNumber();
		
		requestNumber.setNumber(12);
		chain.process(requestNumber);

		requestNumber.setNumber(0);

		chain.process(requestNumber);

		requestNumber.setNumber(-12);

		chain.process(requestNumber);

		requestNumber.setNumber(100);

		chain.process(requestNumber);

	}
}
