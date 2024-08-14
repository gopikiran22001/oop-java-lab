import java.util.Scanner;
public class Permutation
{
	static  void per(String str,String ans)
	{
		if(str.length()==0)
		{
			System.out.println(ans+" ");
			return;
		}
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			String ros=str.substring(0,i)+str.substring(i+1);
			per(ros,ans+ch);
		}
	}
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=sc.nextLine();
		System.out.println();
		per(str," ");
		sc.close();
	}
}
