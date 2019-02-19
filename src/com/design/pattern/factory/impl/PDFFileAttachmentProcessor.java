package com.design.pattern.factory.impl;

import java.io.File;

import com.design.pattern.factory.api.IAttachmentProcessor;

public class PDFFileAttachmentProcessor implements IAttachmentProcessor{

	@Override
	public void proces(File file) {
		System.out.println("Pdf file processor...");
	}
}	
