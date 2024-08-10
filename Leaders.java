public class Leaders
{
    public static void main(String[] args) {
        int[] a={7, 1, 5, 3, 6, 4};
        int max_ele=a[a.length-1];
        for(int x=a.length-2;x>=0;x--)
        {
            if(a[x]>max_ele)
            {
                System.out.println("Leader:"+a[x]);
                max_ele=a[x];
            }
        }
    }
}
