package Atm;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
private int customerNumber;
private int pinNumber;
private double checkingBalance=0;
private double savingBalance=0;
Scanner input= new Scanner(System.in);
DecimalFormat moneyFormate= new DecimalFormat("'$'###,##0.00");
public int getCustomerNumber() {
	return customerNumber;
}
public void setCustomerNumber(int customerNumber) {
	this.customerNumber = customerNumber;
}
public int getPinNumber() {
	return pinNumber;
}
public void setPinNumber(int pinNumber) {
	this.pinNumber = pinNumber;
}
public double getCheckingBalance() {
	return checkingBalance;
}

public double getSavingBalance() {
	return savingBalance;
}

public double calcCheckingWithdraw(double amount) {
	checkingBalance =  (checkingBalance - amount);
	return  checkingBalance ;
	
}
public double calcSavingWithdraw(double amount) {
	savingBalance =  (savingBalance - amount);
	return savingBalance;
	
}
public double calcCheckingDeposit(double amount) {
	checkingBalance =  (checkingBalance + amount);
	return checkingBalance;
	
}
public double calcSavingDeposit(double amount) {
	checkingBalance =  (checkingBalance + amount);
	return savingBalance;
	
}
public void getCheckingWithdrawInput() {
	System.out.println("saving account balance: "+moneyFormate.format(checkingBalance));
	System.out.println(" Amount you want to withdraw from saving account:");
	double amount=input.nextDouble();
	if((checkingBalance - amount )>=0) {
		calcCheckingWithdraw(amount);
		System.out.println(" New checking account balance"+moneyFormate.format(checkingBalance));
		
			
	}else
	{
		System.out.println(" Balance cannot be Negative."+"\n");
	}
}
public void getSavingWithdrawInput() {
	System.out.println("Checking Account Balance"+moneyFormate.format(savingBalance));
	System.out.println(" Amount you want to withdraw from Checking account:");
	double amount=input.nextDouble();
	if((checkingBalance - amount )>=0) {
		calcCheckingWithdraw(amount);
		System.out.println(" New checking account balance"+moneyFormate.format(savingBalance));
		
			
	}else
	{
		System.out.println(" Balance cannot be Negative."+"\n");
	}
}

public void getCheckingDepositInput() {
	System.out.println("checking the account balance: "+moneyFormate.format(savingBalance));
	System.out.println(" Amount you want to Deposit from checking account:");
	double amount=input.nextDouble();
	if((checkingBalance + amount )>=0) {
		calcCheckingDeposit(amount);
		System.out.println(" New checking account balance"+moneyFormate.format(checkingBalance));
		
			
	}else
	{
		System.out.println(" Balance cannot be Negative."+"\n");
	}
}
public void getSavingDepositInput() {
	System.out.println("Saving Account Balance"+moneyFormate.format(savingBalance));
	System.out.println(" Amount you want to Deposit from Saving account:");
	double amount=input.nextDouble();
	if((checkingBalance + amount )>=0) {
		calcSavingDeposit(amount);
		System.out.println(" New checking account balance"+moneyFormate.format(savingBalance));
		
			
	}else
	{
		System.out.println(" Balance cannot be Negative."+"\n");
	}
}
}
