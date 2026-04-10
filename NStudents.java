import java.util.Scanner;

public class NStudents
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter Number of Students: ");
        n = sc.nextInt();
        int s[] = new int[n];

        for(int i=0;i<n;i++)
            s[i] = sc.nextInt();
        

        int mx = s[0],mi = s[0],avg=0,a=0,b=0,c=0;
        for(int i=0;i<n;i++)
        {
            if(s[i]>mx)
                mx = s[i];
            if(s[i]<mi)
                mi = s[i];
            
            avg+=s[i];

            if(s[i]>=40)
                a++;
            else if(s[i]>=75)
                b++;
            else
                c++;
        }

        System.out.println("Highest Marks: "+mx);
        System.out.println("Lowest Marks: "+mi);
        System.out.println("Average Marks: "+(avg/n));
        System.out.println("Number of Students: ");
        System.out.println("Passed(Marks>=40): "+a);
        System.out.println("Scored Distinction(Marks>=75): "+b);
        System.out.println("Failed(Marks<40): "+c);
        sc.close();
    }
}