package net.dskim.desingpattern.state.solution;

public class Package {
	private PackageState currentState = new OrderedState();

	public void setState(PackageState newState) {
		this.currentState = newState;
	}

	public PackageState getState() {
		return this.currentState;
	}

	/**
	 * 상태 변경시 알려줄 대상 목록 반환
	 * @return
	 */
	public String getNotifyGetterList() {
		return currentState.getNotifyGetterList();
	}
}
