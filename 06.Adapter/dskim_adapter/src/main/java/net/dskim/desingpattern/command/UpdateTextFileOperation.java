package net.dskim.desingpattern.command;

/**
 * 파일갱신 command
 */
public class UpdateTextFileOperation implements TextFileOperation {
	private TextFile textFile;

	public UpdateTextFileOperation(TextFile textFile) {
		this.textFile = textFile;
	}

	@Override
	public String execute() {
		return textFile.update();
	}
}
