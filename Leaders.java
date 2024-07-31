public class Leaders
{
   public static void main(String args[])
   {
    int a[]={1,9,4,5,7,8,2,6,3,0};
      int i=a.length;
    for(int k=0;k<i;k++)
    {
      int temp=0;
      for(int e=k+1;e<i;e++)
      {
         if(a[k]>a[e])
         {
            temp++;
         }
      }
      if(temp==i-k-1 && temp!=0)
      {
         System.out.println("Leader:"+a[k]);
      }
    }
   } 
}
