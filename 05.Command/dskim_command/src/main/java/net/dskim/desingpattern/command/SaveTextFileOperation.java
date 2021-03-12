package net.dskim.desingpattern.command;

/**
 * 파일저장 command
 */
public class SaveTextFileOperation implements TextFileOperation {
	private TextFile textFile;

	public SaveTextFileOperation(TextFile textFile) {
		this.textFile = textFile;
	}

	@Override
	public String execute() {
		return textFile.save();
	}
}
