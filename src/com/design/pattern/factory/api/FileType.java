package com.design.pattern.factory.api;

import com.design.pattern.factory.impl.TextFileAttacmentProcessorImpl;

import java.util.function.Supplier;

import com.design.pattern.factory.impl.PDFFileAttachmentProcessor;

import com.design.pattern.factory.api.IAttachmentProcessor;

public enum FileType {

	TEXT_FILE(TextFileAttacmentProcessorImpl::new), PDF_FILE(PDFFileAttachmentProcessor::new);

	private Supplier<IAttachmentProcessor> instantiator;

	private FileType(Supplier<IAttachmentProcessor> instantiator) {
		this.instantiator = instantiator;
	}

	public IAttachmentProcessor getInstance() {
		return instantiator.get();
	}
}
