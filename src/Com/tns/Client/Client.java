package Com.tns.Client;

import Com.tns.Application.MMBankFactory;
import Com.tns.Application.MMCurrentAcc;
import Com.tns.Application.MMSavingAcc;
import Com.tns.Framework.BankFactory;
import Com.tns.Framework.CurrentAcc;
import Com.tns.Framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
	BankFactory bf=new MMBankFactory();
	SavingAcc sa=new MMSavingAcc(218052, "Dhanya", 1000, true);
	CurrentAcc ca=new MMCurrentAcc(218053,"deepa",2000,25000);
	
	sa.deposit(3000);
	ca.withdraw(15000);
	ca.deposit(40000);
	//System.out.println(ca.toString());
	
	
	
	}

}