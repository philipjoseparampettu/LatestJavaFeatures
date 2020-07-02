package pj.java8.lamda.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

/**
 * The real benefit here (of functional programming ) isn’t just in the APIs
 * that enable us to do comparisons, but the ability to pass bits of executable
 * code (and then combine them in new and interesting ways) to create
 * opportunities for reuse and design.
 * 
 * @author philip
 *
 */
public class FuntionalProgramming {
	public static void main(String... args) {
		List<Person> people = Arrays.asList(new Person("Ted", "Neward", 42), new Person("Charlotte", "Neward", 39),
				new Person("Michael", "Neward", 19), new Person("Matthew", "Neward", 13),
				new Person("Neal", "Ford", 45), new Person("Candy", "Ford", 39), new Person("Jeff", "Brown", 43),
				new Person("Betsy", "Brown", 39));

		// notice the then comparing - this allows us to add any combination of
		// comparing logic from this class itself.
		// new with java 8. we can string in more functionality also.
		Collections.sort(people, Person.BY_LAST.thenComparing(Person.BY_AGE));
		// old way
//		for (Person p : people)
//			System.out.println(p);

		people.forEach((it) -> System.out.println("Person: " + it));

		System.out.println("***********************");
		// or
		Collections.sort(people, Comparator.comparing(Person::getLastName).thenComparing(Person::getAge));

		// old iteration approach
//		for (Person p : people)
//			System.out.println(p);

		// people.forEach((it) -> System.out.println("Person: " + it));
		// people.stream().forEach((it) -> System.out.println("Person: " + it));
		System.out.println("***********************");

		// NB
		// 1. use stream - chaining operation
		// 2. use of filter
		// 3. combining predicates we can also use .Or or .XOR
		// 4. Parallel Stream tries to use fork join frame work to make max use of all
		// cores and complete everything ASAP
		Predicate<Person> drinkingAge = (it) -> it.getAge() >= 21;
		Predicate<Person> brown = (it) -> it.getLastName().equals("Brown");
		people.parallelStream().filter(drinkingAge.and(brown))
				.forEach((it) -> System.out.println("Have a beer, " + it.getFirstName()));

		// Map and reduce

		// Mapping
		IntStream ages = people.stream().mapToInt((it) -> it.getAge());

		// reduce
		int sum = people.stream().mapToInt(Person::getAge).sum();
		System.out.println(" sum : " + sum);

		String xml = "<people data='lastname'>"
				+ people.stream().map(it -> "<person>" + it.getLastName() + "</person>").reduce("", String::concat)
				+ "</people>";
		System.out.println(xml);

		// See also
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);
		int sum1 = values.stream().reduce(0, (l, r) -> l + r);
		System.out.println(sum1);

	}

}
