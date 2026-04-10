import java.util.Scanner;

public class Armstrong
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Number: ");
        int n = sc.nextInt(),dig,sum=0,oNum,c=0;

        oNum = n;
        while(n!=0)
        {
            c++;
            n/=10;
        }
        n = oNum;
        while(n!=0)
        {
            dig = n%10;
            sum+= (int)Math.pow(dig,c);
            n/=10;
        }
        if(oNum==sum)
        {
            System.out.println("It is an Armstrong Number");
        }
        else
        {
            System.out.println("Not an Armstrong Number");
        }
		sc.close();
    }
}