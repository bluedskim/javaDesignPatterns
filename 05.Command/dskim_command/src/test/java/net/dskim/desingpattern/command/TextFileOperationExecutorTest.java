package net.dskim.desingpattern.command;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TextFileOperationExecutorTest {
	@Test
	public void executeOperationTest() {
		TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();

		String openTextFileOperationResult = textFileOperationExecutor.executeOperation(new OpenTextFileOperation(new TextFile("file1.txt")));
		log.info("openTextFileOperationResult={}", openTextFileOperationResult);
		assertEquals("Opening file file1.txt", openTextFileOperationResult);

		String saveTextFileOperation = textFileOperationExecutor.executeOperation(new SaveTextFileOperation(new TextFile("file2.txt")));
		log.info("saveTextFileOperation={}", saveTextFileOperation);
		assertEquals("Saving file file2.txt", saveTextFileOperation);
	}
}
