package net.dskim.desingpattern.command;

import java.util.ArrayList;
import java.util.List;

public class TextFileOperationExecutorWithCommand {
	/**
	 * 실행 이력 저장용
	 */
	private final List<TextFileOperation> textFileOperations = new ArrayList<>();

	public String executeOperation(TextFileOperation textFileOperation) {
		textFileOperations.add(textFileOperation);
		return textFileOperation.execute();
	}
}
