
import java.util.Scanner;

class BankAccount
{double bal=5000;
 void withdraw(double wamount)
  {if (wamount>bal) System.out.println("Not enough balance.");
  else
   {bal=bal-wamount;
    System.out.println("Amount successfully withdrawn. \n");}
  }
 void deposit(double damount)
  {bal=bal+damount;
   System.out.println("Amount successfully deposited. \n");}
 void checkBalance()
  {System.out.println("Your total bank balance is Rs."+bal);}
  }


public class ATMinterface 
{public static void main(String args[])
	{Scanner sc=new Scanner(System.in);
	 BankAccount acc=new BankAccount();
	 int user;
	 do{
		 System.out.println("Enter, \n1- to withdraw amount \n2- to deposit amount \n3- to check balance \n4- to exit");
		 user=sc.nextInt();
		 switch(user)
		  { case 1:
			    System.out.println("Enter amount to withdraw: ");
		        double wamt=sc.nextDouble();
		        acc.withdraw(wamt); break;
		   case 2:
			    System.out.println("Enter amount to deposit: ");
			    double damt=sc.nextDouble();
		        acc.deposit(damt); break;
		   case 3:
			   acc.checkBalance(); break;
		   case 4:
			   System.out.println("Exiting."); break;
		   default:
			   System.out.println("Invalid input."); break;
		  } 
		 System.out.println();
		} while(user!=4);
	 sc.close();    
	     }
	   }
