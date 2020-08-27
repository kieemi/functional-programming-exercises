package programming;

import java.util.List;

public class FP01Functional {
	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");
//		printAllEvenInListFunctional(numbers);
//		printAllOddInListFunctional(numbers);
//		printAllCoursesInListFunctional(courses);
//		printFilteredCoursesInListFunctional(courses);
//		printFilteredCoursesByLenghtInListFunctional(courses);
//		printSquaresForEvenNumbers(numbers);
//		printSquaresForOddNumbers(numbers);
		printNumberOfCharactersInEachCourseName(courses);

	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		// what to do?
		// convert list of number into stream of numbers
		numbers.stream()// convert Array into stream and then call foreach on every element
				.forEach(System.out::println);// we call Class::method and this is a method refference
	}

	private static void printAllEvenInListFunctional(List<Integer> numbers) {
		// what to do?
		// convert list of number into stream of numbers
		numbers.stream()// convert Array into stream and then call foreach on every element
				.filter(number -> number % 2 == 0)// filter - only allow even numbers, as lambda
				.forEach(System.out::println);// we call Class::method and this is a
												// method refference
	}

	private static void printAllOddInListFunctional(List<Integer> numbers) {
		// what to do?
		// convert list of number into stream of numbers
		numbers.stream()// convert Array into stream and then call foreach on every element
				.filter(number -> number % 2 != 0)// filter - only allow even numbers, as lambda
				.forEach(System.out::println);// we call Class::method and this is a
												// method refference
	}

	private static void printAllCoursesInListFunctional(List<String> courses) {
		// what to do?
		// convert list of number into stream of numbers
		courses.stream()// convert Array into stream and then call foreach on every element
				.forEach(System.out::println);// we call Class::method and this is a
												// method refference
	}

	private static void printFilteredCoursesInListFunctional(List<String> courses) {
		// what to do?
		// convert list of number into stream of numbers
		courses.stream().filter(course -> course.contains("Spring"))// convert Array into stream and then call foreach
																	// on every element
				.forEach(System.out::println);// we call Class::method and this is a
												// method refference
	}

	private static void printFilteredCoursesByLenghtInListFunctional(List<String> courses) {
		// what to do?
		// convert list of number into stream of numbers
		courses.stream().filter(course -> course.length() >= 4)// convert Array into stream and then call foreach on
																// every element
				.forEach(System.out::println);// we call Class::method and this is a
												// method refference
	}

	private static void printSquaresForEvenNumbers(List<Integer> numbers) {

		numbers.stream()
		.filter(number -> number % 2 == 0)
		.map(number -> number * number)
		.forEach(System.out::println);

	}
	private static void printSquaresForOddNumbers(List<Integer> numbers) {
		
		numbers.stream()
		.filter(number -> number % 2 != 0)
		.map(number -> number * number)
		.forEach(System.out::println);
		
	}

	private static void printNumberOfCharactersInEachCourseName(List<String> courses) {
		courses.stream()
		.map(course->course+ " " +course.length())
		.forEach(System.out::println);
	}
}
