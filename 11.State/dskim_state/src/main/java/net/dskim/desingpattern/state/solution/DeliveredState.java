package net.dskim.desingpattern.state.solution;

public class DeliveredState implements PackageState {
	@Override
	public String getNotifyGetterList() {
		return "orderer";
	}

	@Override
	public String toString() {
		return "DeliveredState";
	}
}