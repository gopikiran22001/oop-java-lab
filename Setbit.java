public class Setbit {
    public static void main(String[] args) {
        int x=Integer.parseInt(args[0]);
        int z=0;
        while(x>0)
        {
            z+=(x&1);
            x=x>>1;
        }
        System.out.println("Number of set bits:"+z);
    }
}
