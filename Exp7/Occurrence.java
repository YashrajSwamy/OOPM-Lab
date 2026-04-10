import java.util.Scanner;

public class Occurrence
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter The String: ");
        String s  = sc.nextLine();

        System.out.print("Enter Character to Check: ");
        char ch = sc.nextLine().charAt(0);
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            char chr = s.charAt(i);
            if(chr==ch)
                c++;
        }

        if(c>0)
            System.out.println("Number of Occurrance of "+ch+" is "+c);
        else
            System.out.println("Character Not Found in Given String");
        
        sc.close();
    }
}