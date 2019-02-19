package com.design.pattern.factory.api;

import java.io.File;
import java.util.Optional;

public interface IAttachmentProcessor {

	void proces(File file);

	default void cleanup(final File file) {
		if (Optional.ofNullable(file).isPresent()) {
			String abs_path = file.getAbsolutePath();
		}
	}
}
