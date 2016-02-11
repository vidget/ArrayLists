import java.util.ArrayList;
import java.util.List;


public class App {

	public static void main(String[] args) {
		
		//Non-primative types only you must use Integer instead of int
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(30);
		numbers.add(36);
		numbers.add(104);
		
		//Retrieving
		System.out.println(numbers.get(0));
		
		System.out.println("\nIteration #1: ");
		//Indexed for loop iteration
		
		for(int i=0;i<numbers.size();i++)
		{
			System.out.println(numbers.get(i));
		}
		
		
		//iterating through the list another way
		System.out.println("\nIteration #2: ");
		for(Integer value: numbers)
		{
			System.out.println(value);
		}
		
		
		//removing items - becarefull--removes the last item from the list
		numbers.remove(numbers.size()-1);
		
		//This is very slow -- removing the first element of the Arraylist
		numbers.remove(0);
		
		System.out.println("\nIteration #3: ");
		for(Integer value: numbers)
		{
			System.out.println(value);
		}
		
		//List interface....
		List<String> values = new ArrayList<String>();
		
	}

}
