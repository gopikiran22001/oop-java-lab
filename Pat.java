import java.util.Scanner;
class Patient{
    String name;
    double height,weight;
    Patient(String name,double height,double weight)
    {
        this.name=name;
        this.height=height;
        this.weight=weight;
    }
    double BMI()
    {
        double bmi=(weight/(height*height))*703;
        return bmi;
    }
}
public class Pat
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Patient Name:");
        String name=sc.nextLine();
        System.out.println("Enter Patient height:");
        double height=sc.nextDouble();
        System.out.println("Enter Patient weight:");
        double weight=sc.nextDouble();
        Patient p=new Patient(name,height,weight);
        System.out.println("BMI of patient:"+p.BMI());
    }
}
