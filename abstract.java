package test;
abstract class Addition
{
	Addition()
	{
		System.out.println("main class");
	}
	abstract float add1(float a,float b);
	abstract float add2(float a,float b,float c);
}
 class sum extends Addition
{
	float add1(float a,float b)
	{
		return a+b;
	}
	float add2(float a,float b,float c)
	{
		return a+b+c;
	}
}


public class AbstractExample 
{

	public static void main(String[] args)
	{
		sum add = new sum();
		float value2 = add.add1(4,5);
		System.out.println(value2);
		sum add1 = new sum();
		float value1 = add.add2(34,34,65);
		System.out.println(value1);
	}

}
