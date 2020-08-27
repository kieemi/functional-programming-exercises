package programming;

import java.util.ArrayList;
import java.util.List;

public class Section8firstepisode {
	
	
	public static void main(String[] args) {
	
		List<String> courses= List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");
		
//		this will give an error
//		courses.replaceAll(str->str.toUpperCase());
		

		List<String> modyfyableCoursesStrings = new ArrayList(courses);
		
		modyfyableCoursesStrings.replaceAll(str->str.toUpperCase().toString());
		
//		[SPRING, SPRING BOOT, API, MICROSERVICES, AWS, PCF, AZURE, DOCKER, KUBERNETES]
		System.out.println(modyfyableCoursesStrings.toString());
		
		modyfyableCoursesStrings.removeIf(course->course.length()<6);
	
//		[SPRING, SPRING BOOT, MICROSERVICES, DOCKER, KUBERNETES]
		System.out.println(modyfyableCoursesStrings.toString());
	}
	

}
