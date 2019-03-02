package com.design.pattern.cor.api;

public interface Chain {

	public void setSucessor(Chain chain);

	public void process(RequestNumber number);

}
