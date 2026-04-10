
interface Switchable
{
    void turnOn();
    void turnOff();
}
interface Connectable
{
    void connect(String wifi_name);
    void disconnect();
}

class SmartBulb implements Switchable,Connectable
{
    boolean turnedOn = false;
    String wifi = "";
    public void turnOn()
    {
        turnedOn = true;
        System.out.println("Turned On");
    }
    public void turnOff()
    {
        turnedOn = false;
        System.out.println("Turned Off");
    }
    public void connect(String wifi_name)
    {
        if(turnedOn)
        {
            wifi = wifi_name;
            System.out.println("Connected to "+wifi_name);
        }
        else
        {
            System.out.println("Turn On the SmartBulb");
        }
    }
    public void disconnect()
    {
        if(!wifi.isEmpty())
        {
            System.out.println("Disconnected "+wifi);
            wifi = "";
        }
        else
        {
            System.out.println("No Wifi Connected");
        }
    }
}
public class SmartHouse
{
    public static void main(String[] args)
    {
        SmartBulb sb = new SmartBulb();
        sb.turnOn();
        sb.connect("SIESGST-Guest");
        sb.disconnect();
        sb.turnOff();
    }
}