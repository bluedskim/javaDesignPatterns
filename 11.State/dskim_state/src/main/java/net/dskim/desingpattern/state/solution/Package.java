package net.dskim.desingpattern.state.solution;

public class Package {
  private PackageState currentState = new OrderedState();

	public void setState(PackageState newState) {
		this.currentState = newState;
	}

	public PackageState getState() {
		return this.currentState;
	}

	public String getNotifyGetterList() {
		return currentState.getNotifyGetterList();
	}
}
