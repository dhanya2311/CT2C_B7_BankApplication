package Com.tns.Application;

import Com.tns.Framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {
	private float  withdrawal;


	public MMCurrentAcc(int accNo, String accNm, float accBal,float creditLimit) {
		super(accNo, accNm, accBal);
		
	}


	public void withdraw(float creditLimit)
	{
		super.withdraw( withdrawal);
	}
	

	@Override
	public String toString() {
		return "MMCurrentAcc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}