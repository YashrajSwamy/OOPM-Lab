import java.util.Scanner;

public class Grade
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();
        
        System.out.print("Grade: ");
        if(marks<=100 && marks>=91)
        {
            System.out.println("A");
        }
        else if(marks<=90 && marks>=81)
        {
            System.out.println("B");
        }
        else if(marks<=80 && marks>=71)
        {
            System.out.println("C");
        }
        else if(marks<=70 && marks>=61)
        {
            System.out.println("D");
        }
        else 
        {
            System.out.println("F");
        }
    }
}