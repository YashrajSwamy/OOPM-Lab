import java.util.Scanner;

public class Sentence
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter The Sentence: ");
        String s = sc.nextLine();
        
        String[] words = s.split(" ");
        String lWord = "";
        for(int i=0;i<words.length;i++)
        {
            if(words[i].length()>lWord.length())
                lWord = words[i];
        }
        
        s = s.replace(" ","").toLowerCase();
        String rev = new StringBuffer(s.replace(" ", "").toLowerCase()).reverse().toString();

        System.out.println("The Longest Word: "+lWord);
        if(s.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not A Palindrome");
        
        sc.close();
    }
}