class Product
{
    int id,quantity;
    String name;
    double price;
    Product(int id,String name,double price,int quantity)
    {
        this.id=id;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    Product(int id,String name,double price)
    {
        this.id=id;
        this.name=name;
        this.price=price;
        quantity=0;
    }
        Product(int id,String name)
    {
        this.id=id;
        this.name=name;
        price=0;
        quantity=0;
    }
    void addstock(int quantity)
    {
        this.quantity+=quantity;
    }
    void addstock(int quantity,double disc)
    {
        this.quantity+=quantity;
        price-=(price*disc/100);
    }
    void sellstock(int quantity)
    {
        this.quantity-=quantity;
    }
    void sellstock(int quantity,double disc)
    {
        this.quantity-=quantity;
        price-=(price*disc/100);
    }
    void display()
    {
        System.out.println("ProductID: "+id);
        System.out.println("Product Name: "+name);
        System.out.println("Product Quantity: "+quantity);
        System.out.println("Product Price: "+price);
        System.out.println();
    }
}
public class Store
{
    public static void main(String[] args)
    {
        Product p1=new Product(1,"Pens",5,100);
        Product p2=new Product(2,"Books",45);
        Product p3=new Product(3,"Clip Pad");
        p1.display();
        p2.display();
        p3.display();
        p3.addstock(60);
        p3.display();
        p2.addstock(100,9.2);
        p2.display();
        p1.sellstock(20);
        p1.display();
        p2.sellstock(30,8.9);
        p2.display();
    }
}
