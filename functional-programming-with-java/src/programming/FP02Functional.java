package programming;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class FP02Functional {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");
		List<Integer> doubleNumbers = createListWithEvenNumbersFilteredFromTheNumbersList(numbers);
		
		System.out.println(createListWithLengthsOfAllCoursesTitles(courses));
		
//		int sum = addListFunctional(numbers);
		int max = returnMaximumNumberFromList(numbers);
		
//		System.out.println(sumOfOddNumbersInList(numbers));
//		prinDistinctSortedNumbers(numbers);
//		printByLengthOfCourseSortedCourses(courses);
	}


	private static int addListFunctional(List<Integer> numbers) {

	return numbers.stream()
	//combine into one result
	//.reduce(0,(x,y)->x+y); it initialize adding with 0, then does acumulation in loop like it was x+=y
	// or use build method in Integer class
	.reduce(0, Integer::sum);
	}
	
	private static int returnMaximumNumberFromList(List<Integer> numbers) {
	return numbers.stream()
	.reduce(Integer.MIN_VALUE, (x,y)->x>y?x:y); // if x is bigger than y, than x become y
	}
	
	private static int returnMinimumNumberFromList(List<Integer> numbers) {
	return numbers.stream()
	.reduce(Integer.MAX_VALUE,(x,y)->x<y?x:y);
	}
	
	private static int returnSumOfSquaresFromNumbersList(List<Integer> numbers) {
	return numbers.stream()
	.map(x->x*x)//first we calculate squares of all elements
	.reduce(0,Integer::sum);//then we add them up
	}
	
	private static int sumOfOddNumbersInList(List<Integer> numbers) {
	return numbers.stream()
	.filter(x->x%2!=0)//first we check if number is odd
	.reduce(0,Integer::sum);//then we add them up
	}
	
	private static void prinDistinctNumbers(List<Integer> numbers) {
	numbers.stream()
	.distinct()//filters only distinct numbers
	.forEach(System.out::println);//display them on on screen
	}
	
	private static void prinSortedNumbers(List<Integer> numbers) {
	numbers.stream()
	.sorted()//sort all numbers
	.forEach(System.out::println);//display them on on screen
	}
	
	private static void prinDistinctSortedNumbers(List<Integer> numbers) {
	numbers.stream()
	.sorted()//sort all numbers
	.distinct()//filters only distinct numbers
	.forEach(System.out::println);//display them on on screen
	}
	
	private static void printSortedCourses(List<String> courses) {
	courses.stream()
	.sorted()
	.forEach(System.out::println);
	}
	
	private static void printReverseSortedCourses(List<String> courses) {
	courses.stream()
	.sorted(Comparator.reverseOrder())
	.forEach(System.out::println);
	}
	
	private static void printByLengthOfCourseNameSortedCourses(List<String> courses) {
	courses.stream()
	.sorted(Comparator.comparing(str->str.length()))
	.forEach(System.out::println);
	}
	
	private static List<Integer> doubleNumbers(List<Integer> numbers) {
		return numbers.stream()
		.map(x->x*x)
		.collect(Collectors.toList());
	}
	
	private static List<Integer> createListWithEvenNumbersFilteredFromTheNumbersList(List<Integer> numbers){
		return numbers.stream()
		.filter(x->x%2==0)
		.collect(Collectors.toList());
	}
	
	private static List<Integer> createListWithLengthsOfAllCoursesTitles(List<String> courses){
		return courses.stream()
		.map(x->x.length())
		.collect(Collectors.toList());
	}
}
