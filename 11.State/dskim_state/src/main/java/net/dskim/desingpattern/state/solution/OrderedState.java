package net.dskim.desingpattern.state.solution;

public class OrderedState implements PackageState {
	@Override
	public String getNotifyGetterList() {
		return "shipper";
	}
		
	@Override
	public String toString() {
		return "OrderedState";
	}
}