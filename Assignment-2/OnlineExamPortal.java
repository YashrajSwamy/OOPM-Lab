import java.util.Scanner;

class InvalidMarksException extends Exception
{
    public InvalidMarksException(String str)
    {
        super(str);
    }
}

public class OnlineExamPortal
{
    static void checkMarks(int marks) throws InvalidMarksException
    {
        if(marks>100||marks<0)
        {
            throw new InvalidMarksException("Invalid Marks. Please Enter Valid Marks");
        }
        else
        {
            System.out.println("You have scored: "+marks+"/100");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String sName;
        int marks;

        System.out.print("Enter Student Name: ");
        sName = sc.nextLine();
        System.out.print("Enter Exam Marks: ");
        marks = sc.nextInt();

        try
        {
            checkMarks(marks);
        }
        catch(InvalidMarksException e)
        {
            System.out.println("Exception: "+e.getMessage());
        }
        finally
        {
            System.out.println("Thank you!");
        }
        sc.close();
    }
}