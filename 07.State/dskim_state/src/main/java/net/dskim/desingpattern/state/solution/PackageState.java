package net.dskim.desingpattern.state.solution;

/**
 * 모든 상태객체가 구현해야하는 인터페이스
 */
public interface PackageState {
	/**
	 * 알림 수신 대상자 목록 반환
	 * @return
	 */
	public String getNotifyGetterList();
}