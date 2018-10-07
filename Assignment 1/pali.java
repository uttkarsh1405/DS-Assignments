import java.util.Scanner;
class pali {
public static boolean palindrome(String s)
{
    int i=0;
        String r="";

     int a=s.length();
    for(i=a;i>0;i--)
     {
         r=r+s.charAt(i-1);
     }
     
     if(r.equals(s))
     {
        return true;
     }
     else
{
    return false;
}
}

     public static void main(String[] args) {
     Scanner t=new Scanner(System.in);

     String r=t.next();
    System.out.println(palindrome(r));
     
     }
}