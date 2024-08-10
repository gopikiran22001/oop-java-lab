public class Root {
    public static void main(String[] args) {
        double x=Double.parseDouble(args[0]);
        double y=Double.parseDouble(args[1]);   
        double z =Double.parseDouble(args[2]);
        double disc=Math.sqrt(y*y-(4*x*z));
        if(disc>0)
        {
            double root1=(-y+disc)/2*x;
            double root2=(-y-disc)/2*x;
            System.out.println("The roots are Real and Distinct");
            System.out.println("The roots are: "+root1+" and "+root2);
        }
        else if(disc==0)
        {
            double root=-y/2*x;
            System.out.println("The roots are real and equal");
            System.out.println("The roots are: "+root);
        }
        else
        {
            System.out.println("The equation has Complex roots Which is not possible for this specific equation");
        }


    }
    
}
