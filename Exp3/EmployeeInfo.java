import java.io.*;

class Employee
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String eName;
    int eNo;
    double basic,salary,TA,DA,HRA;
    
    void setData() throws IOException
    {
        System.out.print("Employee Name: ");
        eName = br.readLine();
        System.out.print("Employee Number: ");
        eNo = Integer.parseInt(br.readLine());
        System.out.print("Basic Salary: ");
        basic = Double.parseDouble(br.readLine());
        System.out.print("Travel Allowance: ");
        TA = Double.parseDouble(br.readLine());
        System.out.print("Dearness Allowance: ");
        DA = Double.parseDouble(br.readLine());
        System.out.print("House Rental Allowance: ");
        HRA = Double.parseDouble(br.readLine());
    }
    int grossSal()
    {
        salary = TA+DA+HRA+basic;
        return (int)salary;
    }
    void show()
    {
        System.out.println(eNo+" | "+eName+" | "+salary);
    }
}

public class EmployeeInfo
{
    public static void main(String[] args) throws IOException
    {
        Employee e[] = new Employee[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("\nEnter Details of Employee "+(i+1));
            e[i] = new Employee();
            e[i].setData();
            e[i].grossSal();
        }

        for(int i=0;i<5;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                if(e[i].salary<e[j].salary)
                {
                    Employee temp = e[j];
                    e[j] = e[i];
                    e[i] = temp;
                }
            }
        }
        
        System.out.println("\nEmployees Sorted");
        for(int i=0;i<5;i++)
        {
            e[i].show();
        }
    }
}