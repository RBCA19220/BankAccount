package practice;
import java.util.*;

public class BankAccount {
	String accholdername;
	String Bankname;
	int accbal;
	int accno;
	int addmoney;
	
	BankAccount()
	{
		accholdername="Shivesh";
	    Bankname= "SBI";
		accbal=1000;
		accno=1256;
	}
	void deposit()
	{
		System.out.println("How much balance you need to add ? : ");
		Scanner scan = new Scanner(System.in);
		addmoney = scan.nextInt();
		accbal = accbal + addmoney;
	}
	void displaydetails()
	{
		System.out.println("The account details: ");
		System.out.println("Bank Name: " + Bankname);
		System.out.println("Account holder name: " + accholdername);
		System.out.println("Account Balance: " + accbal);
		System.out.println(" \n ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba = new BankAccount();
		ba.displaydetails();
		ba.deposit();
		ba.displaydetails();
	}
}
