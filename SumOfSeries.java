import java.util.Scanner;
public class SumOfseries
{
        static int sum(int x)
    {
        if(x<=0)
        {
            return 0;
        }
        else if(x==1)
        {
            return 1;
        }
        else
        {
            return x+sum(x-1);
        }
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a Number:");
       int x=sc.nextInt();
       int y=sum(x);
       System.out.println("Sum from 1 to "+x+" is:"+y);
       sc.close();
    }
}
