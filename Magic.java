public class Magic {
    public static void main(String[] args) {
        int x=Integer.parseInt(args[0]);
        int y;
        do { 
            int z=0;
            while(x!=0)
            {
                y=x%10;
                z+=y;
                x=x/10;
                x=(int)x;
            }
            x=z;
        } while (x>9);
        if(x==1)
        {
            System.out.println("The number is a magic number.");
        }
        else
        {
            System.out.println("The number is not a magic number.");
        }
    }
}
