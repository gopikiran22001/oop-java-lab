import java.util.Scanner;
public class Palindrom
{
	static  String per(String str,int len)
	{
	    if(len<0)
	        return "";
	    else
	    {
	        return str.charAt(len)+per(str,len-1);
	    }
		
	}
	public static void main(String [] args)
	{
	    System.out.println("Enter a String:");
	    Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str.toLowerCase();
		System.out.println();
		String reverse=per(str,str.length()-1);
		if(str.equals(reverse))
		{
		    System.out.println("Palindrom");
		}
		else{
		    System.out.println("Not Palindrom");
		}
		sc.close();
	}
}
