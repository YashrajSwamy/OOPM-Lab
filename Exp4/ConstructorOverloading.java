class ConstructorOverloader
{

    int rollNo;
    String name;

    ConstructorOverloader() {
        rollNo = 1;
        name = "Student";
    }

    ConstructorOverloader(int r) {
        rollNo = r;
        name = "Student";
    }

    ConstructorOverloader(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name+"\n");
    }
}
public class ConstructorOverloading{
    public static void main(String[] args){
        ConstructorOverloader s1 = new ConstructorOverloader();
        ConstructorOverloader s2 = new ConstructorOverloader(171);
        ConstructorOverloader s3 = new ConstructorOverloader(171, "Yashraj");

        s1.display();
        s2.display();
        s3.display();
    }
}