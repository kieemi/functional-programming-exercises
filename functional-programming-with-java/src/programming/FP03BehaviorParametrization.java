package programming;

import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class FP03BehaviorParametrization {
	
 		
	 
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		/*
		Predicate<Integer> isEvenPredicate = x->x%2==0;
		//when we write lambda like above, instance of predicate class with this logic is created like below
		Predicate<Integer> isEvenPredicate2 = new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t%2==0;
			}
			
		};
		
		Function<Integer,Integer> squareFunction = x->x*x;
		Function<Integer,Integer> squareFunction2 = new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer t) {
				return t*t;
			}
		};
		Consumer<Integer> sysoutConsumer = System.out::println;
		Consumer<Integer> sysoutConsumer2 = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
			
		};
		
		
		numbers.stream()
			.filter(isEvenPredicate2)
			.map(squareFunction2)
			.forEach(sysoutConsumer2);
		

		 */
		BinaryOperator<Integer> accumulator = Integer::sum;
		BinaryOperator<Integer> accumulator2 = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				return t+u;
			}
			
		};

		int identity = 0;
		
		System.out.println(numbers.stream()
				.reduce(identity,accumulator2));
	}
	

}
