package net.dskim.desingpattern.command;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TextFileOperationExecutorWithoutCommandTest {
	@Test
	public void executeOperationTest() {
		TextFileOperationExceutorWithoutCommand textFileOperationExecutor = new TextFileOperationExceutorWithoutCommand();

		String openTextFileResult = textFileOperationExecutor.execute(new TextFile("file1.txt"), "open");
		log.info("openTextFileResult={}", openTextFileResult);
		assertEquals("Opening file file1.txt", openTextFileResult);

		String saveTextFileResult = textFileOperationExecutor.execute(new TextFile("file2.txt"), "save");
		log.info("saveTextFileResult={}", saveTextFileResult);
		assertEquals("Saving file file2.txt", saveTextFileResult);
	}
}
