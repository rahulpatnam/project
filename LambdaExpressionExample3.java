package test;
import java.util.*;
public class LambdaExpressionExample3
{

	public static void main(String[] args)
	{
	    Integer[] Numbers = {1,2,3,4,5,6,7,8,9,10};
		List<Integer> numberList = Arrays.asList(Numbers);
		numberList.stream().filter(n -> n%2==0).forEach(System.out::println);
		numberList.stream().filter(n -> n%2!=0).forEach(System.out::println);
	}

}
