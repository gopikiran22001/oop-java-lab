public class Sumsub {
    public static int maxSub(int[] a,int k) {
        int x = a[0];
        int y = a[0];

        for (int i = 1; i < k; i++) {
            x = Math.max(a[i], x + a[i]);
            y = Math.max(y, x);
        }

        return y;
    }

    public static void main(String[] args) {
        int[] a={-2,1,-3,4,1,2,1,-5,4};
        int i=a.length; 
        int z=maxSub(a,i);
        System.out.println("The maximum sum of a contiguous subarray is: " + z);
    }
}