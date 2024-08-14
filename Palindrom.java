import java.util.Scanner;
public class Palindrom
{
	static  String per(String str,int len,String fin)
	{
	    if(len<0)
	        return "";
	    else
	    {
	        return fin+str.charAt(len)+per(str,len-1,fin);
	    }
		
	}
	public static void main(String [] args)
	{
	    System.out.println("Enter a String:");
	    Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println();
		String str2=per(str,str.length()-1,"");
		if(str.equals(str2))
		{
		    System.out.println("Palindrom");
		}
		else{
		    System.out.println("Not Palindrom");
		}
		sc.close();
	}
}
