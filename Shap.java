class Shape
{
    private String color;
    private boolean filled;
    Shape()
    {
        color="green";
        filled=true;
    }
    Shape(String color,boolean filled)
    {
        this.color=color;
        this.filled=filled;
    }
    String getColor()
    {
        return color;
    }
    void setColor(String color)
    {
        this.color=color;
    }
    boolean isFilled()
    {
        return filled;
    }
    void setFilled(boolean filled)
    {
        this.filled=filled;
    }
}
class Circle extends Shape
{
    private double radius;
    Circle(double radius)
    {
        this.radius=radius;
    }
    Circle(double radius,String color,boolean filled)
    {
        super(color,filled);
        this.radius=radius;
    }
    double getRadius()
    {
        return radius;
    }
    void setRadius(double radius)
    {
        this.radius=radius;
    }
    double getArea()
    {
        return 3.14*radius*radius;
    }
    double getPerimeter()
    {
        return 2*radius*3.14;
    }
    void display()
    {
        System.out.println("Circle with radius "+radius+" has area "+getArea()+" and perimeter "+getPerimeter());
        System.out.println("Color: "+getColor()+" and filled: "+isFilled());
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Circle c=new Circle(5.0, "red", true);
        c.display();

    }
}
