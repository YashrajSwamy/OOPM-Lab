import java.util.Scanner;

public class MatrixOperations
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m,n,p,q;
        System.out.println("Enter Row and Column of Matrix A: ");
        m = sc.nextInt();
        n = sc.nextInt();
        System.out.println("Enter Row and Column of Matrix B: ");
        p = sc.nextInt();
        q = sc.nextInt();

        int a[][] = new int[m][n];
        int b[][] = new int[p][q];

        System.out.println("Enter Elements of Matrix A:");
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                a[i][j] = sc.nextInt();
            
        System.out.println("Enter Elements of Matrix B:");
        for(int i=0;i<p;i++)
            for(int j=0;j<q;j++)
                b[i][j] = sc.nextInt();
        
        if(m==p && n==q)
        {
            int s[][] = new int[m][n];
            for(int i=0;i<m;i++)
                for(int j=0;j<n;j++)
                    s[i][j] = a[i][j]+b[i][j];
            
            System.out.println("Sum of Matrices: ");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                    System.out.print(s[i][j]+" ");
                System.out.println();
            }
        }
        else
        System.out.println("Addition not allowed");

        if(n==p)
        {
            int prod[][] = new int[m][q];

            for(int i=0;i<m;i++)
            {
                for(int j=0;j<q;j++)
                {
                    prod[i][j] = 0;
                    for(int k=0;k<n;k++)
                    {
                        prod[i][j] += a[i][k] * b[k][j];
                    }
                }
            }

            System.out.println("Product Matrix: ");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<q;j++)
                    System.out.print(prod[i][j]+" ");
                System.out.println();
            }
        }
        else
        System.out.println("Multiplication not allowed");
    }
}