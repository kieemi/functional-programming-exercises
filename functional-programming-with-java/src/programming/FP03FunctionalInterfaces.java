package programming;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FP03FunctionalInterfaces {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

//		filterAndPrint(numbers, x->x%2==0);
//		filterAndPrint(numbers, x->x%3==0);
//		filterAndPrint(numbers, x->x%2!=0);
		
		List <Integer> collectNumbers = extracted(numbers, x->x*x);

		
	}

	private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {
		numbers.stream().filter(predicate).forEach(System.out::println);
	}

	
	private static List<Integer> extracted(List<Integer> numbers, Function<Integer, Integer> mapper) {
		return numbers.stream().map(mapper).collect(Collectors.toList());

	
	}
	
	
	
}

