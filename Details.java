package test;
import java.util.*;
class Product
{
	int id;
	String sname;
	double price;
	Product(int id,	String sname,double price)
	{
		this.id=id;
		this.sname=sname;
		this.price=price;
	}
}
class Customer
{
	String custid,password,mobilenumber;		
	Customer( String password, String custid, String mobilenumber)
	{
		this.custid=custid;
		this.password=password;
		this.mobilenumber=mobilenumber;
	}
}
public class Details
{

	public static void main(String[] args)
	{
		List <Product> a=new ArrayList<Product>();
		Product p1=new Product(100,"dell",20000);
		Product p2=new Product(101,"vivo",21000);
		a.add(p1);
		a.add(p2);
		for(Product s:a)
		{
			System.out.println(s.sname+"  "+s.id+" "+s.price);			
		}
      
	    List <Customer> b=new ArrayList<Customer>();
	    Customer c1=new Customer( "AXS", "23423","123456789");
	    Customer c2=new Customer( "SDA", "36544","234567891");
	    b.add(c1);
	    b.add(c2);
	    for(Customer s:b)
		{
			System.out.println(s.custid+"  "+s.password+" "+s.mobilenumber);			
		}
	    
	}

}
