package net.dskim.desingpattern.command;

/**
 * command용 interface
 */
@FunctionalInterface
public interface TextFileOperation {
	String execute();
}
