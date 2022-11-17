import java.util.Scanner;
class BankAccount
{
	int accno;
	double balance;
	Scanner sc= new Scanner(System.in);
	
	BankAccount(int a, double b)
	{
		this.accno=a;
		this.balance=b;
	}

	void withdraw() throws Exception
	{
		double amt;
		System.out.println("Enter the amount you want to withdraw");
		amt=sc.nextDouble();
		if(balance>=amt)
		{
			balance=balance-amt;
			System.out.println("Balance after withdrawl: "+ balance);
		}
		else 
		{
			throw new Exception("Insufficient balance!!");
		}
	}
	void deposit()
	{
		long amt;
		System.out.println("Enter the amount you want to deposit: ");
		amt=sc.nextLong();
		if(amt>0)
		{
			balance=balance+amt;
			System.out.println("The balance amounnt is: " + balance);
		}
		else
		{
			System.out.println("Invalid amount");
		}
	}
	void show()
	{
		System.out.println("The account number is: "+ accno);
		System.out.println("Balance : "+ balance);
	}
	
}
class Question_2
{
	public static void main(String args[])
	{
		BankAccount ba=new BankAccount(1234, 10000);
		Scanner sc= new Scanner(System.in);
		ba.show();
		ba.deposit();
		ba.show();
		
		try
		{
			ba.withdraw();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		ba.show();
	}
}

		
			
		
	
	