package com.design.pattern.factory.invoker;

import com.design.pattern.factory.api.FileType;
import com.design.pattern.factory.creator.FileProcessorFactory;

public class FactoryClient {
	public static void main(String[] args) {
		FileProcessorFactory.getInstacne(FileType.PDF_FILE).proces(null);
	}
}
