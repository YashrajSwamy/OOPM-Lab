import java.util.Scanner;

public class PasswordStrengthChecker
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String pass;

        System.out.print("Enter Password to Check: ");
        pass = sc.nextLine();

        int n = pass.length();
        boolean upperC=false,digit=false,specialC=false;

        if(n<8)
            System.out.println("Password needs to be longer than 8 characters");

        for(int i=0;i<n;i++)
        {
            char c = pass.charAt(i);
            if(Character.isUpperCase(c))
                upperC = true;
            else if(Character.isDigit(c))
                digit = true;
            else if(!Character.isLetterOrDigit(c))
                specialC = true;
        }

        if(upperC && digit && specialC)
            System.out.println("Strong Password");
        else
        {
            System.out.println("Weak Password");
            System.out.println("Tips: ");
            if(!upperC)
                System.out.println("Add atleast 1 Uppercase Character");
            if(!digit)
                System.out.println("Add atleast 1 Digit");
            if(!specialC)
                System.out.println("Add atleast 1 Special Character");
        }
    }
}