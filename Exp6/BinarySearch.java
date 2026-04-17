import java.util.Scanner;

public class BinarySearch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        int low = 0,high = 9,mid;
        boolean found = false;
        
        System.out.println("Enter Elements in Sorted Order: ");
        for(int i=0;i<10;i++)
            a[i] = sc.nextInt();
        
        System.out.print("Enter Target Element To Search: ");
        int target = sc.nextInt();

        while(low<=high)
        {
            mid = (low+high)/2;

            if(target<a[mid])
                high = mid-1;
            else if(target>a[mid])
                low = mid+1;
            else
            {
                System.out.println("Target Found at "+mid+" Position");
                found = true;
                break;
            }
        }
        if(!found)
            System.out.println("Target Not Found");
    }
}