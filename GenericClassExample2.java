package test;

class Box <E>
{	
	public static <E> void set(E length, E breadth)
	{
		System.out.print("The value in integers"+length +" "+ breadth );
		System.out.println();
		System.out.print("The value in double"+length +" "+ breadth );
		System.out.println();
	}	
	E get() 
	{
		return null;		
	}	
}

public class GenericClassExample2 
{

	public static void main(String[] args)
	{
		Box <Integer> s=new Box<Integer>();
		Box.set(10,20);
		Box <Double> s1=new Box<Double>();
		Box.set(10.63,23.6);

	}

}
