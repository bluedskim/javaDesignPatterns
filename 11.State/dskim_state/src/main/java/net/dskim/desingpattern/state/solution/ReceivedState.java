package net.dskim.desingpattern.state.solution;

public class ReceivedState implements PackageState {
	@Override
	public String getNotifyGetterList() {
		return "orderer,manager";
	}

	@Override
	public String toString() {
		return "ReceivedState";
	}
}