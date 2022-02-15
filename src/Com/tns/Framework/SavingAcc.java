package Com.tns.Framework;


public abstract class SavingAcc extends BankAcc {
	
	private boolean isSalary;
	
	
	
	public SavingAcc(int AccNo,String accNm,float accBal,float creditLimit) {
		super(AccNo, accNm, creditLimit);
		this.isSalary = isSalary;
	}

	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaray) {
		super(accNo, accNm, accBal);
		this.isSalary = isSalary;
	}

	public void withdraw(float isSalary)
	{
		
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + "]";
	}
}
