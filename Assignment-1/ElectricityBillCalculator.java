import java.util.Scanner;

class ElectricityBill
{
    String consumerName;
    double unitsConsumed,billAmt;
    
    ElectricityBill(String consumerName,double unitsConsumed)
    {
        this.consumerName = consumerName;
        this.unitsConsumed = unitsConsumed;
    }
    void calcBill()
    {
        if(unitsConsumed<=100)
        billAmt = unitsConsumed*5;
        else if(unitsConsumed<=300)
        billAmt = (100*5) + ((unitsConsumed-100)*7);
        else
        billAmt = (100*5)+(200*7)+((unitsConsumed-300)*10);
    }
    void display()
    {
        System.out.println("\nConsumer Name: "+consumerName);
        System.out.println("Units Consumed: "+unitsConsumed);
        System.out.println("Bill: "+billAmt);
    }
}

public class ElectricityBillCalculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String consumerName;
        double unitsConsumed;
        System.out.print("Enter Consumer Name: ");
        consumerName = sc.nextLine();
        System.out.print("Enter Units Consumed: ");
        unitsConsumed = sc.nextDouble();
        ElectricityBill eb = new ElectricityBill(consumerName,unitsConsumed);
        eb.calcBill();
        eb.display();
    }
}