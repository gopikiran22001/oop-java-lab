public class Even {
    public static void main(String[] args) {
        int i=0;
        int a[]={1,9,15,5,7,8,2,6,3,4};
    for (int s : a) {
      i++;
    }
    for(int k=0;k<i;k++) {
        for(int j=0;j<i-1;j++) {
            if(a[j+1]%2==0)
            {
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
    }
    }
for(int x=0;x<i;x++)
{
    System.out.print(a[x]+" ");
}
}
}
