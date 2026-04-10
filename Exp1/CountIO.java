public class CountIO
{
    public static void main(String[] args)
    {
        System.out.println("Count of Input: "+args.length);
        for(int i=0;i<args.length;i++)
        {
            System.out.println("Input Values of args["+i+"]: "+args[i]);
        }
    }
}