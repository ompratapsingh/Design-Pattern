package com.design.pattern.factory.creator;

import java.util.EnumMap;

import com.design.pattern.factory.api.FileType;
import com.design.pattern.factory.api.IAttachmentProcessor;
import com.design.pattern.factory.impl.PDFFileAttachmentProcessor;
import com.design.pattern.factory.impl.TextFileAttacmentProcessorImpl;

public class FileProcessorFactory {

	static final EnumMap<FileType, Class<? extends IAttachmentProcessor>> enumToClass = new EnumMap<>(FileType.class);

	static {
		enumToClass.put(FileType.TEXT_FILE, TextFileAttacmentProcessorImpl.class);
		enumToClass.put(FileType.PDF_FILE, PDFFileAttachmentProcessor.class);
	}
	
	private FileProcessorFactory() {
		// Nothing to implement here..
	}

	public static IAttachmentProcessor getInstacne(FileType fileType) {
		return fileType.getInstance();
	}

}
