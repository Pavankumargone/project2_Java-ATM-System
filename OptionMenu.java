package Atm;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
	Scanner menuInput= new Scanner(System.in);
	DecimalFormat moneyFormate= new DecimalFormat("'$'###,##0.00");
	HashMap<Integer, Integer> data= new HashMap<Integer, Integer>();
	public void getLogin() throws IOException {
		int x=1;
		do {
		try {
		data.put(952141, 191904);
		data.put(989947, 71976);
		System.out.println("Welcome to the ATM Project!");
		System.out.println("Enter your custmor Number");
		setCustomerNumber(menuInput.nextInt());
		System.out.println("Enter your PIN Number");
		setPinNumber(menuInput.nextInt());
		
	}catch (Exception e) {
		System.out.println("\n"+"Invalid Character(s).only Numbers."+"\n");
		x=2;
	}
		int cn=getCustomerNumber();
		int pn=getPinNumber();
		if(data.containsKey(cn)&&data.get(cn)==pn) {
			getAccountType();
		}else
			System.out.println("\n"+" Wrong Custmer number or Pin Number"+"\n");
		}while(x==1);
	

}
public void getAccountType() {
		System.out.println(" Select the Account you want to Access:");
		System.out.println(" Type 1 - Checking Account");
		System.out.println(" Type 2 - Saving Account");
		System.out.println(" Type 3 - Exit");
		int Selection=menuInput.nextInt();
		switch (Selection) {
		case 1: 
			
			getChecking();
			break;
		case 2: 
			getSavin();
			break;
		case 3: 
		System.out.println(" Thank you for using this ATM , bye.\n");
		
			break;
			default:
				System.out.println("\n"+"Invalid Choice"+" \n");
		
		}
		
	}
public void getChecking() {
	System.out.println(" Checking Account:");
	System.out.println(" Type 1 - View the Balance");
	System.out.println(" Type 2 - Withhdraw funds ");
	System.out.println(" Type 3 - Deposit funds");
	System.out.println(" Type 4 - Exit");
	System.out.println("Choice: ");
	int Selection=menuInput.nextInt();
	switch (Selection) {
	case 1: 
		System.out.println("Checking the account balence"+moneyFormate.format(getCheckingBalance()));
		
		getAccountType();
		break;
	case 2: 
		getCheckingWithdrawInput();
		getAccountType();
		break;
	case 3: 
		getCheckingDepositInput();
		getAccountType();
		break;
	case 4: 
		System.out.println(" Thank you for using this ATM , bye.\n");
		
			break;
		default:
			System.out.println("\n"+"Invalid Choice"+" \n");
	
	}
}
public void getSavin() {
	System.out.println(" Saving Account:");
	System.out.println(" Type 1 - View the Balance");
	System.out.println(" Type 2 - Withhdraw funds ");
	System.out.println(" Type 3 - Deposit funds");
	System.out.println(" Type 4 - Exit");
	System.out.println("Choice: ");
	int Selection=menuInput.nextInt();
	switch (Selection) {
	case 1: 
		System.out.println("Checking the account balence"+moneyFormate.format(getCheckingBalance()));
		
		getAccountType();
		break;
	case 2: 
		getSavingWithdrawInput();
		getAccountType();
		break;
	case 3: 
		getSavingDepositInput();
		getAccountType();
		break;
	case 4: 
		System.out.println(" Thank you for using this ATM , bye.\n");
		
			break;
		default:
			System.out.println("\n"+"Invalid Choice"+" \n");
	
	}
}

}

