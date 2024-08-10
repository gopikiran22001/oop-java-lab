public class Sumsub {
    public static void main(String[] args) {
        int[] a={-2,1,-3,4,1,2,1,-5,4};
        int i=a.length; 
        int final_sum=a[0];
        int  current_sum=0;
        for(int x=0;x<a.length;x++)
        {
            current_sum+=a[x];
            if(current_sum>final_sum)
            {
                final_sum=current_sum;
            }
            if(current_sum<0)
            {
                current_sum=0;
            }
        }
        System.out.println("The maximum sum of a contiguous subarray is: " + final_sum);
    }
}