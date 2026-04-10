public class Fibonacci
{
    public static void main(String[] args)
    {
        if(args.length==0)
        {
            System.out.print("No Argument Passed!");
        }
        else 
        {
            int n = Integer.parseInt(args[0]),a=0,b=1,c=0;
            System.out.print("Fibonacci Series: "+a+","+b);
            for(int i=3;i<=n;i++)
            {
                c = a+b;
                System.out.print(","+c);
                a = b;
                b = c;
            }
        }
    }
}