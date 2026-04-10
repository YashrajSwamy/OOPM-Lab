
class Vehicle
{
    String brand = "TATA";
    void showDetails()
    {
        System.out.println("This is a vehicle");
    };
}

class Car extends Vehicle
{
    void showDetails()
    {
        System.out.println("\nThis is a car");
        System.out.println("Brand: "+super.brand);
    }
}
class Bike extends Vehicle
{
    void showDetails()
    {
        System.out.println("\nThis is a Bike");
        System.out.println("Brand: "+super.brand);
    }
}
class Truck extends Vehicle
{
    void showDetails()
    {
        System.out.println("\nThis is a Truck");
        System.out.println("Brand: "+super.brand);
    }
}

public class VehicleDetails
{
    public static void main(String[] args)
    {
        Car c = new Car();
        Bike b = new Bike();
        Truck t = new Truck();
        c.showDetails();
        b.showDetails();
        t.showDetails();
    }
}