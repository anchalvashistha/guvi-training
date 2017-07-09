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
import java.util.*;
import java.lang.*;
import java.io.*;
 class HelloWorld
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 for(int i=0; i<5; i++)
	 {
	     System.out.println("Hello");
	 }
	}
}
import java.util.*;
import java.lang.*;
import java.io.*;
 class HelloWorld
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int x,y,z;     
     Scanner r=new Scanner(System.in);
     System.out.println("Enter the first number");
     x=r.nextInt();
     System.out.println("Enter the second number");
     y=r.nextInt();
     System.out.println("Enter the third number");
     z=r.nextInt();
     if(x>y && x>z)
     System.out.println("x is the greatest number");
     if(y>x && y>z)
     System.out.println("y is the greatest number");
     else
     System.out.println("z is the greatest number");
	}
}
import java.util.*;
import java.lang.*;
import java.io.*;
 class HelloWorld
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int x,i,s=0;     
     Scanner r=new Scanner(System.in);
     System.out.println("Enter the number of natural number to be added");
     x=r.nextInt();
     int a[]=new int[x];
     for(i=0; i<x; i++)
     {
     a[i]=r.nextInt();
     s=s+a[i];
     }
     System.out.println("The sum of "+x+"is "+s);
	}
}
import java.util.*;
import java.lang.*;
import java.io.*;
 class HelloWorld
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int x,i,s=0;     
     Scanner r=new Scanner(System.in);
     System.out.println("Enter the value of x");
     x=r.nextInt();
     for(i=0; i<=x; i++)
     {
     s=s+i;
     }
     System.out.println("The sum of "+x+"is "+s);
	}
}