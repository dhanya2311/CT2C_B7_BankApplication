package Com.tns.Framework;

public abstract class CurrentAcc extends BankAcc {
	

	public CurrentAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
	}



	private float creditLimit;
	
	
	public void withdraw(float creditLimit)
	{
		
	}

	
	
	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}