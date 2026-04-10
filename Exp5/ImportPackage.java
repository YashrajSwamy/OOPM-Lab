import ABC.Operation;  

public class ImportPackage  
{ 
    public static void main(String[] args)  
    { 

        Operation op = new Operation(); 

        int addition = op.add(50, 5);  
        System.out.println("Addition: " + addition); 

        int subtraction = op.subtract(50, 5);  
        System.out.println("Subtraction: " + subtraction); 

        int multiplication = op.multiply(50, 5);  
        System.out.println("Multiplication: " + multiplication); 

        double division = op.divide(50, 5);  
        System.out.println("Division: " + division); 
    }
}