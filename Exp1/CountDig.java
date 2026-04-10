import java.util.Scanner;

public class CountDig
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Number: ");
        int n = sc.nextInt(),c=0;

        while(n!=0)
        {
            c++;
            n/=10;
        }
        
        System.out.println("Number Of Digits: "+c);
    }
}