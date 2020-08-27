package programming;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

class Course {
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;

	public Course(String name, String category, int reviewScore, int noOfStudents) {
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", category=" + category + ", reviewScore=" + reviewScore + ", noOfStudents="
				+ noOfStudents + "]";
	}

}

public class FP04CustomClass {

	public static void main(String[] args) {
		List<Course> courses = List.of(
				new Course("Spring", "Framework", 98, 20000),
				new Course("Spring Boot", "Framework", 95, 18000),
				new Course("API", "Microservices", 97, 22000),
				new Course("Microservices", "Microservices", 96, 25000),
				new Course("Fullstack", "Fullstack", 91, 14000),
				new Course("AWS", "Cloud", 92, 21000),
				new Course("Azure", "Cloud", 99, 21000),
				new Course("Docker", "Cloud", 98, 20000),
				new Course("Kubernetes", "Cloud", 98, 20000)
		);
		
		List<String> coursesSimpleList = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");

		Predicate<Course> reviewScoreGreaterThan95Predicate = course->course.getReviewScore()>95;
//		Predicate<Course> reviewScoreGreaterThan90Predicate = course->course.getReviewScore()>90;
//		Predicate<Course> reviewScoreLessThan90Predicate = course->course.getReviewScore()<90;
//
//		Predicate<Course> numberOfStudentsGreaterThan20000Predicate = course->course.getNoOfStudents()>20000;
//		Predicate<Course> numberOfStudentsLessThan18000Predicate = course->course.getNoOfStudents()<18000;
//		Predicate<Course> numberOfStudentsLessThan15000Predicate = course->course.getNoOfStudents()<15000;
//		
//		System.out.println(courses.stream().allMatch(reviewScoreGreaterThan95Predicate));
//		System.out.println(courses.stream().noneMatch(reviewScoreLessThan90Predicate));
//		System.out.println(courses.stream().anyMatch(reviewScoreLessThan90Predicate));
//
//		System.out.println(courses.stream().anyMatch(numberOfStudentsGreaterThan20000Predicate));
//		System.out.println(courses.stream().anyMatch(numberOfStudentsLessThan18000Predicate));
//		System.out.println(courses.stream().anyMatch(numberOfStudentsLessThan15000Predicate));
		
//		Comparator<Course> comparingByNoStudentsIncreasing = (Comparator.comparingInt(Course::getNoOfStudents));
//		
//		courses.stream()
//			.sorted(comparingByNoStudentsIncreasing)
//			.collect(Collectors.toList())
//			.forEach(System.out::println);
		
//		System.out.println();
//		
//		Comparator<Course> comparingByNoStudentsDecreasing = (Comparator.comparingInt(Course::getNoOfStudents).reversed());
//
//		courses.stream()
//			.sorted(comparingByNoStudentsDecreasing)
//			.collect(Collectors.toList())
//			.forEach(System.out::println);

//		System.out.println();
		
		Comparator<Course> comparingByNoStudentsAndNoOfReviewsReversed = (Comparator.comparingInt(Course::getNoOfStudents)
																			.thenComparingInt(Course::getReviewScore).reversed());
//		courses.stream()
//		.sorted(comparingByNoStudentsAndNoOfReviewsReversed)
//		.collect(Collectors.toList())
//		.forEach(System.out::println);
//	
//		System.out.println();
//
//		courses.stream()
//		.sorted(comparingByNoStudentsAndNoOfReviewsReversed)
//		.limit(5)
//		.collect(Collectors.toList())
//		.forEach(System.out::println);

//		System.out.println();
		
//		courses.stream()
//		.sorted(comparingByNoStudentsAndNoOfReviewsReversed)
//		.skip(3)
//		.limit(6)
//		.collect(Collectors.toList())
//		.forEach(System.out::println);
		
		
//		//it takes elements until it find proper critieria to stop
//		courses.stream()
//			.takeWhile(course->course.getReviewScore()>=95)
//			.collect(Collectors.toList())
//			.forEach(System.out::println);

		//as long as this condition is true it will keep droping elements, then it will stop and return rest of them
//		courses.stream()
//			.dropWhile(course->course.getReviewScore()>=95)
//			.collect(Collectors.toList())
//			.forEach(System.out::println);
		
		//returns maximum element from the list
//		System.out.println(courses.stream().max(comparingByNoStudentsAndNoOfReviewsReversed));
//		System.out.println(courses.stream().min(comparingByNoStudentsAndNoOfReviewsReversed));
//		System.out.println(courses.stream().findAny());
//		System.out.println(courses.stream().findFirst());
//		System.out.println(courses.stream().filter(reviewScoreGreaterThan95Predicate)
//											.mapToInt(Course::getNoOfStudents)
//											.sum());
//		System.out.println(courses.stream().filter(reviewScoreGreaterThan95Predicate)
//											.mapToInt(Course::getNoOfStudents)
//											.average());
//		System.out.println(courses.stream().filter(reviewScoreGreaterThan95Predicate)
//											.mapToInt(Course::getNoOfStudents)
//											.min());
//		System.out.println(courses.stream().filter(reviewScoreGreaterThan95Predicate)
//											.mapToInt(Course::getNoOfStudents)
//											.max());
		
//		System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory)));
//		System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory, Collectors.counting())));
//		System.out.println(courses.stream().collect(Collectors
//											.groupingBy(Course::getCategory, 
//											Collectors.maxBy(Comparator.comparing(Course::getReviewScore)))));
		
//		System.out.println(courses.stream().collect(Collectors
//				.groupingBy(Course::getCategory, 
//				Collectors.mapping(Course::getName, Collectors.toList()))));
		
		
//	System.out.println(Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15).count());//we will have unboxing and autoboxing here and it's not efficent
	
//	IntStream.of(1,3,4,5).forEach(System.out::print);//here we will have primitive types, more about how to check it is in 33and34 episode of Course
////	1345
//	System.out.println();
//	IntStream.range(1,15).forEach(System.out::print);
////	1234567891011121314
//	System.out.println();
//	IntStream.rangeClosed(1,15).forEach(System.out::print);
////	123456789101112131415
//	System.out.println();
//	IntStream.iterate(1, e->e+2).limit(10).peek(System.out::print).sum();
////	135791113151719
//	System.out.println();
//	IntStream.iterate(2, e->e+2).filter(x->x%2==0).limit(10).peek(System.out::print).sum();//in this specific situation filter is not necessary 
//																							//	to get even numbers
////	2468101214161820
//	System.out.println();
//	IntStream.iterate(2, e->e*2).limit(10).peek(System.out::print).sum();
//	
////	2481632641282565121024
//	System.out.println();
//	IntStream.iterate(2, e->e*2).limit(10).boxed().collect(Collectors.toList()).forEach(System.out::print);//boxed is needen to box primitive types
//																											//because collections directly store only objects
//	System.out.println(LongStream.rangeClosed(1, 50).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply));
////	248163264128256512102430414093201713378043612608166064768844377641568960512000000000000
//	
//	System.out.println(coursesSimpleList.stream().collect(Collectors.joining(" ")));
////	Spring Spring Boot API Microservices AWS PCF Azure Docker Kubernetes
//	
//	System.out.println(coursesSimpleList.stream().collect(Collectors.joining(", ")));
////	Spring, Spring Boot, API, Microservices, AWS, PCF, Azure, Docker, Kubernetes
//	
//	System.out.println(coursesSimpleList.stream().map(course -> course.split("")).flatMap(Arrays::stream).collect(Collectors.toList()));
////	[S, p, r, i, n, g, S, p, r, i, n, g,  , B, o, o, t, A, P, I, M, i, c, r, o, s, e, r, v, i, c, e, s, A, W, S, P, C, F, A, z, u, r, e, D, o, c, k, e, r, K, u, b, e, r, n, e, t, e, s]
//	
//	System.out.println(coursesSimpleList.stream().map(course -> course.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList()));
////	[S, p, r, i, n, g,  , B, o, t, A, P, I, M, c, s, e, v, W, C, F, z, u, D, k, K, b]
//	
//	List<String> coursesSimpleList2 = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
//			"Kubernetes");
//	//joins each element from one list with each element from other list
//	System.out.println(coursesSimpleList.stream().flatMap(course->coursesSimpleList2.stream().map(course2-> List.of(course,course2))).collect(Collectors.toList()));
//System.out.println();
//	//same as above with distinct pairs
//	System.out.println(coursesSimpleList.stream().flatMap(course->coursesSimpleList2.stream().map(course2-> List.of(course,course2))).filter(list->!list.get(0).equals(list.get(1))).collect(Collectors.toList()));
//
//	System.out.println();
//	//with filter based on length
//	System.out.println(coursesSimpleList.stream().flatMap(course->coursesSimpleList2.stream().filter(course2->course2.length()==course.length()).map(course2-> List.of(course,course2))).filter(list->!list.get(0).equals(list.get(1))).collect(Collectors.toList()));
	
	
	
	Predicate<Course> reviewScoreGreaterThan95Predicate2 = createPredicateWithCutoffReviewScore(95);
	Predicate<Course> reviewScoreGreaterThan90Predicate2 = createPredicateWithCutoffReviewScore(90);
	
	
	coursesSimpleList.stream()
		.peek(System.out::println)
		.filter(course->course.length()>11)
		.map(String::toUpperCase)
		.peek(System.out::println)
		.findFirst();
	
	}
	
	//higher order functions return other functions as return value
	private static Predicate<Course> createPredicateWithCutoffReviewScore(int cutoffReviwScore) {
		return course->course.getReviewScore()>cutoffReviwScore;
	
		
	}
	
	
	
	
}

