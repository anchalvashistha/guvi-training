import java.util.*;
import java.lang.*;
import java.io.*;
 class HelloWorld
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,count=0;     
     Scanner r=new Scanner(System.in);
     System.out.println("Enter the number");
     n=r.nextInt();
     int d=n;
     while(n!=0)
     {
         count++;
         n=n/10;
     }
     System.out.println("The number of digits in "+d+" is "+count);
	}
}