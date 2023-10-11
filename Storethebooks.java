package test;
import java.util.*;
class Book
{
	int id,quantity;    
	String name,author,publisher; 	   
    Book(int id, String name, String author, String publisher, int quantity)
	{    
	    this.id = id;    
	    this.name = name;    
	    this.author = author;    
	    this.publisher = publisher;    
	    this.quantity = quantity;  
    }
}
public class Storethebooks 
{

	public static void main(String[] args) 
	{
		 Map<Integer,Book> map=new TreeMap<Integer,Book>();       
		    Book b1=new Book(101,"one piece","oda","Shueisha",516600000);    
		    Book b2=new Book(102,"dr.stone","Boichi, Riichiro Inagaki","Shueisha",15000000);    
		    Book b3=new Book(103,"jjk","Gege Akutami"," Shueisha",12000000);      
		    map.put(1,b1);  
		    map.put(2,b2);  
		    map.put(3,b3);  
		    for(Map.Entry<Integer, Book> entry:map.entrySet())
		    {    
		       // int key=entry.getKey();  
		        Book b=entry.getValue();  
		        //System.out.println(key+" Details:");  
		        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
		    }    

	}

}
