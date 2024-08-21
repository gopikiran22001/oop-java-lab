class Shape
{
    String color;
    boolean filled;
    Shape()
    {
        color="green";
        filled=true;
    }
    shape(String color,boolean filled)
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
    double radius;
    Circle(double radius)
    {
        this.radius=radius;
    }
    Circle(double radius,String color,boolean filled)
    {
        this.radius=radius;
        Shape(color,filled);
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
}
public class Shap
{
    public static void main(String[] args)
    {
        
    }
}
