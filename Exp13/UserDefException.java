import java.util.Scanner;

class NoMatchException extends Exception
{
    public NoMatchException(String str)
    {
        super(str);
    }
}

public class UserDefException
{
    static void check(String str) throws NoMatchException
    {
        if(!str.equals("India"))
            throw new NoMatchException("String is not equal to India");
        else
            System.out.println("String is equal to India");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The String: ");
        String s = sc.nextLine();
        try
        {
            check(s);
        }
        catch(NoMatchException e)
        {
            System.out.println("Exception: "+e.getMessage());
        }
        sc.close();
    }
}