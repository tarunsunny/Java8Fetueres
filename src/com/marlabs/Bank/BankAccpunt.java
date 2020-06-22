package com.marlabs.Bank;

public class BankAccpunt {
int	balance;
int	previoustrancation;
String customerName;
String 	customerId;
void deposit(int amount)
{
	if(amount!=0)
	{
		balance = balance + amount;
		previoustrancation=amount;
	}
}
void withdraw(int amount)
{
	balance=balance-amount;
	previoustrancation=-amount;
}
	

}
