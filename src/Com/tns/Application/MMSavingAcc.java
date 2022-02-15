package Com.tns.Application;

import Com.tns.Framework.SavingAcc;


public class MMSavingAcc extends SavingAcc{
	
	
	public MMSavingAcc(int AccNo,String accNm,float accBal,boolean b)
	{
		super(AccNo, accNm, accBal, b);
		
	}
	

	public void withdraw(float  isSalary)
	{
		float withdrawal = 500;
		super.withdraw(withdrawal);
	}

	@Override
	public String toString() {
		return "MMSavingAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}