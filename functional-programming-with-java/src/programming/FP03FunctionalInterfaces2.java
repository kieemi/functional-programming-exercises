package programming;

import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;


public class FP03FunctionalInterfaces2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

//		filterAndPrint(numbers, x->x%2==0);
//		filterAndPrint(numbers, x->x%3==0);
//		filterAndPrint(numbers, x->x%2!=0);
		
		List <Integer> collectNumbers = extracted(numbers, x->x*x);

//		System.out.println(collectNumbers);
//		Supplier<Integer> randomIntegerSupplier= ()->2;
		Supplier<Integer> randomIntegerSupplier= ()->{
		Random random = new Random();
		return random.nextInt(1000);
		};
		
		System.out.println(randomIntegerSupplier.get());
		
		UnaryOperator<Integer> unaryOperator = (x)->3*x;
		
		System.out.println(unaryOperator.apply(3));
		
		BiPredicate<Integer, Integer> biPredicate = (x,y)->x/y==2;
		
		System.out.println(biPredicate.test(2, 2));
		
		BiFunction<Integer, Integer, Integer> biFunction = (x,y)-> x/y;
		
		System.out.println(biFunction.apply(4, 2));
	}

	private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {
		numbers.stream().filter(predicate).forEach(System.out::println);
	}

	
	private static List<Integer> extracted(List<Integer> numbers, Function<Integer, Integer> mapper) {
		return numbers.stream().map(mapper).collect(Collectors.toList());

	
	}
	
	
	
}

