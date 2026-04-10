import java.util.Scanner;

public class RevSentence
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StringBuffer s = new StringBuffer();

        System.out.print("Enter The Sentence: ");
        s.append(sc.nextLine());

        s.reverse();

        System.out.println("Reversed Sentence: "+s);
        sc.close();
    }
}