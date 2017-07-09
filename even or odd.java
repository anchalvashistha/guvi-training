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
