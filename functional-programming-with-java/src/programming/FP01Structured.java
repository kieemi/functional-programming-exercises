package programming;

import java.util.List;

import javax.print.event.PrintEvent;

public class FP01Structured {

	public static void main(String[] args) {

		printEvenNumbersInListStructured(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));

	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		for (Integer integer : numbers) {
			System.out.println(integer);
		}
	}

	private static void printEvenNumbersInListStructured(List<Integer> numbers) {
		for (Integer integer : numbers) {
			if (integer % 2 == 0)
				System.out.println(integer);
		}

	}

}
