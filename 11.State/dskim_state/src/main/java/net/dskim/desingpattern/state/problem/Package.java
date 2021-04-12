package net.dskim.desingpattern.state.problem;

/**
 * 만약 '반품refund'이라는 상태가 추가된다면 어디를 고쳐야 할까
 */
public class Package {
	private String currentState = "OrderedState";
	public void setState(String newState) {
		this.currentState = newState;
	}
	public String getState() {
		return currentState;
	}
	public String getNotifyGetterList() {
		switch (currentState)
		{
			case "DeliveredState":
				return "orderer";
			case "ReceivedState":
				return "orderer,manager";
			default:
				return "shipper";
		}
	}	
}