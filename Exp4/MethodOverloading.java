class MethodOverloader
{
    int l,b;
    double r,h;
    void area(double r)
    {
        System.out.printf("Area of Circle (r = 5.0): %.2f\n",Math.PI*r*r);
    }
    void area(int l,int b)
    {
        System.out.println("Area of Rectangle (l = 10,b = 20): "+l*b);
    }
    double area(double l,double h)
    {
        return 0.5*l*h;
    }
}
public class MethodOverloading
{
    public static void main(String[] args)
    {
        MethodOverloader mo = new MethodOverloader();
        mo.area(5.0);
        mo.area(10,20);
        System.out.printf("Area of Triangle (l = 2.5, h = 8.5): %.2f",mo.area(2.5,8.5));
    }
}