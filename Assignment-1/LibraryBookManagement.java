import java.util.Scanner;

class Book
{
    int bookId;
    String title,author;
    double price;

    void acceptDetails(Scanner sc)
    {
        System.out.print("Enter Book ID: ");
        bookId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Book Title: ");
        title = sc.nextLine();
        System.out.print("Enter Author Name: ");
        author = sc.nextLine();
        System.out.print("Enter Price: ");
        price = sc.nextDouble();
        sc.nextLine();
    }
    void display()
    {
        System.out.println("\nBook ID: "+bookId);
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
}



public class LibraryBookManagement
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Book[] b = new Book[5];
        String sTitle;
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter Details for Book "+(i+1));
            b[i] = new Book();
            b[i].acceptDetails(sc);
        }

        System.out.println("\nBook with Highest Price");
        Book max = b[0];
        for(int i=0;i<5;i++)
        {
            if(b[i].price>max.price)
            max = b[i];
        }
        max.display();

        System.out.print("Search a Book: ");
        sTitle = sc.nextLine();
        for(int i=0;i<5;i++)
        {
            if(b[i].title.equalsIgnoreCase(sTitle))
            {
                System.out.println("Found Book");
                b[i].display();
                return;
            }
        }
        System.out.println("Not Found");
    }
}