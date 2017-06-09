import java.io.*;
import java.util.*;
class Ly
{
 public static void main(String args[])
{
 Scanner s=new Scanner(System.in);
 System.out.println("enter the year:");
 int a=s.nextInt();
 if(a%4==0)
{
System.out.println("entered year is leap year"+" "+a);
}
else 
{
System.out.println("entered year is not a leap year"+" "+a);
}
}
}
