package net.dskim.desingpattern.state.solution;

/**
 * 상태 객체-배송완료
 */
public class DeliveredState implements PackageState {
	/**
	 * 알림 수신 대상자 목록 반환
	 */
	@Override
	public String getNotifyGetterList() {
		return "orderer";
	}

	@Override
	public String toString() {
		return "DeliveredState";
	}
}