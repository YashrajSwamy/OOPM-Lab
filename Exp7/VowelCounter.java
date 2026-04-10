import java.util.Scanner;

class VowelCounter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The String: ");
        String s = sc.nextLine();
        s = s.toLowerCase();
        
        int c = 0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                c++;
        }

        if(c>0)
            System.out.println("Number of Vowels: "+c);
        else
            System.out.println("No Vowel Present");
        
        sc.close();
    }
}