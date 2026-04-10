import java.util.Scanner;

class BankAccount
{
    int accountNumber;
    String accountHolderName;
    double balance=0.0;
    BankAccount(int accountNumber,String accountHolderName)
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    void deposit(double amount)
    {
        balance+=amount;
    }
    void withdraw(double amount)
    {
        if(amount>balance)
            System.out.println("Insufficient Balance");
        else
            System.out.println("Amount Withdrawed");
    }
    void displayBalance()
    {
        System.out.println("Balance: "+balance);
    }
}


public class BankAccountSystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int accountNumber;
        String accountHolderName;
        System.out.println("Enter Account Number: ");
        accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Account Holder Name: ");
        accountHolderName = sc.nextLine();
        BankAccount ba = new BankAccount(accountNumber,accountHolderName);

        while(true)
        {
            System.out.println("\n1.Deposit\n2.Withdraw\n3.Display Balance\n0.Exit");
            int c = sc.nextInt();
            switch(c)
            {
                case 1:
                    System.out.print("Enter Amount to Deposit: ");
                    double dep = sc.nextDouble();
                    ba.deposit(dep);
                    break;
                case 2:
                    System.out.print("Enter Amount to Withdraw: ");
                    double with = sc.nextDouble();
                    ba.withdraw(with);
                    break;
                case 3:
                    ba.displayBalance();
                    break;
                case 0:
                    System.out.println("Exiting Bank");
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}