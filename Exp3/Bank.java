import java.util.Scanner;

class BankAccount 
{
    Scanner sc = new Scanner(System.in);
    String name,accType;
    long accNo;
    double balance=0.0;
    BankAccount()
    {
        System.out.print("Enter Depositer's Name: ");
        name = sc.nextLine();
        System.out.print("Enter Account Number: ");
        accNo = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter Account Type: ");
        accType = sc.nextLine();
    }
    void depositAmt()
    {
        System.out.print("\nEnter Amount to Deposit: ");
        balance+= sc.nextDouble();
        System.out.println("Current Balance: "+balance);
    }
    void withdrawAmt()
    {
        System.out.print("\nEnter Amount to Withdraw: ");
        double amt = sc.nextDouble();
        if(amt>balance) 
        System.out.println("Insufficient Balance");
        else
		{
        balance-= amt;
		System.out.println("Current Balance: "+balance);
		}
    }
    void display()
    {
        System.out.println("\nName: "+name);
        System.out.println("Balance: "+balance);
    }
}

public class Bank
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        BankAccount ba = new BankAccount();
        int n=1;
        while(n!=0)
        {
			System.out.println("\nMain Menu:");
            System.out.println("1. Deposit Amount\n2. Withdraw\n3. Display Balance\n0. Exit");
			System.out.print("Enter Your Choice: ");
            n = sc.nextInt();
            switch(n)
            {
                case 1:
                    ba.depositAmt();
                    break;
                case 2:
                    ba.withdrawAmt();
                    break;
                case 3:
                    ba.display();
                    break;
                case 0:
                    System.out.println("Thank you for Using Our Bank");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }            
        }
        sc.close();
    }
}