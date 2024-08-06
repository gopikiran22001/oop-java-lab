public class Bit {
    public static void main(String[] args) {
        int x=Integer.parseInt(args[0]);
        int y,z=0;
        while (x!=0) {
            y=x%2;
            z+=y;
            x/=2;
            x=(int)x;
        }
        System.out.println("Set Bits of the given number:"+z);
    }
}
