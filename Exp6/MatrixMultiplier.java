import java.util.Scanner;

public class MatrixMultiplier
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m,n,p,q;
        System.out.println("Enter Number of Rows and Columns of Matrix A: ");
        m = sc.nextInt();
        n = sc.nextInt();
        System.out.println("Enter Number of Rows and Columns of Matrix B: ");
        p = sc.nextInt();
        q = sc.nextInt();

        if(n==p)
        {
            int a[][] = new int[m][n];
            int b[][] = new int[p][q];
            System.out.println("Enter Elements of Matrix A: ");
            for(int i=0;i<m;i++)
                for(int j=0;j<n;j++)
                    a[i][j] = sc.nextInt();
            
            System.out.println("Enter Elements of Matrix B: ");
            for(int i=0;i<p;i++)
                for(int j=0;j<q;j++)
                    b[i][j] = sc.nextInt();
            
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
            System.out.println("Matrix Multiplication Not Possible");
    }
}