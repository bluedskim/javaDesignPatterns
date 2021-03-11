package net.dskim.desingpattern.command;

/**
 * command 패턴을 쓰지 않는 경우 샘플 클래스
 * if-else 혹은 switch-case를 사용해야 함
 * 새로운 처리가 추가 되는 경우 이 소스를 고쳐야 함
 */
public class TextFileOperationExceutorWithoutCommand {
	String execute(TextFile textFile, String whatToDo) {
		String executeResult = null;
		switch(whatToDo) {
			case "open":
				executeResult = textFile.open();
				break;
			case "save":
				executeResult = textFile.save();
				break;
			default:
				return "unknown opeation";
		}
		return executeResult;
	}
}
