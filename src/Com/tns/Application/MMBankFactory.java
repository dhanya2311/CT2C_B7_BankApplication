
package Com.tns.Application;

import Com.tns.Framework.BankFactory;
import Com.tns.Framework.CurrentAcc;
import Com.tns.Framework.SavingAcc;


public  class MMBankFactory extends BankFactory
{

	public SavingAcc getNewSavingAccount(int AccNo,String accNm,float accBal, boolean	isSalaried) {
		return null;
	}
	
	public CurrentAcc getNewCurrentAccount(int AccNo,String accNm,float accBal,float creditLimit) {
		return null;
	}
	
}