package net.dskim.desingpattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * command 패턴 샘플 invoker 클래스
 * 새로운 처리가 추가 되더라도 이 소스를 수정할 필요 없음
 */
public class TextFileOperationExecutorWithCommand {
	/**
	 * 실행 이력 저장용. 이 샘플에서는 불필요
	 */
	private final List<TextFileOperation> textFileOperations = new ArrayList<>();

	public String executeOperation(TextFileOperation textFileOperation) {
		textFileOperations.add(textFileOperation);
		return textFileOperation.execute();
	}
}
