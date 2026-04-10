import java.util.Scanner;
class Student
{
    int rollNo;
    String name,grade;
    double total=0,perc;
    double a[] = new double[5];

    Student(int rollNo,String name,double a[])
    {
        this.rollNo = rollNo;
        this.name = name;
        this.a = a;
    }
    void calcResult()
    {
        for(int i=0;i<5;i++)
        total+=a[i];
        perc = (total/500)*100;

        if(perc>=75)
        grade = "Distinction";
        else if(perc<75 && perc>=60)
        grade = "First Class";
        else if(perc<60 && perc>=50)
        grade = "Second Class";
        else 
        grade = "Fail";
    }
    void display()
    {
        System.out.println("\nRoll No: "+rollNo);
        System.out.println("Name: "+name);
        System.out.println("Total: "+(int)total+"/"+500);
        System.out.println("Percentage: "+perc);
        System.out.println("Grade: "+grade);
    }
}

public class StudentResultAnalyzer
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int rollNo;
        String name;
        double a[] = new double[5];

        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
        System.out.println("Enter Marks of 5 Subjects: ");
        for(int i=0;i<5;i++)
            a[i] = sc.nextDouble();
        
        Student s = new Student(rollNo,name,a);
        s.calcResult();
        s.display();
    }
}