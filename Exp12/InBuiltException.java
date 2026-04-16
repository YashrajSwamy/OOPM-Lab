import java.io.*;

public class InBuiltException 
{
    public static void main(String[] args) 
	{
		try {
            int a = 10, b = 0;
            int c = a / b;
            System.out.println(c);
        }catch (ArithmeticException e) 
		{
            System.out.println("Arithmetic Exception");
        }

        try 
		{
            FileReader f = new FileReader("abc.txt");
        }catch (IOException e) 
		{
            System.out.println("IO Exception");
        }

        try 
		{
            throw new Exception("Manual Exception");
        }catch (Exception e) 
		{
			System.out.println(e.getMessage());
        } finally 
		{
            System.out.println("Finally Block Executed");
        }
    }
}