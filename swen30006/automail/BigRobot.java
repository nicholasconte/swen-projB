package automail;

import strategies.IMailPool;

public class BigRobot extends Robot {
	
	private int MAX_CAPACITY = 6;

	public BigRobot(IMailDelivery delivery, IMailPool mailPool) {
		super(delivery, mailPool);
		super.tube = new StorageTube(this.MAX_CAPACITY);
	}
	
	

}
