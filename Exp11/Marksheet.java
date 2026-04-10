import java.util.Scanner;

class Student
{
    int rollNo;
    Student(int rollNo)
    {
        this.rollNo = rollNo;
    }
    void display()
    {
        System.out.println("Roll No: "+rollNo);
    }
}

class Test extends Student
{
    int Sem1_marks;
    int Sem2_marks;
    Test(int rollNo,int Sem1_marks,int Sem2_marks)
    {
        super(rollNo);
        this.Sem1_marks = Sem1_marks;
        this.Sem2_marks = Sem2_marks;
    }
    void display()
    {
        super.display();
        System.out.println("Sem 1 Marks: "+Sem1_marks);
        System.out.println("Sem 2 Marks: "+Sem2_marks);
    }
}

interface TermWork
{
    int attendance = 90,expMarks = 90;
    void getTW();
}

class Result extends Test implements TermWork
{
    int total,termWork;
    Result(int rollNo,int Sem1_marks,int Sem2_marks)
    {
        super(rollNo,Sem1_marks,Sem2_marks);
    }
    public void getTW()
    {
        termWork = attendance+expMarks;
    }
    void display()
    {
        super.display();
        total = Sem1_marks+Sem2_marks+termWork;
        System.out.println("The Total Marks of 1st Year is : "+total);
    }
}
public class Marksheet
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();
        System.out.print("Enter Sem 1 Marks: ");
        int Sem1_marks = sc.nextInt();
        System.out.print("Enter Sem 2 Marks: ");
        int Sem2_marks = sc.nextInt();
        Result r = new Result(rollNo,Sem1_marks,Sem2_marks);
        r.getTW();
        r.display();
    }
}