package CW3;

public class AccountManagement {
	String name;
	int openingdate;
	int accountBalance;
	int accountNumber;
	
	void insertdata(String name,int openingdate,int accountNumber)
	{
		this.name=name;
		this.openingdate=openingdate;
		this.accountNumber=accountNumber;
		
	}
	void displaydata()
	{
		System.out.println(name+" "+openingdate+" "+accountNumber);
	}
	void depositAmount(int amount)
	{
		accountBalance=accountBalance+amount;
	}
	void withdrawAmount(int amount)
	{
		if(amount>10000)
			System.out.println("higher than limit");
		else
			accountBalance=accountBalance-amount;
	}
	void accountBalance()
	{
		System.out.println(accountBalance);
	}
}
