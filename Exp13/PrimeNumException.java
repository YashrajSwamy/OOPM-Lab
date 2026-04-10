import java.util.Scanner;

class PrimeNumberException extends Exception
{
    public PrimeNumberException(String str)
    {
        super(str);
    }
}
public class PrimeNumException
{
    static boolean isPrime(int n)
    {
        if(n<=1) return false;

        for(int i=2;i<=(n/2);i++)
        {
            if(n%i==0)
                return false;
        }
        
        return true;
    }
    static void factorial(int n) throws PrimeNumberException
    {
        int fact = 1;
        if(isPrime(n))
            throw new PrimeNumberException("Number is Prime");
        else
        {
            for(int i=1;i<=n;i++)
                fact*=i;
            System.out.println("Factorial: "+fact);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();
        try
        {
            factorial(n);
        }
        catch(PrimeNumberException e)
        {
            System.out.println("Exception: "+e.getMessage());
        }
        sc.close();
    }
}