import java.util.*;
class HelloWorld
{
     public static void main(String []args)
     {
     int x;     
     Scanner r=new Scanner(System.in);
     x=r.nextInt();
     if(x>0)
     System.out.println("Positive");
     else if(x<0)
     System.out.println("Negative");
     else
     System.out.println("Zero");
     }
}
import java.util.*;
import java.lang.*;
import java.io.*;
class HelloWorld
{
     public static void main(String []args)
     {
     int x;     
     Scanner r=new Scanner(System.in);
     x=r.nextInt();
     if(x%2==0)
     System.out.println("Even");
     else
     System.out.println("Odd");
     }
}
import java.util.*;
import java.lang.*;
import java.io.*;
class HelloWorld
{
     public static void main(String []args)
     {
     char x;     
     Scanner r=new Scanner(System.in);
     x=r.next().charAt(0);
     if(x=='A' || x=='E' || x=='I' || x=='O' || x=='U')
     System.out.println("Vowel");
     else
     System.out.println("Consonant");
     }
}
import java.util.*;
import java.lang.*;
import java.io.*;
class HelloWorld
{
     public static void main(String []args)
     {
     char x;     
     Scanner r=new Scanner(System.in);
     x=r.next().charAt(0);
     if(x>='a'&&x<='z' || x>='A'&&x<='Z')
        System.out.println("Alphabet");
     else
     System.out.println("Not an alphabet ");
     }
}
import java.util.*;
import java.lang.*;
import java.io.*;
 class HelloWorld
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int x;     
     Scanner r=new Scanner(System.in);
     System.out.println("Enter the year");
     x=r.nextInt();
     if(x%4==0 && (x%100!=0 || x%400==0))
     System.out.println("Leap year");
     else
     System.out.println("Not a leap year");
	}
}