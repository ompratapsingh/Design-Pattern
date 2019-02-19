package com.design.pattern.factory.impl;

import java.io.File;

import com.design.pattern.factory.api.IAttachmentProcessor;

public class TextFileAttacmentProcessorImpl implements IAttachmentProcessor{

	@Override
	public void proces(File file) {
		System.out.println("Text File processor...");
	}

}
