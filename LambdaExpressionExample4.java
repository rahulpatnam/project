package test;
import java.util.*;
interface Test1<T>
{
 T function(T a);
}


public class LambdaExpressionExample4
{

 public static void main( String[] args ) 
 {
     Test1<Integer> factorial = (n) -> {

         int result = 1;
         for (int i = 1; i <= n; i++)
         result = i * result;
         return result;
     };

     System.out.println("factorial of number = " + factorial.function(6));
        
     List<Integer> nums = Arrays.asList(12,-6); 
     Optional<Integer> max = nums.stream().max((x, y) -> x.compareTo(y));
     System.out.println("Largest number is: " + max.orElse(null));
 
 }
}


