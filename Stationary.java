class Book
{
    String title,author,isbn;
    double price;
    Book()
    {
        title="Unknown Title";
        author="Unknown Author";
        isbn="000-0-00-000000-0";
        price=0;
    }
    Book(String title,String author,String isbn)
    {
        this.title=title;
        this.author=author;
        this.isbn=isbn;
        price=20;
    }
    Book(String title,String author,String isbn,double price)
    {
        this.title=title;
        this.author=author;
        this.isbn=isbn;
        this.price=price;
    }
    Book(Book bk)
    {
        this(bk.title,bk.author,bk.isbn,bk.price);
    }
    void updatePrice(double newPrice)
    {
        price=newPrice;
    }
    void displayBookInfo()
    {
        System.out.println("Title:  "+title);
        System.out.println("Author:  "+author);
        System.out.println("ISBN:  "+isbn);
        System.out.println("Price:  "+price);
    }
}
public class Stationary
{
    public static void main(String args[])
    {
        Book b1=new Book();
        Book b2=new Book("Fairy tail","Nastu Dragneel","060-0-50-700800-0");
        Book b3=new Book("Unnamed Memory","Zeref","003-0-09-030790-0",36.5);
        Book b4=new Book(b2);
        System.out.println("Default:");
        b1.displayBookInfo();
        System.out.println();
        System.out.println("Default Price:");
        b2.displayBookInfo();
        System.out.println();
        System.out.println("Parameterized:");
        b3.displayBookInfo();
        System.out.println();
        System.out.println("Copy:");
        b2.displayBookInfo();
        System.out.println();
        System.out.println("Update:");
        b4.updatePrice(50.2);
        b4.displayBookInfo();
        
    }
}
