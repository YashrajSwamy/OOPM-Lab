import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.print("Enter Number 1: ");
            int a = sc.nextInt();
            System.out.print("Enter Number 2: ");
            int b = sc.nextInt();
            sc.nextLine();

            double result;

            System.out.print("Enter Operation to Perform (+, -, *, /, E to exit): ");
            char c = sc.nextLine().charAt(0);
            switch(c)
            {
                case '+':
                    result = a+b;
                    System.out.println("Sum: "+result);
                    break;
                case '-':
                    result = a-b;
                    System.out.println("Difference: "+result);
                    break;
                case '*':
                    result = a*b;
                    System.out.println("Product: "+result);
                    break;
                case '/':
                    if(b==0)
                        System.out.println("Division Not Possible");
                    else
                    {
                        result = a/(double)b;
                        System.out.println("Division: "+result);
                    }
                    break;
                case 'E':
                    System.out.println("Exiting....");
                    return;
                default:
                    System.out.println("Enter a Valid Operation: ");
            }
            System.out.println();
        }
    }
}