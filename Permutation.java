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
	    System.out.println("Enter a String:");
	    Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		per(str," ");
		sc.close();
	}
}
