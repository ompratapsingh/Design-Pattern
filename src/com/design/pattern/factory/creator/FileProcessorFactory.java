package com.design.pattern.factory.creator;

import com.design.pattern.factory.api.FileType;
import com.design.pattern.factory.api.IAttachmentProcessor;

public class FileProcessorFactory {

	private FileProcessorFactory() {
		// Nothing to implement here..
	}

	public static IAttachmentProcessor getInstacne(FileType fileType) {
		return fileType.getInstance();
	}

}
