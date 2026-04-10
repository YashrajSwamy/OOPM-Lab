import java.util.Scanner;

abstract class Shape
{
    abstract void area();
}

class Circle extends Shape
{
    int r;
    Circle(int r)
    {
        this.r = r;
    }
    void area()
    {
        System.out.printf("Area of Circle: %.2f\n",(Math.PI*r*r));
    }
}

class Rectangle extends Shape
{
    int l,b;
    Rectangle(int l,int b)
    {
        this.l = l;
        this.b = b;
    }
    void area()
    {
        System.out.println("Area of Rectangle: "+(l*b));
    }
}

class Triangle extends Shape
{
    int l,h;
    Triangle(int l,int h)
    {
        this.l = l;
        this.h = h;
    }
    void area()
    {
        System.out.println("Area of Triangle: "+(0.5*l*h));
    }
}
public class AbstractArea
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius of Circle: ");
        int r = sc.nextInt();
        Circle c = new Circle(r);
        c.area();

        System.out.print("Enter Length and Breadth of Rectangle: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        Rectangle re = new Rectangle(l,b);
        re.area();

        System.out.print("Enter Length and Height of Triangle: ");
        int le = sc.nextInt();
        int h = sc.nextInt();
        Triangle t = new Triangle(le,h);
        t.area();
    }
}