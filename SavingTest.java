import java.util.*;
class SavingAccount
{
	
	static double anualInterestRate;
	private double savingBalance;
	private double newsavingBalance;
	private double MonthlyInt;
	SavingAccount(double savingBalance)
	{
	this.savingBalance=savingBalance;
	}

	void setInterest(double Ainterest)
	{
	anualInterestRate=Ainterest;	
	}

	void setSavingBalance(double sbalance)
	{
	savingBalance=sbalance;
	}

	void calculateMonthlyInterest()
	{
	MonthlyInt=(savingBalance*anualInterestRate/100)/12;
	newsavingBalance=savingBalance+MonthlyInt;												
	}

	static void modifyInterest(double Ainterest)
	{
	anualInterestRate=Ainterest;
	}
	void display()
	{
	System.out.println("The anualInterestrate is:"+ anualInterestRate);
	System.out.println("The saving Balance is:"+savingBalance);
	System.out.println("The Monthly Interest is:"+MonthlyInt);
	System.out.println("The new Saving Balance is:"+newsavingBalance);
	
	}
      }
class SavingTest
{
	public static void main(String [] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the anualInterestRate:");
	double a=sc.nextDouble();
	SavingAccount saver1=new SavingAccount(2000);
	SavingAccount saver2=new SavingAccount(3000);
	saver1.setInterest(a);
	saver2.setInterest(a);
        saver1.setSavingBalance(2000);
	saver2.setSavingBalance(3000);
	saver1.calculateMonthlyInterest();
	saver2.calculateMonthlyInterest();
	SavingAccount.modifyInterest(a);
	System.out.println("THE SAVING BALANCE FOR SAVER1:");
	saver1.display();
	System.out.println();
	System.out.println("THE SAVING BALANCE FOR SAVER2:");
	saver2.display();
	}
	
}
	

	