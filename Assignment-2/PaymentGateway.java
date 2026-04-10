import java.util.Scanner;

abstract class Payment
{
    abstract void pay(double amount);
}

class UPIPayment extends Payment
{
    void pay(double amount)
    {
        System.out.println("Successfully Paid Rs."+amount+" Using UPI");   
    }
}
class CardPayment extends Payment
{
    void pay(double amount)
    {
        System.out.println("Successfully Paid Rs."+amount+" Using Card");   
    }
}
class CashPayment extends Payment
{
    void pay(double amount)
    {
        System.out.println("Successfully Paid Rs."+amount+" Using Cash");   
    }
}

public class PaymentGateway
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Amount to Pay: ");
       double amount = sc.nextDouble();

       System.out.println("\nEnter Payment Method: \n1.UPI\n2.Card\n3.Cash\n0.To Cancel Payment");
       int n = sc.nextInt();
       switch(n)
       {
        case 1:
            UPIPayment UPI = new UPIPayment();
            UPI.pay(amount);
            break;
        case 2:
            CardPayment Card = new CardPayment();
            Card.pay(amount);
            break;
        case 3:
            CashPayment Cash = new CashPayment();
            Cash.pay(amount);
            break;
        case 0:
            System.out.println("Cancelling Payment..");
            break;
        default:
            System.out.println("Error Occurred");
       }
       sc.close();
    }
}