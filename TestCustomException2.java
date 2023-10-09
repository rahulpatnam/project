package test;
import java.util.*;
class CheckNumber extends Exception
{  
CheckNumber(String s)
 {  
  super(s); 
 }  
}  
public class TestCustomException2
{
	public static void checkEvenNumber(int a) throws CheckNumber
	{
	    String s;
		if (a % 2 != 0) 
	    throw new CheckNumber (a + " is odd.");
	}
	     
	public static void main(String[] args) 
	{
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter a number ");
		 int a=s.nextInt();
		 try
	      {  
		     checkEvenNumber(a);
		     System.out.println(a + " is even.");
		   } 
		
		 catch(Exception m)
	      {
	       System.out.println("Number is : "+m);
	      }    
	}	
}
