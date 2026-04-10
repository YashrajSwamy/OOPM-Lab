import java.util.Scanner;

public class GradeSwitch
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter Marks: ");
       int marks = sc.nextInt(),n; 
       
       System.out.print("Grade: ");
       if(marks<=100 && marks>=91)
       {
            n=1;
       }
        else if(marks<=90 && marks>=81)
        {
            n=2;
        }
        else if(marks<=80 && marks>=71)
        {
            n=3;
        }
        else if(marks<=70 && marks>=61)
        {
            n=4;
        }
        else 
        {
            n=0;
        }

        switch(n)
        {
            case 1:
                System.out.print("A");
                break;
            case 2:
                System.out.print("B"); 
                break;
            case 3: 
                System.out.print("C"); 
                break;
            case 4: 
                System.out.print("D"); 
                break;
            default: 
                System.out.print("F"); 
                break;
        }
    }
}