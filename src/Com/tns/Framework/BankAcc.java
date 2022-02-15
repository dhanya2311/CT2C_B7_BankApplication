package Com.tns.Framework;
public abstract class BankAcc {

	protected int accNo;
	protected String accNm;
	protected float accBal;
	private float withdraw;
	private float deposit;
	
	
	
	
	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}

	public void withdraw(float accBal)
	{
		if (accBal >= withdraw) {
			System.out.println(accNo + " " + accNm + " " + " withdrawn :" + " " + withdraw);
			accBal -= withdraw;
			System.out.println("Balance after withdrawal:" + accBal);
		} else {
			System.out.println(accNm + " you cannot withdraw " + withdraw);
		}
	}
	
	public void deposit(float accBal)
	{
		System.out.println(accNm + " deposited :" + deposit);
		accBal += deposit;
		System.out.println("Balance after deposit: " + accBal);
	}

	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}