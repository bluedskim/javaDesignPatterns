package net.dskim.desingpattern.state.problem;

/**
 * 상품 객체
 */
public class Package {
	private String currentState = "OrderedState";
	public void setState(String newState) {
		this.currentState = newState;
	}
	public String getState() {
		return currentState;
	}

	/**
	 * 상품의 상태가 변경되었을 때 알려줘야 할 대상을 반환
	 * 
	 * 만약 '주문취소CancelState'라는 상태가 추가된다면 어디를 얼마나 고쳐야 할까?
	 */
	public String getNotifyGetterList() {
		switch (currentState)
		{
			case "DeliveredState":
				return "orderer";
			case "ReceivedState":
				return "orderer,manager";
			/* // CancelState 를 추가하는 경우 Package.java를 수정해야 한다.
			case "CancelState":
				return "shipper,manager";
			*/
			default:
				return "shipper";
		}
	}	
}