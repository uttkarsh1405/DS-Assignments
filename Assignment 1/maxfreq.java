import java.util.*;
class maxfreq
{
	public static char maxfreq(String S)
	{
		int c[]=new int[256];
		for(int i=0;i<S.length();i++)
		{
			c[S.charAt(i)]++;
		}
		int max = -1;
		char m=' ';
		for(int i=0;i<S.length();i++)
		{
			if(max<c[S.charAt(i)])
			{
				max=c[S.charAt(i)];
				m=S.charAt(i);
			}
		}
		return m;
	
	}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String S=sc.next();
	System.out.print("Maximum frequency character is " +maxfreq(S));
}
}