import java.util.Scanner;

class stringsubsets {
public static void  printsubstring(String s)
{
  for(int i=0;i<s.length();i++)
     {
         for(int j=i+1;j<=s.length();j++)
         {
             System.out.println(s.substring(i, j));
         }
      }
}
	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     String r=s.next();
     printsubstring(r);
     }
 }