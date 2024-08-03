public class Even {
    public static void main(String[] args) {
    
int[] a={3,2,6,4,5,9,8,7,4,52};
int[] new_array=new int[a.length];
int even_index=0,odd_index=a.length-1;
for(int x=0;x<a.length;x++)
{
    if(a[x]%2==0)
    {
        new_array[even_index]=a[x];
        even_index++;
    }
    else
    {
        new_array[odd_index]=a[x];
        odd_index--;
    }
}
for(int i=0;i<a.length;i++)
{
    System.out.print(new_array[i]+" ");
}
    }
    
}
